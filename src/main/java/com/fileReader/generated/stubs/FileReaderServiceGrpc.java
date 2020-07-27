package com.fileReader.generated.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: studentJsonInput.proto")
public final class FileReaderServiceGrpc {

  private FileReaderServiceGrpc() {}

  public static final String SERVICE_NAME = "jsonReader.FileReaderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.fileReader.generated.stubs.FileReaderRequest,
      com.fileReader.generated.stubs.FileReaderResponse> getReadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readFile",
      requestType = com.fileReader.generated.stubs.FileReaderRequest.class,
      responseType = com.fileReader.generated.stubs.FileReaderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.fileReader.generated.stubs.FileReaderRequest,
      com.fileReader.generated.stubs.FileReaderResponse> getReadFileMethod() {
    io.grpc.MethodDescriptor<com.fileReader.generated.stubs.FileReaderRequest, com.fileReader.generated.stubs.FileReaderResponse> getReadFileMethod;
    if ((getReadFileMethod = FileReaderServiceGrpc.getReadFileMethod) == null) {
      synchronized (FileReaderServiceGrpc.class) {
        if ((getReadFileMethod = FileReaderServiceGrpc.getReadFileMethod) == null) {
          FileReaderServiceGrpc.getReadFileMethod = getReadFileMethod = 
              io.grpc.MethodDescriptor.<com.fileReader.generated.stubs.FileReaderRequest, com.fileReader.generated.stubs.FileReaderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "jsonReader.FileReaderService", "readFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fileReader.generated.stubs.FileReaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.fileReader.generated.stubs.FileReaderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FileReaderServiceMethodDescriptorSupplier("readFile"))
                  .build();
          }
        }
     }
     return getReadFileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileReaderServiceStub newStub(io.grpc.Channel channel) {
    return new FileReaderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileReaderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FileReaderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileReaderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FileReaderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FileReaderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readFile(com.fileReader.generated.stubs.FileReaderRequest request,
        io.grpc.stub.StreamObserver<com.fileReader.generated.stubs.FileReaderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadFileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadFileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.fileReader.generated.stubs.FileReaderRequest,
                com.fileReader.generated.stubs.FileReaderResponse>(
                  this, METHODID_READ_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class FileReaderServiceStub extends io.grpc.stub.AbstractStub<FileReaderServiceStub> {
    private FileReaderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileReaderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileReaderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileReaderServiceStub(channel, callOptions);
    }

    /**
     */
    public void readFile(com.fileReader.generated.stubs.FileReaderRequest request,
        io.grpc.stub.StreamObserver<com.fileReader.generated.stubs.FileReaderResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReadFileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FileReaderServiceBlockingStub extends io.grpc.stub.AbstractStub<FileReaderServiceBlockingStub> {
    private FileReaderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileReaderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileReaderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileReaderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.fileReader.generated.stubs.FileReaderResponse> readFile(
        com.fileReader.generated.stubs.FileReaderRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getReadFileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FileReaderServiceFutureStub extends io.grpc.stub.AbstractStub<FileReaderServiceFutureStub> {
    private FileReaderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FileReaderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileReaderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FileReaderServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_READ_FILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileReaderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileReaderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_FILE:
          serviceImpl.readFile((com.fileReader.generated.stubs.FileReaderRequest) request,
              (io.grpc.stub.StreamObserver<com.fileReader.generated.stubs.FileReaderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FileReaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileReaderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.fileReader.generated.stubs.StudentJsonInput.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileReaderService");
    }
  }

  private static final class FileReaderServiceFileDescriptorSupplier
      extends FileReaderServiceBaseDescriptorSupplier {
    FileReaderServiceFileDescriptorSupplier() {}
  }

  private static final class FileReaderServiceMethodDescriptorSupplier
      extends FileReaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileReaderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FileReaderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileReaderServiceFileDescriptorSupplier())
              .addMethod(getReadFileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
