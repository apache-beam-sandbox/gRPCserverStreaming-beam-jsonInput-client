package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileReaderClient {

    private static final Logger LOG = LoggerFactory.getLogger(FileReaderClient.class);
    public static ManagedChannel getChannelInstance(){
        System.out.println("Eastablishing connection with server");
        ManagedChannel channel = null;
        try {
             channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                    .usePlaintext()
                    .build();
        }catch (Exception ex){
            System.out.println("Exception occurred while establishing connection"+ex.getMessage());
        }
        return channel;

    }
}
