/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package xueqiao.trade.hosting.cloud.ao;

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

public class HostingInitReq implements org.apache.thrift.TBase<HostingInitReq, HostingInitReq._Fields>, java.io.Serializable, Cloneable, Comparable<HostingInitReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostingInitReq");

  private static final org.apache.thrift.protocol.TField MACHINE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("machineId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ADMIN_LOGIN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("adminLoginName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ADMIN_LOGIN_PASSWD_FIELD_DESC = new org.apache.thrift.protocol.TField("adminLoginPasswd", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField HOSTING_AES16_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("hostingAES16Key", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RUNNING_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("runningMode", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostingInitReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostingInitReqTupleSchemeFactory());
  }

  public long machineId; // optional
  public String adminLoginName; // optional
  public String adminLoginPasswd; // optional
  public String hostingAES16Key; // optional
  /**
   * 
   * @see xueqiao.trade.hosting.HostingRunningMode
   */
  public xueqiao.trade.hosting.HostingRunningMode runningMode; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MACHINE_ID((short)1, "machineId"),
    ADMIN_LOGIN_NAME((short)2, "adminLoginName"),
    ADMIN_LOGIN_PASSWD((short)3, "adminLoginPasswd"),
    HOSTING_AES16_KEY((short)4, "hostingAES16Key"),
    /**
     * 
     * @see xueqiao.trade.hosting.HostingRunningMode
     */
    RUNNING_MODE((short)5, "runningMode");

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
        case 1: // MACHINE_ID
          return MACHINE_ID;
        case 2: // ADMIN_LOGIN_NAME
          return ADMIN_LOGIN_NAME;
        case 3: // ADMIN_LOGIN_PASSWD
          return ADMIN_LOGIN_PASSWD;
        case 4: // HOSTING_AES16_KEY
          return HOSTING_AES16_KEY;
        case 5: // RUNNING_MODE
          return RUNNING_MODE;
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
  private static final int __MACHINEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.MACHINE_ID,_Fields.ADMIN_LOGIN_NAME,_Fields.ADMIN_LOGIN_PASSWD,_Fields.HOSTING_AES16_KEY,_Fields.RUNNING_MODE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MACHINE_ID, new org.apache.thrift.meta_data.FieldMetaData("machineId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ADMIN_LOGIN_NAME, new org.apache.thrift.meta_data.FieldMetaData("adminLoginName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADMIN_LOGIN_PASSWD, new org.apache.thrift.meta_data.FieldMetaData("adminLoginPasswd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HOSTING_AES16_KEY, new org.apache.thrift.meta_data.FieldMetaData("hostingAES16Key", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RUNNING_MODE, new org.apache.thrift.meta_data.FieldMetaData("runningMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, xueqiao.trade.hosting.HostingRunningMode.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostingInitReq.class, metaDataMap);
  }

  public HostingInitReq() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostingInitReq(HostingInitReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.machineId = other.machineId;
    if (other.isSetAdminLoginName()) {
      this.adminLoginName = other.adminLoginName;
    }
    if (other.isSetAdminLoginPasswd()) {
      this.adminLoginPasswd = other.adminLoginPasswd;
    }
    if (other.isSetHostingAES16Key()) {
      this.hostingAES16Key = other.hostingAES16Key;
    }
    if (other.isSetRunningMode()) {
      this.runningMode = other.runningMode;
    }
  }

  public HostingInitReq deepCopy() {
    return new HostingInitReq(this);
  }

  @Override
  public void clear() {
    setMachineIdIsSet(false);
    this.machineId = 0;
    this.adminLoginName = null;
    this.adminLoginPasswd = null;
    this.hostingAES16Key = null;
    this.runningMode = null;
  }

  public long getMachineId() {
    return this.machineId;
  }

  public HostingInitReq setMachineId(long machineId) {
    this.machineId = machineId;
    setMachineIdIsSet(true);
    return this;
  }

  public void unsetMachineId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MACHINEID_ISSET_ID);
  }

  /** Returns true if field machineId is set (has been assigned a value) and false otherwise */
  public boolean isSetMachineId() {
    return EncodingUtils.testBit(__isset_bitfield, __MACHINEID_ISSET_ID);
  }

  public void setMachineIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MACHINEID_ISSET_ID, value);
  }

  public String getAdminLoginName() {
    return this.adminLoginName;
  }

  public HostingInitReq setAdminLoginName(String adminLoginName) {
    this.adminLoginName = adminLoginName;
    return this;
  }

  public void unsetAdminLoginName() {
    this.adminLoginName = null;
  }

  /** Returns true if field adminLoginName is set (has been assigned a value) and false otherwise */
  public boolean isSetAdminLoginName() {
    return this.adminLoginName != null;
  }

  public void setAdminLoginNameIsSet(boolean value) {
    if (!value) {
      this.adminLoginName = null;
    }
  }

  public String getAdminLoginPasswd() {
    return this.adminLoginPasswd;
  }

  public HostingInitReq setAdminLoginPasswd(String adminLoginPasswd) {
    this.adminLoginPasswd = adminLoginPasswd;
    return this;
  }

  public void unsetAdminLoginPasswd() {
    this.adminLoginPasswd = null;
  }

  /** Returns true if field adminLoginPasswd is set (has been assigned a value) and false otherwise */
  public boolean isSetAdminLoginPasswd() {
    return this.adminLoginPasswd != null;
  }

  public void setAdminLoginPasswdIsSet(boolean value) {
    if (!value) {
      this.adminLoginPasswd = null;
    }
  }

  public String getHostingAES16Key() {
    return this.hostingAES16Key;
  }

  public HostingInitReq setHostingAES16Key(String hostingAES16Key) {
    this.hostingAES16Key = hostingAES16Key;
    return this;
  }

  public void unsetHostingAES16Key() {
    this.hostingAES16Key = null;
  }

  /** Returns true if field hostingAES16Key is set (has been assigned a value) and false otherwise */
  public boolean isSetHostingAES16Key() {
    return this.hostingAES16Key != null;
  }

  public void setHostingAES16KeyIsSet(boolean value) {
    if (!value) {
      this.hostingAES16Key = null;
    }
  }

  /**
   * 
   * @see xueqiao.trade.hosting.HostingRunningMode
   */
  public xueqiao.trade.hosting.HostingRunningMode getRunningMode() {
    return this.runningMode;
  }

  /**
   * 
   * @see xueqiao.trade.hosting.HostingRunningMode
   */
  public HostingInitReq setRunningMode(xueqiao.trade.hosting.HostingRunningMode runningMode) {
    this.runningMode = runningMode;
    return this;
  }

  public void unsetRunningMode() {
    this.runningMode = null;
  }

  /** Returns true if field runningMode is set (has been assigned a value) and false otherwise */
  public boolean isSetRunningMode() {
    return this.runningMode != null;
  }

  public void setRunningModeIsSet(boolean value) {
    if (!value) {
      this.runningMode = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MACHINE_ID:
      if (value == null) {
        unsetMachineId();
      } else {
        setMachineId((Long)value);
      }
      break;

    case ADMIN_LOGIN_NAME:
      if (value == null) {
        unsetAdminLoginName();
      } else {
        setAdminLoginName((String)value);
      }
      break;

    case ADMIN_LOGIN_PASSWD:
      if (value == null) {
        unsetAdminLoginPasswd();
      } else {
        setAdminLoginPasswd((String)value);
      }
      break;

    case HOSTING_AES16_KEY:
      if (value == null) {
        unsetHostingAES16Key();
      } else {
        setHostingAES16Key((String)value);
      }
      break;

    case RUNNING_MODE:
      if (value == null) {
        unsetRunningMode();
      } else {
        setRunningMode((xueqiao.trade.hosting.HostingRunningMode)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MACHINE_ID:
      return Long.valueOf(getMachineId());

    case ADMIN_LOGIN_NAME:
      return getAdminLoginName();

    case ADMIN_LOGIN_PASSWD:
      return getAdminLoginPasswd();

    case HOSTING_AES16_KEY:
      return getHostingAES16Key();

    case RUNNING_MODE:
      return getRunningMode();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MACHINE_ID:
      return isSetMachineId();
    case ADMIN_LOGIN_NAME:
      return isSetAdminLoginName();
    case ADMIN_LOGIN_PASSWD:
      return isSetAdminLoginPasswd();
    case HOSTING_AES16_KEY:
      return isSetHostingAES16Key();
    case RUNNING_MODE:
      return isSetRunningMode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostingInitReq)
      return this.equals((HostingInitReq)that);
    return false;
  }

  public boolean equals(HostingInitReq that) {
    if (that == null)
      return false;

    boolean this_present_machineId = true && this.isSetMachineId();
    boolean that_present_machineId = true && that.isSetMachineId();
    if (this_present_machineId || that_present_machineId) {
      if (!(this_present_machineId && that_present_machineId))
        return false;
      if (this.machineId != that.machineId)
        return false;
    }

    boolean this_present_adminLoginName = true && this.isSetAdminLoginName();
    boolean that_present_adminLoginName = true && that.isSetAdminLoginName();
    if (this_present_adminLoginName || that_present_adminLoginName) {
      if (!(this_present_adminLoginName && that_present_adminLoginName))
        return false;
      if (!this.adminLoginName.equals(that.adminLoginName))
        return false;
    }

    boolean this_present_adminLoginPasswd = true && this.isSetAdminLoginPasswd();
    boolean that_present_adminLoginPasswd = true && that.isSetAdminLoginPasswd();
    if (this_present_adminLoginPasswd || that_present_adminLoginPasswd) {
      if (!(this_present_adminLoginPasswd && that_present_adminLoginPasswd))
        return false;
      if (!this.adminLoginPasswd.equals(that.adminLoginPasswd))
        return false;
    }

    boolean this_present_hostingAES16Key = true && this.isSetHostingAES16Key();
    boolean that_present_hostingAES16Key = true && that.isSetHostingAES16Key();
    if (this_present_hostingAES16Key || that_present_hostingAES16Key) {
      if (!(this_present_hostingAES16Key && that_present_hostingAES16Key))
        return false;
      if (!this.hostingAES16Key.equals(that.hostingAES16Key))
        return false;
    }

    boolean this_present_runningMode = true && this.isSetRunningMode();
    boolean that_present_runningMode = true && that.isSetRunningMode();
    if (this_present_runningMode || that_present_runningMode) {
      if (!(this_present_runningMode && that_present_runningMode))
        return false;
      if (!this.runningMode.equals(that.runningMode))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(HostingInitReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMachineId()).compareTo(other.isSetMachineId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMachineId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.machineId, other.machineId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdminLoginName()).compareTo(other.isSetAdminLoginName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdminLoginName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adminLoginName, other.adminLoginName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdminLoginPasswd()).compareTo(other.isSetAdminLoginPasswd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdminLoginPasswd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adminLoginPasswd, other.adminLoginPasswd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHostingAES16Key()).compareTo(other.isSetHostingAES16Key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostingAES16Key()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostingAES16Key, other.hostingAES16Key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunningMode()).compareTo(other.isSetRunningMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunningMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runningMode, other.runningMode);
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
    StringBuilder sb = new StringBuilder("HostingInitReq(");
    boolean first = true;

    if (isSetMachineId()) {
      sb.append("machineId:");
      sb.append(this.machineId);
      first = false;
    }
    if (isSetAdminLoginName()) {
      if (!first) sb.append(", ");
      sb.append("adminLoginName:");
      if (this.adminLoginName == null) {
        sb.append("null");
      } else {
        sb.append(this.adminLoginName);
      }
      first = false;
    }
    if (isSetAdminLoginPasswd()) {
      if (!first) sb.append(", ");
      sb.append("adminLoginPasswd:");
      if (this.adminLoginPasswd == null) {
        sb.append("null");
      } else {
        sb.append(this.adminLoginPasswd);
      }
      first = false;
    }
    if (isSetHostingAES16Key()) {
      if (!first) sb.append(", ");
      sb.append("hostingAES16Key:");
      if (this.hostingAES16Key == null) {
        sb.append("null");
      } else {
        sb.append(this.hostingAES16Key);
      }
      first = false;
    }
    if (isSetRunningMode()) {
      if (!first) sb.append(", ");
      sb.append("runningMode:");
      if (this.runningMode == null) {
        sb.append("null");
      } else {
        sb.append(this.runningMode);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HostingInitReqStandardSchemeFactory implements SchemeFactory {
    public HostingInitReqStandardScheme getScheme() {
      return new HostingInitReqStandardScheme();
    }
  }

  private static class HostingInitReqStandardScheme extends StandardScheme<HostingInitReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HostingInitReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MACHINE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.machineId = iprot.readI64();
              struct.setMachineIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ADMIN_LOGIN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.adminLoginName = iprot.readString();
              struct.setAdminLoginNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADMIN_LOGIN_PASSWD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.adminLoginPasswd = iprot.readString();
              struct.setAdminLoginPasswdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HOSTING_AES16_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostingAES16Key = iprot.readString();
              struct.setHostingAES16KeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RUNNING_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.runningMode = xueqiao.trade.hosting.HostingRunningMode.findByValue(iprot.readI32());
              struct.setRunningModeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HostingInitReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetMachineId()) {
        oprot.writeFieldBegin(MACHINE_ID_FIELD_DESC);
        oprot.writeI64(struct.machineId);
        oprot.writeFieldEnd();
      }
      if (struct.adminLoginName != null) {
        if (struct.isSetAdminLoginName()) {
          oprot.writeFieldBegin(ADMIN_LOGIN_NAME_FIELD_DESC);
          oprot.writeString(struct.adminLoginName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.adminLoginPasswd != null) {
        if (struct.isSetAdminLoginPasswd()) {
          oprot.writeFieldBegin(ADMIN_LOGIN_PASSWD_FIELD_DESC);
          oprot.writeString(struct.adminLoginPasswd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.hostingAES16Key != null) {
        if (struct.isSetHostingAES16Key()) {
          oprot.writeFieldBegin(HOSTING_AES16_KEY_FIELD_DESC);
          oprot.writeString(struct.hostingAES16Key);
          oprot.writeFieldEnd();
        }
      }
      if (struct.runningMode != null) {
        if (struct.isSetRunningMode()) {
          oprot.writeFieldBegin(RUNNING_MODE_FIELD_DESC);
          oprot.writeI32(struct.runningMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostingInitReqTupleSchemeFactory implements SchemeFactory {
    public HostingInitReqTupleScheme getScheme() {
      return new HostingInitReqTupleScheme();
    }
  }

  private static class HostingInitReqTupleScheme extends TupleScheme<HostingInitReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HostingInitReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMachineId()) {
        optionals.set(0);
      }
      if (struct.isSetAdminLoginName()) {
        optionals.set(1);
      }
      if (struct.isSetAdminLoginPasswd()) {
        optionals.set(2);
      }
      if (struct.isSetHostingAES16Key()) {
        optionals.set(3);
      }
      if (struct.isSetRunningMode()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMachineId()) {
        oprot.writeI64(struct.machineId);
      }
      if (struct.isSetAdminLoginName()) {
        oprot.writeString(struct.adminLoginName);
      }
      if (struct.isSetAdminLoginPasswd()) {
        oprot.writeString(struct.adminLoginPasswd);
      }
      if (struct.isSetHostingAES16Key()) {
        oprot.writeString(struct.hostingAES16Key);
      }
      if (struct.isSetRunningMode()) {
        oprot.writeI32(struct.runningMode.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HostingInitReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.machineId = iprot.readI64();
        struct.setMachineIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.adminLoginName = iprot.readString();
        struct.setAdminLoginNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.adminLoginPasswd = iprot.readString();
        struct.setAdminLoginPasswdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.hostingAES16Key = iprot.readString();
        struct.setHostingAES16KeyIsSet(true);
      }
      if (incoming.get(4)) {
        struct.runningMode = xueqiao.trade.hosting.HostingRunningMode.findByValue(iprot.readI32());
        struct.setRunningModeIsSet(true);
      }
    }
  }

}

