// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: food.proto

package story_client.ds.Food;

/**
 * Protobuf type {@code story_client.ds.Food.AllFoodResponse}
 */
public final class AllFoodResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:story_client.ds.Food.AllFoodResponse)
    AllFoodResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllFoodResponse.newBuilder() to construct.
  private AllFoodResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllFoodResponse() {
    food_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllFoodResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllFoodResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              food_ = new java.util.ArrayList<story_client.ds.Food.FoodResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            food_.add(
                input.readMessage(story_client.ds.Food.FoodResponse.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        food_ = java.util.Collections.unmodifiableList(food_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return story_client.ds.Food.Food.internal_static_story_client_ds_Food_AllFoodResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return story_client.ds.Food.Food.internal_static_story_client_ds_Food_AllFoodResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            story_client.ds.Food.AllFoodResponse.class, story_client.ds.Food.AllFoodResponse.Builder.class);
  }

  public static final int FOOD_FIELD_NUMBER = 1;
  private java.util.List<story_client.ds.Food.FoodResponse> food_;
  /**
   * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
   */
  @java.lang.Override
  public java.util.List<story_client.ds.Food.FoodResponse> getFoodList() {
    return food_;
  }
  /**
   * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends story_client.ds.Food.FoodResponseOrBuilder> 
      getFoodOrBuilderList() {
    return food_;
  }
  /**
   * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
   */
  @java.lang.Override
  public int getFoodCount() {
    return food_.size();
  }
  /**
   * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
   */
  @java.lang.Override
  public story_client.ds.Food.FoodResponse getFood(int index) {
    return food_.get(index);
  }
  /**
   * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
   */
  @java.lang.Override
  public story_client.ds.Food.FoodResponseOrBuilder getFoodOrBuilder(
      int index) {
    return food_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < food_.size(); i++) {
      output.writeMessage(1, food_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < food_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, food_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof story_client.ds.Food.AllFoodResponse)) {
      return super.equals(obj);
    }
    story_client.ds.Food.AllFoodResponse other = (story_client.ds.Food.AllFoodResponse) obj;

    if (!getFoodList()
        .equals(other.getFoodList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getFoodCount() > 0) {
      hash = (37 * hash) + FOOD_FIELD_NUMBER;
      hash = (53 * hash) + getFoodList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static story_client.ds.Food.AllFoodResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static story_client.ds.Food.AllFoodResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static story_client.ds.Food.AllFoodResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static story_client.ds.Food.AllFoodResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(story_client.ds.Food.AllFoodResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code story_client.ds.Food.AllFoodResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:story_client.ds.Food.AllFoodResponse)
      story_client.ds.Food.AllFoodResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return story_client.ds.Food.Food.internal_static_story_client_ds_Food_AllFoodResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return story_client.ds.Food.Food.internal_static_story_client_ds_Food_AllFoodResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              story_client.ds.Food.AllFoodResponse.class, story_client.ds.Food.AllFoodResponse.Builder.class);
    }

    // Construct using story_client.ds.Food.AllFoodResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFoodFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (foodBuilder_ == null) {
        food_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        foodBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return story_client.ds.Food.Food.internal_static_story_client_ds_Food_AllFoodResponse_descriptor;
    }

    @java.lang.Override
    public story_client.ds.Food.AllFoodResponse getDefaultInstanceForType() {
      return story_client.ds.Food.AllFoodResponse.getDefaultInstance();
    }

    @java.lang.Override
    public story_client.ds.Food.AllFoodResponse build() {
      story_client.ds.Food.AllFoodResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public story_client.ds.Food.AllFoodResponse buildPartial() {
      story_client.ds.Food.AllFoodResponse result = new story_client.ds.Food.AllFoodResponse(this);
      int from_bitField0_ = bitField0_;
      if (foodBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          food_ = java.util.Collections.unmodifiableList(food_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.food_ = food_;
      } else {
        result.food_ = foodBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof story_client.ds.Food.AllFoodResponse) {
        return mergeFrom((story_client.ds.Food.AllFoodResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(story_client.ds.Food.AllFoodResponse other) {
      if (other == story_client.ds.Food.AllFoodResponse.getDefaultInstance()) return this;
      if (foodBuilder_ == null) {
        if (!other.food_.isEmpty()) {
          if (food_.isEmpty()) {
            food_ = other.food_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFoodIsMutable();
            food_.addAll(other.food_);
          }
          onChanged();
        }
      } else {
        if (!other.food_.isEmpty()) {
          if (foodBuilder_.isEmpty()) {
            foodBuilder_.dispose();
            foodBuilder_ = null;
            food_ = other.food_;
            bitField0_ = (bitField0_ & ~0x00000001);
            foodBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFoodFieldBuilder() : null;
          } else {
            foodBuilder_.addAllMessages(other.food_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      story_client.ds.Food.AllFoodResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (story_client.ds.Food.AllFoodResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<story_client.ds.Food.FoodResponse> food_ =
      java.util.Collections.emptyList();
    private void ensureFoodIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        food_ = new java.util.ArrayList<story_client.ds.Food.FoodResponse>(food_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        story_client.ds.Food.FoodResponse, story_client.ds.Food.FoodResponse.Builder, story_client.ds.Food.FoodResponseOrBuilder> foodBuilder_;

    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public java.util.List<story_client.ds.Food.FoodResponse> getFoodList() {
      if (foodBuilder_ == null) {
        return java.util.Collections.unmodifiableList(food_);
      } else {
        return foodBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public int getFoodCount() {
      if (foodBuilder_ == null) {
        return food_.size();
      } else {
        return foodBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public story_client.ds.Food.FoodResponse getFood(int index) {
      if (foodBuilder_ == null) {
        return food_.get(index);
      } else {
        return foodBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder setFood(
        int index, story_client.ds.Food.FoodResponse value) {
      if (foodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoodIsMutable();
        food_.set(index, value);
        onChanged();
      } else {
        foodBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder setFood(
        int index, story_client.ds.Food.FoodResponse.Builder builderForValue) {
      if (foodBuilder_ == null) {
        ensureFoodIsMutable();
        food_.set(index, builderForValue.build());
        onChanged();
      } else {
        foodBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder addFood(story_client.ds.Food.FoodResponse value) {
      if (foodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoodIsMutable();
        food_.add(value);
        onChanged();
      } else {
        foodBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder addFood(
        int index, story_client.ds.Food.FoodResponse value) {
      if (foodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFoodIsMutable();
        food_.add(index, value);
        onChanged();
      } else {
        foodBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder addFood(
        story_client.ds.Food.FoodResponse.Builder builderForValue) {
      if (foodBuilder_ == null) {
        ensureFoodIsMutable();
        food_.add(builderForValue.build());
        onChanged();
      } else {
        foodBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder addFood(
        int index, story_client.ds.Food.FoodResponse.Builder builderForValue) {
      if (foodBuilder_ == null) {
        ensureFoodIsMutable();
        food_.add(index, builderForValue.build());
        onChanged();
      } else {
        foodBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder addAllFood(
        java.lang.Iterable<? extends story_client.ds.Food.FoodResponse> values) {
      if (foodBuilder_ == null) {
        ensureFoodIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, food_);
        onChanged();
      } else {
        foodBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder clearFood() {
      if (foodBuilder_ == null) {
        food_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        foodBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public Builder removeFood(int index) {
      if (foodBuilder_ == null) {
        ensureFoodIsMutable();
        food_.remove(index);
        onChanged();
      } else {
        foodBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public story_client.ds.Food.FoodResponse.Builder getFoodBuilder(
        int index) {
      return getFoodFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public story_client.ds.Food.FoodResponseOrBuilder getFoodOrBuilder(
        int index) {
      if (foodBuilder_ == null) {
        return food_.get(index);  } else {
        return foodBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public java.util.List<? extends story_client.ds.Food.FoodResponseOrBuilder> 
         getFoodOrBuilderList() {
      if (foodBuilder_ != null) {
        return foodBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(food_);
      }
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public story_client.ds.Food.FoodResponse.Builder addFoodBuilder() {
      return getFoodFieldBuilder().addBuilder(
          story_client.ds.Food.FoodResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public story_client.ds.Food.FoodResponse.Builder addFoodBuilder(
        int index) {
      return getFoodFieldBuilder().addBuilder(
          index, story_client.ds.Food.FoodResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .story_client.ds.Food.FoodResponse Food = 1;</code>
     */
    public java.util.List<story_client.ds.Food.FoodResponse.Builder> 
         getFoodBuilderList() {
      return getFoodFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        story_client.ds.Food.FoodResponse, story_client.ds.Food.FoodResponse.Builder, story_client.ds.Food.FoodResponseOrBuilder> 
        getFoodFieldBuilder() {
      if (foodBuilder_ == null) {
        foodBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            story_client.ds.Food.FoodResponse, story_client.ds.Food.FoodResponse.Builder, story_client.ds.Food.FoodResponseOrBuilder>(
                food_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        food_ = null;
      }
      return foodBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:story_client.ds.Food.AllFoodResponse)
  }

  // @@protoc_insertion_point(class_scope:story_client.ds.Food.AllFoodResponse)
  private static final story_client.ds.Food.AllFoodResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new story_client.ds.Food.AllFoodResponse();
  }

  public static story_client.ds.Food.AllFoodResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllFoodResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllFoodResponse>() {
    @java.lang.Override
    public AllFoodResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllFoodResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllFoodResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllFoodResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public story_client.ds.Food.AllFoodResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

