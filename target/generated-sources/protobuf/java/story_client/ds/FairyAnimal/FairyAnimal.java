// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FairyAnimal.proto

package story_client.ds.FairyAnimal;

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
    internal_static_story_client_ds_FairyAnimal_FairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_FairyAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_FairyAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_FairyAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_AllFairyAnimalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_FairyAnimalByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_FairyAnimalByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_FairyAnimal_DeleteFairyAnimalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_FairyAnimal_DeleteFairyAnimalResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FairyAnimal.proto\022\033story_client.ds.Fai" +
      "ryAnimal\"Q\n\023FairyAnimalResponse\022\n\n\002id\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\022\016\n\006energy\030\003 \001(\005\022\020\n\010siz" +
      "eMind\030\004 \001(\005\"D\n\022FairyAnimalRequest\022\014\n\004nam" +
      "e\030\002 \001(\t\022\016\n\006energy\030\003 \001(\005\022\020\n\010sizeMind\030\004 \001(" +
      "\005\"\027\n\025AllFairyAnimalRequest\"_\n\026AllFairyAn" +
      "imalResponse\022E\n\013FairyAnimal\030\001 \003(\01320.stor" +
      "y_client.ds.FairyAnimal.FairyAnimalRespo" +
      "nse\"$\n\026FairyAnimalByIdRequest\022\n\n\002id\030\001 \001(" +
      "\t\"(\n\030FairyAnimalByNameRequest\022\014\n\004name\030\001 " +
      "\001(\t\"\033\n\031DeleteFairyAnimalResponse2\307\004\n\022Fai" +
      "ryAnimalService\022n\n\003all\0222.story_client.ds" +
      ".FairyAnimal.AllFairyAnimalRequest\0323.sto" +
      "ry_client.ds.FairyAnimal.AllFairyAnimalR" +
      "esponse\022h\n\003add\022/.story_client.ds.FairyAn" +
      "imal.FairyAnimalRequest\0320.story_client.d" +
      "s.FairyAnimal.FairyAnimalResponse\022m\n\004byI" +
      "d\0223.story_client.ds.FairyAnimal.FairyAni" +
      "malByIdRequest\0320.story_client.ds.FairyAn" +
      "imal.FairyAnimalResponse\022q\n\006byName\0225.sto" +
      "ry_client.ds.FairyAnimal.FairyAnimalByNa" +
      "meRequest\0320.story_client.ds.FairyAnimal." +
      "FairyAnimalResponse\022u\n\006delete\0223.story_cl" +
      "ient.ds.FairyAnimal.FairyAnimalByIdReque" +
      "st\0326.story_client.ds.FairyAnimal.DeleteF" +
      "airyAnimalResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_story_client_ds_FairyAnimal_FairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_story_client_ds_FairyAnimal_FairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_FairyAnimalResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Energy", "SizeMind", });
    internal_static_story_client_ds_FairyAnimal_FairyAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_story_client_ds_FairyAnimal_FairyAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_FairyAnimalRequest_descriptor,
        new java.lang.String[] { "Name", "Energy", "SizeMind", });
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_AllFairyAnimalRequest_descriptor,
        new java.lang.String[] { });
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_story_client_ds_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_AllFairyAnimalResponse_descriptor,
        new java.lang.String[] { "FairyAnimal", });
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_FairyAnimalByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_story_client_ds_FairyAnimal_FairyAnimalByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_FairyAnimalByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_story_client_ds_FairyAnimal_DeleteFairyAnimalResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_story_client_ds_FairyAnimal_DeleteFairyAnimalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_FairyAnimal_DeleteFairyAnimalResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
