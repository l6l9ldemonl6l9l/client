package story_client.ds.Deity;

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
    value = "by gRPC proto compiler (version 1.33.0)",
    comments = "Source: deity.proto")
public final class DeityServiceGrpc {

  private DeityServiceGrpc() {}

  public static final String SERVICE_NAME = "story_client.ds.Deity.DeityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<story_client.ds.Deity.AllDeityRequest,
      story_client.ds.Deity.AllDeityResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = story_client.ds.Deity.AllDeityRequest.class,
      responseType = story_client.ds.Deity.AllDeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Deity.AllDeityRequest,
      story_client.ds.Deity.AllDeityResponse> getAllMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Deity.AllDeityRequest, story_client.ds.Deity.AllDeityResponse> getAllMethod;
    if ((getAllMethod = DeityServiceGrpc.getAllMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getAllMethod = DeityServiceGrpc.getAllMethod) == null) {
          DeityServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Deity.AllDeityRequest, story_client.ds.Deity.AllDeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.AllDeityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.AllDeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Deity.DeityRequest,
      story_client.ds.Deity.DeityResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = story_client.ds.Deity.DeityRequest.class,
      responseType = story_client.ds.Deity.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Deity.DeityRequest,
      story_client.ds.Deity.DeityResponse> getAddMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Deity.DeityRequest, story_client.ds.Deity.DeityResponse> getAddMethod;
    if ((getAddMethod = DeityServiceGrpc.getAddMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getAddMethod = DeityServiceGrpc.getAddMethod) == null) {
          DeityServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Deity.DeityRequest, story_client.ds.Deity.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest,
      story_client.ds.Deity.DeityResponse> getByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byId",
      requestType = story_client.ds.Deity.DeityByIdRequest.class,
      responseType = story_client.ds.Deity.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest,
      story_client.ds.Deity.DeityResponse> getByIdMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest, story_client.ds.Deity.DeityResponse> getByIdMethod;
    if ((getByIdMethod = DeityServiceGrpc.getByIdMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getByIdMethod = DeityServiceGrpc.getByIdMethod) == null) {
          DeityServiceGrpc.getByIdMethod = getByIdMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Deity.DeityByIdRequest, story_client.ds.Deity.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("byId"))
              .build();
        }
      }
    }
    return getByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByNameRequest,
      story_client.ds.Deity.DeityResponse> getByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byName",
      requestType = story_client.ds.Deity.DeityByNameRequest.class,
      responseType = story_client.ds.Deity.DeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByNameRequest,
      story_client.ds.Deity.DeityResponse> getByNameMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByNameRequest, story_client.ds.Deity.DeityResponse> getByNameMethod;
    if ((getByNameMethod = DeityServiceGrpc.getByNameMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getByNameMethod = DeityServiceGrpc.getByNameMethod) == null) {
          DeityServiceGrpc.getByNameMethod = getByNameMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Deity.DeityByNameRequest, story_client.ds.Deity.DeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("byName"))
              .build();
        }
      }
    }
    return getByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest,
      story_client.ds.Deity.DeleteDeityResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = story_client.ds.Deity.DeityByIdRequest.class,
      responseType = story_client.ds.Deity.DeleteDeityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest,
      story_client.ds.Deity.DeleteDeityResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Deity.DeityByIdRequest, story_client.ds.Deity.DeleteDeityResponse> getDeleteMethod;
    if ((getDeleteMethod = DeityServiceGrpc.getDeleteMethod) == null) {
      synchronized (DeityServiceGrpc.class) {
        if ((getDeleteMethod = DeityServiceGrpc.getDeleteMethod) == null) {
          DeityServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Deity.DeityByIdRequest, story_client.ds.Deity.DeleteDeityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeityByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Deity.DeleteDeityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeityServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceStub>() {
        @java.lang.Override
        public DeityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceStub(channel, callOptions);
        }
      };
    return DeityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceBlockingStub>() {
        @java.lang.Override
        public DeityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceBlockingStub(channel, callOptions);
        }
      };
    return DeityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeityServiceFutureStub>() {
        @java.lang.Override
        public DeityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeityServiceFutureStub(channel, callOptions);
        }
      };
    return DeityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(story_client.ds.Deity.AllDeityRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.AllDeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void add(story_client.ds.Deity.DeityRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void byId(story_client.ds.Deity.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByIdMethod(), responseObserver);
    }

    /**
     */
    public void byName(story_client.ds.Deity.DeityByNameRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByNameMethod(), responseObserver);
    }

    /**
     */
    public void delete(story_client.ds.Deity.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeleteDeityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Deity.AllDeityRequest,
                story_client.ds.Deity.AllDeityResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Deity.DeityRequest,
                story_client.ds.Deity.DeityResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Deity.DeityByIdRequest,
                story_client.ds.Deity.DeityResponse>(
                  this, METHODID_BY_ID)))
          .addMethod(
            getByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Deity.DeityByNameRequest,
                story_client.ds.Deity.DeityResponse>(
                  this, METHODID_BY_NAME)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Deity.DeityByIdRequest,
                story_client.ds.Deity.DeleteDeityResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class DeityServiceStub extends io.grpc.stub.AbstractAsyncStub<DeityServiceStub> {
    private DeityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(story_client.ds.Deity.AllDeityRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.AllDeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(story_client.ds.Deity.DeityRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byId(story_client.ds.Deity.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byName(story_client.ds.Deity.DeityByNameRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(story_client.ds.Deity.DeityByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Deity.DeleteDeityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeityServiceBlockingStub> {
    private DeityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public story_client.ds.Deity.AllDeityResponse all(story_client.ds.Deity.AllDeityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Deity.DeityResponse add(story_client.ds.Deity.DeityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Deity.DeityResponse byId(story_client.ds.Deity.DeityByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Deity.DeityResponse byName(story_client.ds.Deity.DeityByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Deity.DeleteDeityResponse delete(story_client.ds.Deity.DeityByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeityServiceFutureStub> {
    private DeityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Deity.AllDeityResponse> all(
        story_client.ds.Deity.AllDeityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Deity.DeityResponse> add(
        story_client.ds.Deity.DeityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Deity.DeityResponse> byId(
        story_client.ds.Deity.DeityByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Deity.DeityResponse> byName(
        story_client.ds.Deity.DeityByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Deity.DeleteDeityResponse> delete(
        story_client.ds.Deity.DeityByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_BY_ID = 2;
  private static final int METHODID_BY_NAME = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((story_client.ds.Deity.AllDeityRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Deity.AllDeityResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((story_client.ds.Deity.DeityRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse>) responseObserver);
          break;
        case METHODID_BY_ID:
          serviceImpl.byId((story_client.ds.Deity.DeityByIdRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse>) responseObserver);
          break;
        case METHODID_BY_NAME:
          serviceImpl.byName((story_client.ds.Deity.DeityByNameRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Deity.DeityResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((story_client.ds.Deity.DeityByIdRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Deity.DeleteDeityResponse>) responseObserver);
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

  private static abstract class DeityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return story_client.ds.Deity.Deity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeityService");
    }
  }

  private static final class DeityServiceFileDescriptorSupplier
      extends DeityServiceBaseDescriptorSupplier {
    DeityServiceFileDescriptorSupplier() {}
  }

  private static final class DeityServiceMethodDescriptorSupplier
      extends DeityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeityServiceFileDescriptorSupplier())
              .addMethod(getAllMethod())
              .addMethod(getAddMethod())
              .addMethod(getByIdMethod())
              .addMethod(getByNameMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
