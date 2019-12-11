/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7329683001366647797L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Message\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"priority\",\"type\":[\"int\",\"null\"]},{\"name\":\"extra\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Message> ENCODER =
      new BinaryMessageEncoder<Message>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Message> DECODER =
      new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Message> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Message> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Message>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Message to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Message from a ByteBuffer. */
  public static Message fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence code;
  @Deprecated public java.lang.Integer priority;
  @Deprecated public java.lang.CharSequence extra;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Message() {}

  /**
   * All-args constructor.
   * @param code The new value for code
   * @param priority The new value for priority
   * @param extra The new value for extra
   */
  public Message(java.lang.CharSequence code, java.lang.Integer priority, java.lang.CharSequence extra) {
    this.code = code;
    this.priority = priority;
    this.extra = extra;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return code;
    case 1: return priority;
    case 2: return extra;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: code = (java.lang.CharSequence)value$; break;
    case 1: priority = (java.lang.Integer)value$; break;
    case 2: extra = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }

  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'priority' field.
   * @return The value of the 'priority' field.
   */
  public java.lang.Integer getPriority() {
    return priority;
  }

  /**
   * Sets the value of the 'priority' field.
   * @param value the value to set.
   */
  public void setPriority(java.lang.Integer value) {
    this.priority = value;
  }

  /**
   * Gets the value of the 'extra' field.
   * @return The value of the 'extra' field.
   */
  public java.lang.CharSequence getExtra() {
    return extra;
  }

  /**
   * Sets the value of the 'extra' field.
   * @param value the value to set.
   */
  public void setExtra(java.lang.CharSequence value) {
    this.extra = value;
  }

  /**
   * Creates a new Message RecordBuilder.
   * @return A new Message RecordBuilder
   */
  public static avro.Message.Builder newBuilder() {
    return new avro.Message.Builder();
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Message RecordBuilder
   */
  public static avro.Message.Builder newBuilder(avro.Message.Builder other) {
    return new avro.Message.Builder(other);
  }

  /**
   * Creates a new Message RecordBuilder by copying an existing Message instance.
   * @param other The existing instance to copy.
   * @return A new Message RecordBuilder
   */
  public static avro.Message.Builder newBuilder(avro.Message other) {
    return new avro.Message.Builder(other);
  }

  /**
   * RecordBuilder for Message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Message>
    implements org.apache.avro.data.RecordBuilder<Message> {

    private java.lang.CharSequence code;
    private java.lang.Integer priority;
    private java.lang.CharSequence extra;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.Message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.extra)) {
        this.extra = data().deepCopy(fields()[2].schema(), other.extra);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Message instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.Message other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.code)) {
        this.code = data().deepCopy(fields()[0].schema(), other.code);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.extra)) {
        this.extra = data().deepCopy(fields()[2].schema(), other.extra);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }

    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public avro.Message.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.code = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public avro.Message.Builder clearCode() {
      code = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'priority' field.
      * @return The value.
      */
    public java.lang.Integer getPriority() {
      return priority;
    }

    /**
      * Sets the value of the 'priority' field.
      * @param value The value of 'priority'.
      * @return This builder.
      */
    public avro.Message.Builder setPriority(java.lang.Integer value) {
      validate(fields()[1], value);
      this.priority = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'priority' field has been set.
      * @return True if the 'priority' field has been set, false otherwise.
      */
    public boolean hasPriority() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'priority' field.
      * @return This builder.
      */
    public avro.Message.Builder clearPriority() {
      priority = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'extra' field.
      * @return The value.
      */
    public java.lang.CharSequence getExtra() {
      return extra;
    }

    /**
      * Sets the value of the 'extra' field.
      * @param value The value of 'extra'.
      * @return This builder.
      */
    public avro.Message.Builder setExtra(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.extra = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'extra' field has been set.
      * @return True if the 'extra' field has been set, false otherwise.
      */
    public boolean hasExtra() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'extra' field.
      * @return This builder.
      */
    public avro.Message.Builder clearExtra() {
      extra = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Message build() {
      try {
        Message record = new Message();
        record.code = fieldSetFlags()[0] ? this.code : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.priority = fieldSetFlags()[1] ? this.priority : (java.lang.Integer) defaultValue(fields()[1]);
        record.extra = fieldSetFlags()[2] ? this.extra : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Message>
    WRITER$ = (org.apache.avro.io.DatumWriter<Message>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Message>
    READER$ = (org.apache.avro.io.DatumReader<Message>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
