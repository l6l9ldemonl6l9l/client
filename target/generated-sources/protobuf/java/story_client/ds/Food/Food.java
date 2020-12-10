// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: food.proto

package story_client.ds.Food;

public final class Food {
  private Food() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_FoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_FoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_FoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_FoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_AllFoodRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_AllFoodRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_AllFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_AllFoodResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_FoodByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_FoodByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_FoodByNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_FoodByNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_story_client_ds_Food_DeleteFoodResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_story_client_ds_Food_DeleteFoodResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nfood.proto\022\024story_client.ds.Food\";\n\014Fo" +
      "odResponse\022\n\n\002id\030\001 \001(\t\022\r\n\005taste\030\002 \001(\005\022\020\n" +
      "\010kindFood\030\003 \001(\t\".\n\013FoodRequest\022\r\n\005taste\030" +
      "\002 \001(\005\022\020\n\010kindFood\030\003 \001(\t\"\020\n\016AllFoodReques" +
      "t\"C\n\017AllFoodResponse\0220\n\004Food\030\001 \003(\0132\".sto" +
      "ry_client.ds.Food.FoodResponse\"\035\n\017FoodBy" +
      "IdRequest\022\n\n\002id\030\001 \001(\t\"%\n\021FoodByNameReque" +
      "st\022\020\n\010kindFood\030\001 \001(\t\"\024\n\022DeleteFoodRespon" +
      "se2\264\003\n\013FoodService\022R\n\003all\022$.story_client" +
      ".ds.Food.AllFoodRequest\032%.story_client.d" +
      "s.Food.AllFoodResponse\022L\n\003add\022!.story_cl" +
      "ient.ds.Food.FoodRequest\032\".story_client." +
      "ds.Food.FoodResponse\022Q\n\004byId\022%.story_cli" +
      "ent.ds.Food.FoodByIdRequest\032\".story_clie" +
      "nt.ds.Food.FoodResponse\022U\n\006byName\022\'.stor" +
      "y_client.ds.Food.FoodByNameRequest\032\".sto" +
      "ry_client.ds.Food.FoodResponse\022Y\n\006delete" +
      "\022%.story_client.ds.Food.FoodByIdRequest\032" +
      "(.story_client.ds.Food.DeleteFoodRespons" +
      "eB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_story_client_ds_Food_FoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_story_client_ds_Food_FoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_FoodResponse_descriptor,
        new java.lang.String[] { "Id", "Taste", "KindFood", });
    internal_static_story_client_ds_Food_FoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_story_client_ds_Food_FoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_FoodRequest_descriptor,
        new java.lang.String[] { "Taste", "KindFood", });
    internal_static_story_client_ds_Food_AllFoodRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_story_client_ds_Food_AllFoodRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_AllFoodRequest_descriptor,
        new java.lang.String[] { });
    internal_static_story_client_ds_Food_AllFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_story_client_ds_Food_AllFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_AllFoodResponse_descriptor,
        new java.lang.String[] { "Food", });
    internal_static_story_client_ds_Food_FoodByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_story_client_ds_Food_FoodByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_FoodByIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_story_client_ds_Food_FoodByNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_story_client_ds_Food_FoodByNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_FoodByNameRequest_descriptor,
        new java.lang.String[] { "KindFood", });
    internal_static_story_client_ds_Food_DeleteFoodResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_story_client_ds_Food_DeleteFoodResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_story_client_ds_Food_DeleteFoodResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}