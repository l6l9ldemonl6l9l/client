package story_client.ds.Food;

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
    comments = "Source: food.proto")
public final class FoodServiceGrpc {

  private FoodServiceGrpc() {}

  public static final String SERVICE_NAME = "story_client.ds.Food.FoodService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<story_client.ds.Food.AllFoodRequest,
      story_client.ds.Food.AllFoodResponse> getAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "all",
      requestType = story_client.ds.Food.AllFoodRequest.class,
      responseType = story_client.ds.Food.AllFoodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Food.AllFoodRequest,
      story_client.ds.Food.AllFoodResponse> getAllMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Food.AllFoodRequest, story_client.ds.Food.AllFoodResponse> getAllMethod;
    if ((getAllMethod = FoodServiceGrpc.getAllMethod) == null) {
      synchronized (FoodServiceGrpc.class) {
        if ((getAllMethod = FoodServiceGrpc.getAllMethod) == null) {
          FoodServiceGrpc.getAllMethod = getAllMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Food.AllFoodRequest, story_client.ds.Food.AllFoodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.AllFoodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.AllFoodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodServiceMethodDescriptorSupplier("all"))
              .build();
        }
      }
    }
    return getAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Food.FoodRequest,
      story_client.ds.Food.FoodResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = story_client.ds.Food.FoodRequest.class,
      responseType = story_client.ds.Food.FoodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Food.FoodRequest,
      story_client.ds.Food.FoodResponse> getAddMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Food.FoodRequest, story_client.ds.Food.FoodResponse> getAddMethod;
    if ((getAddMethod = FoodServiceGrpc.getAddMethod) == null) {
      synchronized (FoodServiceGrpc.class) {
        if ((getAddMethod = FoodServiceGrpc.getAddMethod) == null) {
          FoodServiceGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Food.FoodRequest, story_client.ds.Food.FoodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodServiceMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest,
      story_client.ds.Food.FoodResponse> getByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byId",
      requestType = story_client.ds.Food.FoodByIdRequest.class,
      responseType = story_client.ds.Food.FoodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest,
      story_client.ds.Food.FoodResponse> getByIdMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest, story_client.ds.Food.FoodResponse> getByIdMethod;
    if ((getByIdMethod = FoodServiceGrpc.getByIdMethod) == null) {
      synchronized (FoodServiceGrpc.class) {
        if ((getByIdMethod = FoodServiceGrpc.getByIdMethod) == null) {
          FoodServiceGrpc.getByIdMethod = getByIdMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Food.FoodByIdRequest, story_client.ds.Food.FoodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodServiceMethodDescriptorSupplier("byId"))
              .build();
        }
      }
    }
    return getByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Food.FoodByNameRequest,
      story_client.ds.Food.FoodResponse> getByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "byName",
      requestType = story_client.ds.Food.FoodByNameRequest.class,
      responseType = story_client.ds.Food.FoodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Food.FoodByNameRequest,
      story_client.ds.Food.FoodResponse> getByNameMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Food.FoodByNameRequest, story_client.ds.Food.FoodResponse> getByNameMethod;
    if ((getByNameMethod = FoodServiceGrpc.getByNameMethod) == null) {
      synchronized (FoodServiceGrpc.class) {
        if ((getByNameMethod = FoodServiceGrpc.getByNameMethod) == null) {
          FoodServiceGrpc.getByNameMethod = getByNameMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Food.FoodByNameRequest, story_client.ds.Food.FoodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "byName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodByNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodServiceMethodDescriptorSupplier("byName"))
              .build();
        }
      }
    }
    return getByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest,
      story_client.ds.Food.DeleteFoodResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = story_client.ds.Food.FoodByIdRequest.class,
      responseType = story_client.ds.Food.DeleteFoodResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest,
      story_client.ds.Food.DeleteFoodResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<story_client.ds.Food.FoodByIdRequest, story_client.ds.Food.DeleteFoodResponse> getDeleteMethod;
    if ((getDeleteMethod = FoodServiceGrpc.getDeleteMethod) == null) {
      synchronized (FoodServiceGrpc.class) {
        if ((getDeleteMethod = FoodServiceGrpc.getDeleteMethod) == null) {
          FoodServiceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<story_client.ds.Food.FoodByIdRequest, story_client.ds.Food.DeleteFoodResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.FoodByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  story_client.ds.Food.DeleteFoodResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodServiceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FoodServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodServiceStub>() {
        @java.lang.Override
        public FoodServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodServiceStub(channel, callOptions);
        }
      };
    return FoodServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FoodServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodServiceBlockingStub>() {
        @java.lang.Override
        public FoodServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodServiceBlockingStub(channel, callOptions);
        }
      };
    return FoodServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FoodServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodServiceFutureStub>() {
        @java.lang.Override
        public FoodServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodServiceFutureStub(channel, callOptions);
        }
      };
    return FoodServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FoodServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void all(story_client.ds.Food.AllFoodRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.AllFoodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllMethod(), responseObserver);
    }

    /**
     */
    public void add(story_client.ds.Food.FoodRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void byId(story_client.ds.Food.FoodByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByIdMethod(), responseObserver);
    }

    /**
     */
    public void byName(story_client.ds.Food.FoodByNameRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getByNameMethod(), responseObserver);
    }

    /**
     */
    public void delete(story_client.ds.Food.FoodByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.DeleteFoodResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Food.AllFoodRequest,
                story_client.ds.Food.AllFoodResponse>(
                  this, METHODID_ALL)))
          .addMethod(
            getAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Food.FoodRequest,
                story_client.ds.Food.FoodResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Food.FoodByIdRequest,
                story_client.ds.Food.FoodResponse>(
                  this, METHODID_BY_ID)))
          .addMethod(
            getByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Food.FoodByNameRequest,
                story_client.ds.Food.FoodResponse>(
                  this, METHODID_BY_NAME)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                story_client.ds.Food.FoodByIdRequest,
                story_client.ds.Food.DeleteFoodResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class FoodServiceStub extends io.grpc.stub.AbstractAsyncStub<FoodServiceStub> {
    private FoodServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodServiceStub(channel, callOptions);
    }

    /**
     */
    public void all(story_client.ds.Food.AllFoodRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.AllFoodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(story_client.ds.Food.FoodRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byId(story_client.ds.Food.FoodByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void byName(story_client.ds.Food.FoodByNameRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(story_client.ds.Food.FoodByIdRequest request,
        io.grpc.stub.StreamObserver<story_client.ds.Food.DeleteFoodResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FoodServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FoodServiceBlockingStub> {
    private FoodServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public story_client.ds.Food.AllFoodResponse all(story_client.ds.Food.AllFoodRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Food.FoodResponse add(story_client.ds.Food.FoodRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Food.FoodResponse byId(story_client.ds.Food.FoodByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Food.FoodResponse byName(story_client.ds.Food.FoodByNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public story_client.ds.Food.DeleteFoodResponse delete(story_client.ds.Food.FoodByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FoodServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FoodServiceFutureStub> {
    private FoodServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Food.AllFoodResponse> all(
        story_client.ds.Food.AllFoodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Food.FoodResponse> add(
        story_client.ds.Food.FoodRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Food.FoodResponse> byId(
        story_client.ds.Food.FoodByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Food.FoodResponse> byName(
        story_client.ds.Food.FoodByNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<story_client.ds.Food.DeleteFoodResponse> delete(
        story_client.ds.Food.FoodByIdRequest request) {
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
    private final FoodServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FoodServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL:
          serviceImpl.all((story_client.ds.Food.AllFoodRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Food.AllFoodResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((story_client.ds.Food.FoodRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse>) responseObserver);
          break;
        case METHODID_BY_ID:
          serviceImpl.byId((story_client.ds.Food.FoodByIdRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse>) responseObserver);
          break;
        case METHODID_BY_NAME:
          serviceImpl.byName((story_client.ds.Food.FoodByNameRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Food.FoodResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((story_client.ds.Food.FoodByIdRequest) request,
              (io.grpc.stub.StreamObserver<story_client.ds.Food.DeleteFoodResponse>) responseObserver);
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

  private static abstract class FoodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FoodServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return story_client.ds.Food.Food.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FoodService");
    }
  }

  private static final class FoodServiceFileDescriptorSupplier
      extends FoodServiceBaseDescriptorSupplier {
    FoodServiceFileDescriptorSupplier() {}
  }

  private static final class FoodServiceMethodDescriptorSupplier
      extends FoodServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FoodServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FoodServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FoodServiceFileDescriptorSupplier())
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
