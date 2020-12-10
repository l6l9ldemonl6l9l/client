// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deity.proto

package story_client.ds.Deity;

/**
 * Protobuf type {@code story_client.ds.Deity.AllDeityResponse}
 */
public final class AllDeityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:story_client.ds.Deity.AllDeityResponse)
    AllDeityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllDeityResponse.newBuilder() to construct.
  private AllDeityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllDeityResponse() {
    deity_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllDeityResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllDeityResponse(
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
              deity_ = new java.util.ArrayList<story_client.ds.Deity.DeityResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            deity_.add(
                input.readMessage(story_client.ds.Deity.DeityResponse.parser(), extensionRegistry));
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
        deity_ = java.util.Collections.unmodifiableList(deity_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return story_client.ds.Deity.Deity.internal_static_story_client_ds_Deity_AllDeityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return story_client.ds.Deity.Deity.internal_static_story_client_ds_Deity_AllDeityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            story_client.ds.Deity.AllDeityResponse.class, story_client.ds.Deity.AllDeityResponse.Builder.class);
  }

  public static final int DEITY_FIELD_NUMBER = 1;
  private java.util.List<story_client.ds.Deity.DeityResponse> deity_;
  /**
   * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<story_client.ds.Deity.DeityResponse> getDeityList() {
    return deity_;
  }
  /**
   * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends story_client.ds.Deity.DeityResponseOrBuilder> 
      getDeityOrBuilderList() {
    return deity_;
  }
  /**
   * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public int getDeityCount() {
    return deity_.size();
  }
  /**
   * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public story_client.ds.Deity.DeityResponse getDeity(int index) {
    return deity_.get(index);
  }
  /**
   * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
   */
  @java.lang.Override
  public story_client.ds.Deity.DeityResponseOrBuilder getDeityOrBuilder(
      int index) {
    return deity_.get(index);
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
    for (int i = 0; i < deity_.size(); i++) {
      output.writeMessage(1, deity_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < deity_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, deity_.get(i));
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
    if (!(obj instanceof story_client.ds.Deity.AllDeityResponse)) {
      return super.equals(obj);
    }
    story_client.ds.Deity.AllDeityResponse other = (story_client.ds.Deity.AllDeityResponse) obj;

    if (!getDeityList()
        .equals(other.getDeityList())) return false;
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
    if (getDeityCount() > 0) {
      hash = (37 * hash) + DEITY_FIELD_NUMBER;
      hash = (53 * hash) + getDeityList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static story_client.ds.Deity.AllDeityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static story_client.ds.Deity.AllDeityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static story_client.ds.Deity.AllDeityResponse parseFrom(
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
  public static Builder newBuilder(story_client.ds.Deity.AllDeityResponse prototype) {
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
   * Protobuf type {@code story_client.ds.Deity.AllDeityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:story_client.ds.Deity.AllDeityResponse)
      story_client.ds.Deity.AllDeityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return story_client.ds.Deity.Deity.internal_static_story_client_ds_Deity_AllDeityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return story_client.ds.Deity.Deity.internal_static_story_client_ds_Deity_AllDeityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              story_client.ds.Deity.AllDeityResponse.class, story_client.ds.Deity.AllDeityResponse.Builder.class);
    }

    // Construct using story_client.ds.Deity.AllDeityResponse.newBuilder()
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
        getDeityFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deityBuilder_ == null) {
        deity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        deityBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return story_client.ds.Deity.Deity.internal_static_story_client_ds_Deity_AllDeityResponse_descriptor;
    }

    @java.lang.Override
    public story_client.ds.Deity.AllDeityResponse getDefaultInstanceForType() {
      return story_client.ds.Deity.AllDeityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public story_client.ds.Deity.AllDeityResponse build() {
      story_client.ds.Deity.AllDeityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public story_client.ds.Deity.AllDeityResponse buildPartial() {
      story_client.ds.Deity.AllDeityResponse result = new story_client.ds.Deity.AllDeityResponse(this);
      int from_bitField0_ = bitField0_;
      if (deityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          deity_ = java.util.Collections.unmodifiableList(deity_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.deity_ = deity_;
      } else {
        result.deity_ = deityBuilder_.build();
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
      if (other instanceof story_client.ds.Deity.AllDeityResponse) {
        return mergeFrom((story_client.ds.Deity.AllDeityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(story_client.ds.Deity.AllDeityResponse other) {
      if (other == story_client.ds.Deity.AllDeityResponse.getDefaultInstance()) return this;
      if (deityBuilder_ == null) {
        if (!other.deity_.isEmpty()) {
          if (deity_.isEmpty()) {
            deity_ = other.deity_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDeityIsMutable();
            deity_.addAll(other.deity_);
          }
          onChanged();
        }
      } else {
        if (!other.deity_.isEmpty()) {
          if (deityBuilder_.isEmpty()) {
            deityBuilder_.dispose();
            deityBuilder_ = null;
            deity_ = other.deity_;
            bitField0_ = (bitField0_ & ~0x00000001);
            deityBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDeityFieldBuilder() : null;
          } else {
            deityBuilder_.addAllMessages(other.deity_);
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
      story_client.ds.Deity.AllDeityResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (story_client.ds.Deity.AllDeityResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<story_client.ds.Deity.DeityResponse> deity_ =
      java.util.Collections.emptyList();
    private void ensureDeityIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        deity_ = new java.util.ArrayList<story_client.ds.Deity.DeityResponse>(deity_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        story_client.ds.Deity.DeityResponse, story_client.ds.Deity.DeityResponse.Builder, story_client.ds.Deity.DeityResponseOrBuilder> deityBuilder_;

    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public java.util.List<story_client.ds.Deity.DeityResponse> getDeityList() {
      if (deityBuilder_ == null) {
        return java.util.Collections.unmodifiableList(deity_);
      } else {
        return deityBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public int getDeityCount() {
      if (deityBuilder_ == null) {
        return deity_.size();
      } else {
        return deityBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public story_client.ds.Deity.DeityResponse getDeity(int index) {
      if (deityBuilder_ == null) {
        return deity_.get(index);
      } else {
        return deityBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder setDeity(
        int index, story_client.ds.Deity.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.set(index, value);
        onChanged();
      } else {
        deityBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder setDeity(
        int index, story_client.ds.Deity.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.set(index, builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(story_client.ds.Deity.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.add(value);
        onChanged();
      } else {
        deityBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        int index, story_client.ds.Deity.DeityResponse value) {
      if (deityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDeityIsMutable();
        deity_.add(index, value);
        onChanged();
      } else {
        deityBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        story_client.ds.Deity.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.add(builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder addDeity(
        int index, story_client.ds.Deity.DeityResponse.Builder builderForValue) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.add(index, builderForValue.build());
        onChanged();
      } else {
        deityBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder addAllDeity(
        java.lang.Iterable<? extends story_client.ds.Deity.DeityResponse> values) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, deity_);
        onChanged();
      } else {
        deityBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder clearDeity() {
      if (deityBuilder_ == null) {
        deity_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        deityBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public Builder removeDeity(int index) {
      if (deityBuilder_ == null) {
        ensureDeityIsMutable();
        deity_.remove(index);
        onChanged();
      } else {
        deityBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public story_client.ds.Deity.DeityResponse.Builder getDeityBuilder(
        int index) {
      return getDeityFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public story_client.ds.Deity.DeityResponseOrBuilder getDeityOrBuilder(
        int index) {
      if (deityBuilder_ == null) {
        return deity_.get(index);  } else {
        return deityBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public java.util.List<? extends story_client.ds.Deity.DeityResponseOrBuilder> 
         getDeityOrBuilderList() {
      if (deityBuilder_ != null) {
        return deityBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(deity_);
      }
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public story_client.ds.Deity.DeityResponse.Builder addDeityBuilder() {
      return getDeityFieldBuilder().addBuilder(
          story_client.ds.Deity.DeityResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public story_client.ds.Deity.DeityResponse.Builder addDeityBuilder(
        int index) {
      return getDeityFieldBuilder().addBuilder(
          index, story_client.ds.Deity.DeityResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .story_client.ds.Deity.DeityResponse Deity = 1;</code>
     */
    public java.util.List<story_client.ds.Deity.DeityResponse.Builder> 
         getDeityBuilderList() {
      return getDeityFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        story_client.ds.Deity.DeityResponse, story_client.ds.Deity.DeityResponse.Builder, story_client.ds.Deity.DeityResponseOrBuilder> 
        getDeityFieldBuilder() {
      if (deityBuilder_ == null) {
        deityBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            story_client.ds.Deity.DeityResponse, story_client.ds.Deity.DeityResponse.Builder, story_client.ds.Deity.DeityResponseOrBuilder>(
                deity_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        deity_ = null;
      }
      return deityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:story_client.ds.Deity.AllDeityResponse)
  }

  // @@protoc_insertion_point(class_scope:story_client.ds.Deity.AllDeityResponse)
  private static final story_client.ds.Deity.AllDeityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new story_client.ds.Deity.AllDeityResponse();
  }

  public static story_client.ds.Deity.AllDeityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllDeityResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllDeityResponse>() {
    @java.lang.Override
    public AllDeityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllDeityResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllDeityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllDeityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public story_client.ds.Deity.AllDeityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
