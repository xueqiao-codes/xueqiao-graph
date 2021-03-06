/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package xueqiao.personal.user.thriftapi;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqPersonalUserOption implements org.apache.thrift.TBase<ReqPersonalUserOption, ReqPersonalUserOption._Fields>, java.io.Serializable, Cloneable, Comparable<ReqPersonalUserOption> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReqPersonalUserOption");

  private static final org.apache.thrift.protocol.TField PERSONAL_USER_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("personalUserIds", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField TEL_FIELD_DESC = new org.apache.thrift.protocol.TField("tel", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReqPersonalUserOptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReqPersonalUserOptionTupleSchemeFactory());
  }

  public Set<Long> personalUserIds; // optional
  public String tel; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PERSONAL_USER_IDS((short)1, "personalUserIds"),
    TEL((short)2, "tel");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PERSONAL_USER_IDS
          return PERSONAL_USER_IDS;
        case 2: // TEL
          return TEL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.PERSONAL_USER_IDS,_Fields.TEL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PERSONAL_USER_IDS, new org.apache.thrift.meta_data.FieldMetaData("personalUserIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.TEL, new org.apache.thrift.meta_data.FieldMetaData("tel", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReqPersonalUserOption.class, metaDataMap);
  }

  public ReqPersonalUserOption() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReqPersonalUserOption(ReqPersonalUserOption other) {
    if (other.isSetPersonalUserIds()) {
      Set<Long> __this__personalUserIds = new HashSet<Long>(other.personalUserIds);
      this.personalUserIds = __this__personalUserIds;
    }
    if (other.isSetTel()) {
      this.tel = other.tel;
    }
  }

  public ReqPersonalUserOption deepCopy() {
    return new ReqPersonalUserOption(this);
  }

  @Override
  public void clear() {
    this.personalUserIds = null;
    this.tel = null;
  }

  public int getPersonalUserIdsSize() {
    return (this.personalUserIds == null) ? 0 : this.personalUserIds.size();
  }

  public java.util.Iterator<Long> getPersonalUserIdsIterator() {
    return (this.personalUserIds == null) ? null : this.personalUserIds.iterator();
  }

  public void addToPersonalUserIds(long elem) {
    if (this.personalUserIds == null) {
      this.personalUserIds = new HashSet<Long>();
    }
    this.personalUserIds.add(elem);
  }

  public Set<Long> getPersonalUserIds() {
    return this.personalUserIds;
  }

  public ReqPersonalUserOption setPersonalUserIds(Set<Long> personalUserIds) {
    this.personalUserIds = personalUserIds;
    return this;
  }

  public void unsetPersonalUserIds() {
    this.personalUserIds = null;
  }

  /** Returns true if field personalUserIds is set (has been assigned a value) and false otherwise */
  public boolean isSetPersonalUserIds() {
    return this.personalUserIds != null;
  }

  public void setPersonalUserIdsIsSet(boolean value) {
    if (!value) {
      this.personalUserIds = null;
    }
  }

  public String getTel() {
    return this.tel;
  }

  public ReqPersonalUserOption setTel(String tel) {
    this.tel = tel;
    return this;
  }

  public void unsetTel() {
    this.tel = null;
  }

  /** Returns true if field tel is set (has been assigned a value) and false otherwise */
  public boolean isSetTel() {
    return this.tel != null;
  }

  public void setTelIsSet(boolean value) {
    if (!value) {
      this.tel = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERSONAL_USER_IDS:
      if (value == null) {
        unsetPersonalUserIds();
      } else {
        setPersonalUserIds((Set<Long>)value);
      }
      break;

    case TEL:
      if (value == null) {
        unsetTel();
      } else {
        setTel((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERSONAL_USER_IDS:
      return getPersonalUserIds();

    case TEL:
      return getTel();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERSONAL_USER_IDS:
      return isSetPersonalUserIds();
    case TEL:
      return isSetTel();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReqPersonalUserOption)
      return this.equals((ReqPersonalUserOption)that);
    return false;
  }

  public boolean equals(ReqPersonalUserOption that) {
    if (that == null)
      return false;

    boolean this_present_personalUserIds = true && this.isSetPersonalUserIds();
    boolean that_present_personalUserIds = true && that.isSetPersonalUserIds();
    if (this_present_personalUserIds || that_present_personalUserIds) {
      if (!(this_present_personalUserIds && that_present_personalUserIds))
        return false;
      if (!this.personalUserIds.equals(that.personalUserIds))
        return false;
    }

    boolean this_present_tel = true && this.isSetTel();
    boolean that_present_tel = true && that.isSetTel();
    if (this_present_tel || that_present_tel) {
      if (!(this_present_tel && that_present_tel))
        return false;
      if (!this.tel.equals(that.tel))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ReqPersonalUserOption other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPersonalUserIds()).compareTo(other.isSetPersonalUserIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersonalUserIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.personalUserIds, other.personalUserIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTel()).compareTo(other.isSetTel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tel, other.tel);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ReqPersonalUserOption(");
    boolean first = true;

    if (isSetPersonalUserIds()) {
      sb.append("personalUserIds:");
      if (this.personalUserIds == null) {
        sb.append("null");
      } else {
        sb.append(this.personalUserIds);
      }
      first = false;
    }
    if (isSetTel()) {
      if (!first) sb.append(", ");
      sb.append("tel:");
      if (this.tel == null) {
        sb.append("null");
      } else {
        sb.append(this.tel);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReqPersonalUserOptionStandardSchemeFactory implements SchemeFactory {
    public ReqPersonalUserOptionStandardScheme getScheme() {
      return new ReqPersonalUserOptionStandardScheme();
    }
  }

  private static class ReqPersonalUserOptionStandardScheme extends StandardScheme<ReqPersonalUserOption> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReqPersonalUserOption struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERSONAL_USER_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set8 = iprot.readSetBegin();
                struct.personalUserIds = new HashSet<Long>(2*_set8.size);
                for (int _i9 = 0; _i9 < _set8.size; ++_i9)
                {
                  long _elem10;
                  _elem10 = iprot.readI64();
                  struct.personalUserIds.add(_elem10);
                }
                iprot.readSetEnd();
              }
              struct.setPersonalUserIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TEL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tel = iprot.readString();
              struct.setTelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReqPersonalUserOption struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.personalUserIds != null) {
        if (struct.isSetPersonalUserIds()) {
          oprot.writeFieldBegin(PERSONAL_USER_IDS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.personalUserIds.size()));
            for (long _iter11 : struct.personalUserIds)
            {
              oprot.writeI64(_iter11);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.tel != null) {
        if (struct.isSetTel()) {
          oprot.writeFieldBegin(TEL_FIELD_DESC);
          oprot.writeString(struct.tel);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReqPersonalUserOptionTupleSchemeFactory implements SchemeFactory {
    public ReqPersonalUserOptionTupleScheme getScheme() {
      return new ReqPersonalUserOptionTupleScheme();
    }
  }

  private static class ReqPersonalUserOptionTupleScheme extends TupleScheme<ReqPersonalUserOption> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReqPersonalUserOption struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPersonalUserIds()) {
        optionals.set(0);
      }
      if (struct.isSetTel()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPersonalUserIds()) {
        {
          oprot.writeI32(struct.personalUserIds.size());
          for (long _iter12 : struct.personalUserIds)
          {
            oprot.writeI64(_iter12);
          }
        }
      }
      if (struct.isSetTel()) {
        oprot.writeString(struct.tel);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReqPersonalUserOption struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set13 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.personalUserIds = new HashSet<Long>(2*_set13.size);
          for (int _i14 = 0; _i14 < _set13.size; ++_i14)
          {
            long _elem15;
            _elem15 = iprot.readI64();
            struct.personalUserIds.add(_elem15);
          }
        }
        struct.setPersonalUserIdsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tel = iprot.readString();
        struct.setTelIsSet(true);
      }
    }
  }

}

