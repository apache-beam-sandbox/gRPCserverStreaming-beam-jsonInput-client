# gRPCserverStreaming-beam-jsonInput-client
1. Client side code for sending the request to server for reading the file and sending the response in streams.
2. Sending the file path in request to server.
3. Receiving the response from the server line by line and then putting it in the list.
4. Then using the beam transforms to map the list into the java object.
5. Then applying transforms to get the all userId's from the object and writing it to the txt file.
6. Please download the server side code also from https://github.com/apache-beam-sandbox/gRPCserverStreaming-beam-jsonInput-server.git to make the project fully functional.
7. Before running the client please run the server.
