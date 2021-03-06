// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FairyAnimal.proto

package distributedsystems.FairyAnimal;

/**
 * Protobuf type {@code distributedsystems.FairyAnimal.AllFairyAnimalResponse}
 */
public final class AllFairyAnimalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:distributedsystems.FairyAnimal.AllFairyAnimalResponse)
    AllFairyAnimalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllFairyAnimalResponse.newBuilder() to construct.
  private AllFairyAnimalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllFairyAnimalResponse() {
    fairyAnimal_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AllFairyAnimalResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllFairyAnimalResponse(
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
              fairyAnimal_ = new java.util.ArrayList<distributedsystems.FairyAnimal.FairyAnimalResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            fairyAnimal_.add(
                input.readMessage(distributedsystems.FairyAnimal.FairyAnimalResponse.parser(), extensionRegistry));
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
        fairyAnimal_ = java.util.Collections.unmodifiableList(fairyAnimal_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return distributedsystems.FairyAnimal.FairyAnimal.internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return distributedsystems.FairyAnimal.FairyAnimal.internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            distributedsystems.FairyAnimal.AllFairyAnimalResponse.class, distributedsystems.FairyAnimal.AllFairyAnimalResponse.Builder.class);
  }

  public static final int FAIRYANIMAL_FIELD_NUMBER = 1;
  private java.util.List<distributedsystems.FairyAnimal.FairyAnimalResponse> fairyAnimal_;
  /**
   * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
   */
  @java.lang.Override
  public java.util.List<distributedsystems.FairyAnimal.FairyAnimalResponse> getFairyAnimalList() {
    return fairyAnimal_;
  }
  /**
   * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder> 
      getFairyAnimalOrBuilderList() {
    return fairyAnimal_;
  }
  /**
   * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
   */
  @java.lang.Override
  public int getFairyAnimalCount() {
    return fairyAnimal_.size();
  }
  /**
   * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
   */
  @java.lang.Override
  public distributedsystems.FairyAnimal.FairyAnimalResponse getFairyAnimal(int index) {
    return fairyAnimal_.get(index);
  }
  /**
   * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
   */
  @java.lang.Override
  public distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder getFairyAnimalOrBuilder(
      int index) {
    return fairyAnimal_.get(index);
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
    for (int i = 0; i < fairyAnimal_.size(); i++) {
      output.writeMessage(1, fairyAnimal_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fairyAnimal_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, fairyAnimal_.get(i));
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
    if (!(obj instanceof distributedsystems.FairyAnimal.AllFairyAnimalResponse)) {
      return super.equals(obj);
    }
    distributedsystems.FairyAnimal.AllFairyAnimalResponse other = (distributedsystems.FairyAnimal.AllFairyAnimalResponse) obj;

    if (!getFairyAnimalList()
        .equals(other.getFairyAnimalList())) return false;
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
    if (getFairyAnimalCount() > 0) {
      hash = (37 * hash) + FAIRYANIMAL_FIELD_NUMBER;
      hash = (53 * hash) + getFairyAnimalList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse parseFrom(
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
  public static Builder newBuilder(distributedsystems.FairyAnimal.AllFairyAnimalResponse prototype) {
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
   * Protobuf type {@code distributedsystems.FairyAnimal.AllFairyAnimalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:distributedsystems.FairyAnimal.AllFairyAnimalResponse)
      distributedsystems.FairyAnimal.AllFairyAnimalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return distributedsystems.FairyAnimal.FairyAnimal.internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return distributedsystems.FairyAnimal.FairyAnimal.internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              distributedsystems.FairyAnimal.AllFairyAnimalResponse.class, distributedsystems.FairyAnimal.AllFairyAnimalResponse.Builder.class);
    }

    // Construct using distributedsystems.FairyAnimal.AllFairyAnimalResponse.newBuilder()
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
        getFairyAnimalFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fairyAnimalBuilder_ == null) {
        fairyAnimal_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fairyAnimalBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return distributedsystems.FairyAnimal.FairyAnimal.internal_static_distributedsystems_FairyAnimal_AllFairyAnimalResponse_descriptor;
    }

    @java.lang.Override
    public distributedsystems.FairyAnimal.AllFairyAnimalResponse getDefaultInstanceForType() {
      return distributedsystems.FairyAnimal.AllFairyAnimalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public distributedsystems.FairyAnimal.AllFairyAnimalResponse build() {
      distributedsystems.FairyAnimal.AllFairyAnimalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public distributedsystems.FairyAnimal.AllFairyAnimalResponse buildPartial() {
      distributedsystems.FairyAnimal.AllFairyAnimalResponse result = new distributedsystems.FairyAnimal.AllFairyAnimalResponse(this);
      int from_bitField0_ = bitField0_;
      if (fairyAnimalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fairyAnimal_ = java.util.Collections.unmodifiableList(fairyAnimal_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fairyAnimal_ = fairyAnimal_;
      } else {
        result.fairyAnimal_ = fairyAnimalBuilder_.build();
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
      if (other instanceof distributedsystems.FairyAnimal.AllFairyAnimalResponse) {
        return mergeFrom((distributedsystems.FairyAnimal.AllFairyAnimalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(distributedsystems.FairyAnimal.AllFairyAnimalResponse other) {
      if (other == distributedsystems.FairyAnimal.AllFairyAnimalResponse.getDefaultInstance()) return this;
      if (fairyAnimalBuilder_ == null) {
        if (!other.fairyAnimal_.isEmpty()) {
          if (fairyAnimal_.isEmpty()) {
            fairyAnimal_ = other.fairyAnimal_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFairyAnimalIsMutable();
            fairyAnimal_.addAll(other.fairyAnimal_);
          }
          onChanged();
        }
      } else {
        if (!other.fairyAnimal_.isEmpty()) {
          if (fairyAnimalBuilder_.isEmpty()) {
            fairyAnimalBuilder_.dispose();
            fairyAnimalBuilder_ = null;
            fairyAnimal_ = other.fairyAnimal_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fairyAnimalBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFairyAnimalFieldBuilder() : null;
          } else {
            fairyAnimalBuilder_.addAllMessages(other.fairyAnimal_);
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
      distributedsystems.FairyAnimal.AllFairyAnimalResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (distributedsystems.FairyAnimal.AllFairyAnimalResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<distributedsystems.FairyAnimal.FairyAnimalResponse> fairyAnimal_ =
      java.util.Collections.emptyList();
    private void ensureFairyAnimalIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fairyAnimal_ = new java.util.ArrayList<distributedsystems.FairyAnimal.FairyAnimalResponse>(fairyAnimal_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        distributedsystems.FairyAnimal.FairyAnimalResponse, distributedsystems.FairyAnimal.FairyAnimalResponse.Builder, distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder> fairyAnimalBuilder_;

    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public java.util.List<distributedsystems.FairyAnimal.FairyAnimalResponse> getFairyAnimalList() {
      if (fairyAnimalBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fairyAnimal_);
      } else {
        return fairyAnimalBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public int getFairyAnimalCount() {
      if (fairyAnimalBuilder_ == null) {
        return fairyAnimal_.size();
      } else {
        return fairyAnimalBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse getFairyAnimal(int index) {
      if (fairyAnimalBuilder_ == null) {
        return fairyAnimal_.get(index);
      } else {
        return fairyAnimalBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder setFairyAnimal(
        int index, distributedsystems.FairyAnimal.FairyAnimalResponse value) {
      if (fairyAnimalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFairyAnimalIsMutable();
        fairyAnimal_.set(index, value);
        onChanged();
      } else {
        fairyAnimalBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder setFairyAnimal(
        int index, distributedsystems.FairyAnimal.FairyAnimalResponse.Builder builderForValue) {
      if (fairyAnimalBuilder_ == null) {
        ensureFairyAnimalIsMutable();
        fairyAnimal_.set(index, builderForValue.build());
        onChanged();
      } else {
        fairyAnimalBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder addFairyAnimal(distributedsystems.FairyAnimal.FairyAnimalResponse value) {
      if (fairyAnimalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFairyAnimalIsMutable();
        fairyAnimal_.add(value);
        onChanged();
      } else {
        fairyAnimalBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder addFairyAnimal(
        int index, distributedsystems.FairyAnimal.FairyAnimalResponse value) {
      if (fairyAnimalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFairyAnimalIsMutable();
        fairyAnimal_.add(index, value);
        onChanged();
      } else {
        fairyAnimalBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder addFairyAnimal(
        distributedsystems.FairyAnimal.FairyAnimalResponse.Builder builderForValue) {
      if (fairyAnimalBuilder_ == null) {
        ensureFairyAnimalIsMutable();
        fairyAnimal_.add(builderForValue.build());
        onChanged();
      } else {
        fairyAnimalBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder addFairyAnimal(
        int index, distributedsystems.FairyAnimal.FairyAnimalResponse.Builder builderForValue) {
      if (fairyAnimalBuilder_ == null) {
        ensureFairyAnimalIsMutable();
        fairyAnimal_.add(index, builderForValue.build());
        onChanged();
      } else {
        fairyAnimalBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder addAllFairyAnimal(
        java.lang.Iterable<? extends distributedsystems.FairyAnimal.FairyAnimalResponse> values) {
      if (fairyAnimalBuilder_ == null) {
        ensureFairyAnimalIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fairyAnimal_);
        onChanged();
      } else {
        fairyAnimalBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder clearFairyAnimal() {
      if (fairyAnimalBuilder_ == null) {
        fairyAnimal_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fairyAnimalBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public Builder removeFairyAnimal(int index) {
      if (fairyAnimalBuilder_ == null) {
        ensureFairyAnimalIsMutable();
        fairyAnimal_.remove(index);
        onChanged();
      } else {
        fairyAnimalBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse.Builder getFairyAnimalBuilder(
        int index) {
      return getFairyAnimalFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder getFairyAnimalOrBuilder(
        int index) {
      if (fairyAnimalBuilder_ == null) {
        return fairyAnimal_.get(index);  } else {
        return fairyAnimalBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public java.util.List<? extends distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder> 
         getFairyAnimalOrBuilderList() {
      if (fairyAnimalBuilder_ != null) {
        return fairyAnimalBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fairyAnimal_);
      }
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse.Builder addFairyAnimalBuilder() {
      return getFairyAnimalFieldBuilder().addBuilder(
          distributedsystems.FairyAnimal.FairyAnimalResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public distributedsystems.FairyAnimal.FairyAnimalResponse.Builder addFairyAnimalBuilder(
        int index) {
      return getFairyAnimalFieldBuilder().addBuilder(
          index, distributedsystems.FairyAnimal.FairyAnimalResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .distributedsystems.FairyAnimal.FairyAnimalResponse FairyAnimal = 1;</code>
     */
    public java.util.List<distributedsystems.FairyAnimal.FairyAnimalResponse.Builder> 
         getFairyAnimalBuilderList() {
      return getFairyAnimalFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        distributedsystems.FairyAnimal.FairyAnimalResponse, distributedsystems.FairyAnimal.FairyAnimalResponse.Builder, distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder> 
        getFairyAnimalFieldBuilder() {
      if (fairyAnimalBuilder_ == null) {
        fairyAnimalBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            distributedsystems.FairyAnimal.FairyAnimalResponse, distributedsystems.FairyAnimal.FairyAnimalResponse.Builder, distributedsystems.FairyAnimal.FairyAnimalResponseOrBuilder>(
                fairyAnimal_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        fairyAnimal_ = null;
      }
      return fairyAnimalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:distributedsystems.FairyAnimal.AllFairyAnimalResponse)
  }

  // @@protoc_insertion_point(class_scope:distributedsystems.FairyAnimal.AllFairyAnimalResponse)
  private static final distributedsystems.FairyAnimal.AllFairyAnimalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new distributedsystems.FairyAnimal.AllFairyAnimalResponse();
  }

  public static distributedsystems.FairyAnimal.AllFairyAnimalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllFairyAnimalResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllFairyAnimalResponse>() {
    @java.lang.Override
    public AllFairyAnimalResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllFairyAnimalResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllFairyAnimalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllFairyAnimalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public distributedsystems.FairyAnimal.AllFairyAnimalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

