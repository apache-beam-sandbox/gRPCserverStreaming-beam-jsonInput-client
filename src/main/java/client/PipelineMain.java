package client;

import com.fileReader.generated.stubs.FileReaderRequest;
import com.fileReader.generated.stubs.FileReaderServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.coders.SerializableCoder;
import org.apache.beam.sdk.extensions.jackson.ParseJsons;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;
import org.apache.beam.sdk.transforms.MapElements;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.TypeDescriptors;

import java.util.ArrayList;
import java.util.List;

public class PipelineMain {

    public static void main(String[] args) {

            ManagedChannel channel=FileReaderClient.getChannelInstance();

            List<String> inputStreams = new ArrayList<>();
            FileReaderServiceGrpc.FileReaderServiceBlockingStub stub = FileReaderServiceGrpc.newBlockingStub(channel);
            String fileLocation = "./src/main/resources/sampleRest.json";
            //Getting the lines in client as soon as it is read from the server side using server streaming
            try {
                stub.readFile(FileReaderRequest.newBuilder().setFilePath(fileLocation).build())
                        .forEachRemaining(fileReaderResponse -> {
                            // Adding the read lines in String list object to form PCollection once every input is read
                            inputStreams.add(fileReaderResponse.getLine().toString());
                        });
                System.out.println("Successfully captured the response");
                System.out.println("Shutting down channel");
                channel.shutdown();
                //After capturing all the input calling the beam transform.
                PipelineMain.applyTransforms(inputStreams);
            }catch (StatusRuntimeException exception){
                System.out.println("Exception occurred while getting the response from server, reason: "+ exception.getMessage());
                //System.out.println(exception.getCause());
            }catch (Exception ex){
                System.out.println("Exception occurred "+ex.getMessage());
            }
    }

    public static void applyTransforms(List<String> input){
        System.out.println("Started applying Transforms");
        try {
            Pipeline pipeline = Pipeline.create(PipelineOptionsFactory.fromArgs().withValidation().create());
            //Converting the String object into PCollection to apply transform
            PCollection<String> users = pipeline.apply(Create.of(input));
            PCollection<UserDetails> userList = users.apply(ParseJsons.of(UserDetails.class)).setCoder(SerializableCoder.of(UserDetails.class));
            userList.apply(MapElements.into(TypeDescriptors.strings()).via(u -> u.getUserId()))
                    .apply(TextIO.write().to("./src/output/userId.txt").withNumShards(1));
            System.out.println("Completed the operations, please check the output in output folder");
            pipeline.run().waitUntilFinish();
        }catch (Exception exception){
            System.out.println("Exception occurred while performing beam operations"+exception.getMessage());
        }
    }
}
