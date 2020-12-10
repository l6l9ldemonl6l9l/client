// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deity.proto

package story_client.ds.Deity;

public final class Deity {
  private Deity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_DeityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_DeityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_DeityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_DeityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_AllDeityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_AllDeityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_AllDeityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_AllDeityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_DeityByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_DeityByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_DeityByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_DeityByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Deity_DeleteDeityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Deity_DeleteDeityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013deity.proto\022\025story_client.ds.Deity\"6\n\r" +
      "DeityResponse\022\n\n\002id\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\014" +
      "\n\004name\030\003 \001(\t\")\n\014DeityRequest\022\013\n\003age\030\002 \001(" +
      "\005\022\014\n\004name\030\003 \001(\t\"\021\n\017AllDeityRequest\"G\n\020Al" +
      "lDeityResponse\0223\n\005Deity\030\001 \003(\0132$.story_cl" +
      "ient.ds.Deity.DeityResponse\"\036\n\020DeityById" +
      "Request\022\n\n\002id\030\001 \001(\t\"\"\n\022DeityByNameReques" +
      "t\022\014\n\004name\030\001 \001(\t\"\025\n\023DeleteDeityResponse2\311" +
      "\003\n\014DeityService\022V\n\003all\022&.story_client.ds" +
      ".Deity.AllDeityRequest\032\'.story_client.ds" +
      ".Deity.AllDeityResponse\022P\n\003add\022#.story_c" +
      "lient.ds.Deity.DeityRequest\032$.story_clie" +
      "nt.ds.Deity.DeityResponse\022U\n\004byId\022\'.stor" +
      "y_client.ds.Deity.DeityByIdRequest\032$.sto" +
      "ry_client.ds.Deity.DeityResponse\022Y\n\006byNa" +
      "me\022).story_client.ds.Deity.DeityByNameRe" +
      "quest\032$.story_client.ds.Deity.DeityRespo" +
      "nse\022]\n\006delete\022\'.story_client.ds.Deity.De" +
      "ityByIdRequest\032*.story_client.ds.Deity.D" +
      "eleteDeityResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_story_client_ds_Deity_DeityResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_story_client_ds_Deity_DeityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_DeityResponse_descriptor,
        new java.lang.String[] { "Id", "Age", "Name", });
    internal_static_story_client_ds_Deity_DeityRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_story_client_ds_Deity_DeityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_DeityRequest_descriptor,
        new java.lang.String[] { "Age", "Name", });
    internal_static_story_client_ds_Deity_AllDeityRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_story_client_ds_Deity_AllDeityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_AllDeityRequest_descriptor,
        new java.lang.String[] { });
    internal_static_story_client_ds_Deity_AllDeityResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_story_client_ds_Deity_AllDeityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_AllDeityResponse_descriptor,
        new java.lang.String[] { "Deity", });
    internal_static_story_client_ds_Deity_DeityByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_story_client_ds_Deity_DeityByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_DeityByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_story_client_ds_Deity_DeityByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_story_client_ds_Deity_DeityByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_DeityByNameRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_story_client_ds_Deity_DeleteDeityResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_story_client_ds_Deity_DeleteDeityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Deity_DeleteDeityResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
