// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FairyAnimal.proto

package distributedsystems.FairyAnimal;

public final class FairyAnimal {
  private FairyAnimal() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_FairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_FairyAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_FairyAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_FairyAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_AllFairyAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_FairyAnimalByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_FairyAnimalByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_distributedsystems_FairyAnimal_DeleteFairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_distributedsystems_FairyAnimal_DeleteFairyAnimalResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FairyAnimal.proto\022\036distributedsystems." +
      "FairyAnimal\"Q\n\023FairyAnimalResponse\022\n\n\002id" +
      "\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006energy\030\003 \001(\005\022\020\n\010" +
      "sizeMind\030\004 \001(\005\"D\n\022FairyAnimalRequest\022\014\n\004" +
      "name\030\002 \001(\t\022\016\n\006energy\030\003 \001(\005\022\020\n\010sizeMind\030\004" +
      " \001(\005\"\027\n\025AllFairyAnimalRequest\"b\n\026AllFair" +
      "yAnimalResponse\022H\n\013FairyAnimal\030\001 \003(\01323.d" +
      "istributedsystems.FairyAnimal.FairyAnima" +
      "lResponse\"$\n\026FairyAnimalByIdRequest\022\n\n\002i" +
      "d\030\001 \001(\t\"(\n\030FairyAnimalByNameRequest\022\014\n\004n" +
      "ame\030\001 \001(\t\"\033\n\031DeleteFairyAnimalResponse2\345" +
      "\004\n\022FairyAnimalService\022t\n\003all\0225.distribut" +
      "edsystems.FairyAnimal.AllFairyAnimalRequ" +
      "est\0326.distributedsystems.FairyAnimal.All" +
      "FairyAnimalResponse\022n\n\003add\0222.distributed" +
      "systems.FairyAnimal.FairyAnimalRequest\0323" +
      ".distributedsystems.FairyAnimal.FairyAni" +
      "malResponse\022s\n\004byId\0226.distributedsystems" +
      ".FairyAnimal.FairyAnimalByIdRequest\0323.di" +
      "stributedsystems.FairyAnimal.FairyAnimal" +
      "Response\022w\n\006byName\0228.distributedsystems." +
      "FairyAnimal.FairyAnimalByNameRequest\0323.d" +
      "istributedsystems.FairyAnimal.FairyAnima" +
      "lResponse\022{\n\006delete\0226.distributedsystems" +
      ".FairyAnimal.FairyAnimalByIdRequest\0329.di" +
      "stributedsystems.FairyAnimal.DeleteFairy" +
      "AnimalResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_distributedsystems_FairyAnimal_FairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_distributedsystems_FairyAnimal_FairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_FairyAnimalResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Energy", "SizeMind", });
    internal_static_distributedsystems_FairyAnimal_FairyAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_distributedsystems_FairyAnimal_FairyAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_FairyAnimalRequest_descriptor,
        new java.lang.String[] { "Name", "Energy", "SizeMind", });
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_AllFairyAnimalRequest_descriptor,
        new java.lang.String[] { });
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor,
        new java.lang.String[] { "FairyAnimal", });
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_FairyAnimalByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_distributedsystems_FairyAnimal_FairyAnimalByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_FairyAnimalByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_distributedsystems_FairyAnimal_DeleteFairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_distributedsystems_FairyAnimal_DeleteFairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_distributedsystems_FairyAnimal_DeleteFairyAnimalResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}