/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package xueqiao.graph.xiaoha.chart.thriftapi;

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

public class ReqChartFolderOption implements org.apache.thrift.TBase<ReqChartFolderOption, ReqChartFolderOption._Fields>, java.io.Serializable, Cloneable, Comparable<ReqChartFolderOption> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReqChartFolderOption");

  private static final org.apache.thrift.protocol.TField CHART_FOLDER_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("chartFolderIds", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField XIAOHA_OBJ_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("xiaohaObjId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PARENT_FOLDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("parentFolderId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField KEY_WORDS_FIELD_DESC = new org.apache.thrift.protocol.TField("keyWords", org.apache.thrift.protocol.TType.SET, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReqChartFolderOptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReqChartFolderOptionTupleSchemeFactory());
  }

  public Set<Long> chartFolderIds; // optional
  public String xiaohaObjId; // optional
  public long parentFolderId; // optional
  public String name; // optional
  public Set<String> keyWords; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHART_FOLDER_IDS((short)1, "chartFolderIds"),
    XIAOHA_OBJ_ID((short)2, "xiaohaObjId"),
    PARENT_FOLDER_ID((short)3, "parentFolderId"),
    NAME((short)4, "name"),
    KEY_WORDS((short)5, "keyWords");

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
        case 1: // CHART_FOLDER_IDS
          return CHART_FOLDER_IDS;
        case 2: // XIAOHA_OBJ_ID
          return XIAOHA_OBJ_ID;
        case 3: // PARENT_FOLDER_ID
          return PARENT_FOLDER_ID;
        case 4: // NAME
          return NAME;
        case 5: // KEY_WORDS
          return KEY_WORDS;
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
  private static final int __PARENTFOLDERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CHART_FOLDER_IDS,_Fields.XIAOHA_OBJ_ID,_Fields.PARENT_FOLDER_ID,_Fields.NAME,_Fields.KEY_WORDS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHART_FOLDER_IDS, new org.apache.thrift.meta_data.FieldMetaData("chartFolderIds", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.XIAOHA_OBJ_ID, new org.apache.thrift.meta_data.FieldMetaData("xiaohaObjId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARENT_FOLDER_ID, new org.apache.thrift.meta_data.FieldMetaData("parentFolderId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY_WORDS, new org.apache.thrift.meta_data.FieldMetaData("keyWords", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReqChartFolderOption.class, metaDataMap);
  }

  public ReqChartFolderOption() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReqChartFolderOption(ReqChartFolderOption other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChartFolderIds()) {
      Set<Long> __this__chartFolderIds = new HashSet<Long>(other.chartFolderIds);
      this.chartFolderIds = __this__chartFolderIds;
    }
    if (other.isSetXiaohaObjId()) {
      this.xiaohaObjId = other.xiaohaObjId;
    }
    this.parentFolderId = other.parentFolderId;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetKeyWords()) {
      Set<String> __this__keyWords = new HashSet<String>(other.keyWords);
      this.keyWords = __this__keyWords;
    }
  }

  public ReqChartFolderOption deepCopy() {
    return new ReqChartFolderOption(this);
  }

  @Override
  public void clear() {
    this.chartFolderIds = null;
    this.xiaohaObjId = null;
    setParentFolderIdIsSet(false);
    this.parentFolderId = 0;
    this.name = null;
    this.keyWords = null;
  }

  public int getChartFolderIdsSize() {
    return (this.chartFolderIds == null) ? 0 : this.chartFolderIds.size();
  }

  public java.util.Iterator<Long> getChartFolderIdsIterator() {
    return (this.chartFolderIds == null) ? null : this.chartFolderIds.iterator();
  }

  public void addToChartFolderIds(long elem) {
    if (this.chartFolderIds == null) {
      this.chartFolderIds = new HashSet<Long>();
    }
    this.chartFolderIds.add(elem);
  }

  public Set<Long> getChartFolderIds() {
    return this.chartFolderIds;
  }

  public ReqChartFolderOption setChartFolderIds(Set<Long> chartFolderIds) {
    this.chartFolderIds = chartFolderIds;
    return this;
  }

  public void unsetChartFolderIds() {
    this.chartFolderIds = null;
  }

  /** Returns true if field chartFolderIds is set (has been assigned a value) and false otherwise */
  public boolean isSetChartFolderIds() {
    return this.chartFolderIds != null;
  }

  public void setChartFolderIdsIsSet(boolean value) {
    if (!value) {
      this.chartFolderIds = null;
    }
  }

  public String getXiaohaObjId() {
    return this.xiaohaObjId;
  }

  public ReqChartFolderOption setXiaohaObjId(String xiaohaObjId) {
    this.xiaohaObjId = xiaohaObjId;
    return this;
  }

  public void unsetXiaohaObjId() {
    this.xiaohaObjId = null;
  }

  /** Returns true if field xiaohaObjId is set (has been assigned a value) and false otherwise */
  public boolean isSetXiaohaObjId() {
    return this.xiaohaObjId != null;
  }

  public void setXiaohaObjIdIsSet(boolean value) {
    if (!value) {
      this.xiaohaObjId = null;
    }
  }

  public long getParentFolderId() {
    return this.parentFolderId;
  }

  public ReqChartFolderOption setParentFolderId(long parentFolderId) {
    this.parentFolderId = parentFolderId;
    setParentFolderIdIsSet(true);
    return this;
  }

  public void unsetParentFolderId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARENTFOLDERID_ISSET_ID);
  }

  /** Returns true if field parentFolderId is set (has been assigned a value) and false otherwise */
  public boolean isSetParentFolderId() {
    return EncodingUtils.testBit(__isset_bitfield, __PARENTFOLDERID_ISSET_ID);
  }

  public void setParentFolderIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARENTFOLDERID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public ReqChartFolderOption setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getKeyWordsSize() {
    return (this.keyWords == null) ? 0 : this.keyWords.size();
  }

  public java.util.Iterator<String> getKeyWordsIterator() {
    return (this.keyWords == null) ? null : this.keyWords.iterator();
  }

  public void addToKeyWords(String elem) {
    if (this.keyWords == null) {
      this.keyWords = new HashSet<String>();
    }
    this.keyWords.add(elem);
  }

  public Set<String> getKeyWords() {
    return this.keyWords;
  }

  public ReqChartFolderOption setKeyWords(Set<String> keyWords) {
    this.keyWords = keyWords;
    return this;
  }

  public void unsetKeyWords() {
    this.keyWords = null;
  }

  /** Returns true if field keyWords is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyWords() {
    return this.keyWords != null;
  }

  public void setKeyWordsIsSet(boolean value) {
    if (!value) {
      this.keyWords = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHART_FOLDER_IDS:
      if (value == null) {
        unsetChartFolderIds();
      } else {
        setChartFolderIds((Set<Long>)value);
      }
      break;

    case XIAOHA_OBJ_ID:
      if (value == null) {
        unsetXiaohaObjId();
      } else {
        setXiaohaObjId((String)value);
      }
      break;

    case PARENT_FOLDER_ID:
      if (value == null) {
        unsetParentFolderId();
      } else {
        setParentFolderId((Long)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case KEY_WORDS:
      if (value == null) {
        unsetKeyWords();
      } else {
        setKeyWords((Set<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHART_FOLDER_IDS:
      return getChartFolderIds();

    case XIAOHA_OBJ_ID:
      return getXiaohaObjId();

    case PARENT_FOLDER_ID:
      return Long.valueOf(getParentFolderId());

    case NAME:
      return getName();

    case KEY_WORDS:
      return getKeyWords();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHART_FOLDER_IDS:
      return isSetChartFolderIds();
    case XIAOHA_OBJ_ID:
      return isSetXiaohaObjId();
    case PARENT_FOLDER_ID:
      return isSetParentFolderId();
    case NAME:
      return isSetName();
    case KEY_WORDS:
      return isSetKeyWords();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReqChartFolderOption)
      return this.equals((ReqChartFolderOption)that);
    return false;
  }

  public boolean equals(ReqChartFolderOption that) {
    if (that == null)
      return false;

    boolean this_present_chartFolderIds = true && this.isSetChartFolderIds();
    boolean that_present_chartFolderIds = true && that.isSetChartFolderIds();
    if (this_present_chartFolderIds || that_present_chartFolderIds) {
      if (!(this_present_chartFolderIds && that_present_chartFolderIds))
        return false;
      if (!this.chartFolderIds.equals(that.chartFolderIds))
        return false;
    }

    boolean this_present_xiaohaObjId = true && this.isSetXiaohaObjId();
    boolean that_present_xiaohaObjId = true && that.isSetXiaohaObjId();
    if (this_present_xiaohaObjId || that_present_xiaohaObjId) {
      if (!(this_present_xiaohaObjId && that_present_xiaohaObjId))
        return false;
      if (!this.xiaohaObjId.equals(that.xiaohaObjId))
        return false;
    }

    boolean this_present_parentFolderId = true && this.isSetParentFolderId();
    boolean that_present_parentFolderId = true && that.isSetParentFolderId();
    if (this_present_parentFolderId || that_present_parentFolderId) {
      if (!(this_present_parentFolderId && that_present_parentFolderId))
        return false;
      if (this.parentFolderId != that.parentFolderId)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_keyWords = true && this.isSetKeyWords();
    boolean that_present_keyWords = true && that.isSetKeyWords();
    if (this_present_keyWords || that_present_keyWords) {
      if (!(this_present_keyWords && that_present_keyWords))
        return false;
      if (!this.keyWords.equals(that.keyWords))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ReqChartFolderOption other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChartFolderIds()).compareTo(other.isSetChartFolderIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChartFolderIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chartFolderIds, other.chartFolderIds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetXiaohaObjId()).compareTo(other.isSetXiaohaObjId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXiaohaObjId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xiaohaObjId, other.xiaohaObjId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParentFolderId()).compareTo(other.isSetParentFolderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParentFolderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parentFolderId, other.parentFolderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeyWords()).compareTo(other.isSetKeyWords());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyWords()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyWords, other.keyWords);
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
    StringBuilder sb = new StringBuilder("ReqChartFolderOption(");
    boolean first = true;

    if (isSetChartFolderIds()) {
      sb.append("chartFolderIds:");
      if (this.chartFolderIds == null) {
        sb.append("null");
      } else {
        sb.append(this.chartFolderIds);
      }
      first = false;
    }
    if (isSetXiaohaObjId()) {
      if (!first) sb.append(", ");
      sb.append("xiaohaObjId:");
      if (this.xiaohaObjId == null) {
        sb.append("null");
      } else {
        sb.append(this.xiaohaObjId);
      }
      first = false;
    }
    if (isSetParentFolderId()) {
      if (!first) sb.append(", ");
      sb.append("parentFolderId:");
      sb.append(this.parentFolderId);
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetKeyWords()) {
      if (!first) sb.append(", ");
      sb.append("keyWords:");
      if (this.keyWords == null) {
        sb.append("null");
      } else {
        sb.append(this.keyWords);
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

  private static class ReqChartFolderOptionStandardSchemeFactory implements SchemeFactory {
    public ReqChartFolderOptionStandardScheme getScheme() {
      return new ReqChartFolderOptionStandardScheme();
    }
  }

  private static class ReqChartFolderOptionStandardScheme extends StandardScheme<ReqChartFolderOption> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReqChartFolderOption struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHART_FOLDER_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set80 = iprot.readSetBegin();
                struct.chartFolderIds = new HashSet<Long>(2*_set80.size);
                for (int _i81 = 0; _i81 < _set80.size; ++_i81)
                {
                  long _elem82;
                  _elem82 = iprot.readI64();
                  struct.chartFolderIds.add(_elem82);
                }
                iprot.readSetEnd();
              }
              struct.setChartFolderIdsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // XIAOHA_OBJ_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.xiaohaObjId = iprot.readString();
              struct.setXiaohaObjIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARENT_FOLDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.parentFolderId = iprot.readI64();
              struct.setParentFolderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // KEY_WORDS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set83 = iprot.readSetBegin();
                struct.keyWords = new HashSet<String>(2*_set83.size);
                for (int _i84 = 0; _i84 < _set83.size; ++_i84)
                {
                  String _elem85;
                  _elem85 = iprot.readString();
                  struct.keyWords.add(_elem85);
                }
                iprot.readSetEnd();
              }
              struct.setKeyWordsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReqChartFolderOption struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.chartFolderIds != null) {
        if (struct.isSetChartFolderIds()) {
          oprot.writeFieldBegin(CHART_FOLDER_IDS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, struct.chartFolderIds.size()));
            for (long _iter86 : struct.chartFolderIds)
            {
              oprot.writeI64(_iter86);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.xiaohaObjId != null) {
        if (struct.isSetXiaohaObjId()) {
          oprot.writeFieldBegin(XIAOHA_OBJ_ID_FIELD_DESC);
          oprot.writeString(struct.xiaohaObjId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetParentFolderId()) {
        oprot.writeFieldBegin(PARENT_FOLDER_ID_FIELD_DESC);
        oprot.writeI64(struct.parentFolderId);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.keyWords != null) {
        if (struct.isSetKeyWords()) {
          oprot.writeFieldBegin(KEY_WORDS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.keyWords.size()));
            for (String _iter87 : struct.keyWords)
            {
              oprot.writeString(_iter87);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReqChartFolderOptionTupleSchemeFactory implements SchemeFactory {
    public ReqChartFolderOptionTupleScheme getScheme() {
      return new ReqChartFolderOptionTupleScheme();
    }
  }

  private static class ReqChartFolderOptionTupleScheme extends TupleScheme<ReqChartFolderOption> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReqChartFolderOption struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChartFolderIds()) {
        optionals.set(0);
      }
      if (struct.isSetXiaohaObjId()) {
        optionals.set(1);
      }
      if (struct.isSetParentFolderId()) {
        optionals.set(2);
      }
      if (struct.isSetName()) {
        optionals.set(3);
      }
      if (struct.isSetKeyWords()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetChartFolderIds()) {
        {
          oprot.writeI32(struct.chartFolderIds.size());
          for (long _iter88 : struct.chartFolderIds)
          {
            oprot.writeI64(_iter88);
          }
        }
      }
      if (struct.isSetXiaohaObjId()) {
        oprot.writeString(struct.xiaohaObjId);
      }
      if (struct.isSetParentFolderId()) {
        oprot.writeI64(struct.parentFolderId);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetKeyWords()) {
        {
          oprot.writeI32(struct.keyWords.size());
          for (String _iter89 : struct.keyWords)
          {
            oprot.writeString(_iter89);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReqChartFolderOption struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set90 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.chartFolderIds = new HashSet<Long>(2*_set90.size);
          for (int _i91 = 0; _i91 < _set90.size; ++_i91)
          {
            long _elem92;
            _elem92 = iprot.readI64();
            struct.chartFolderIds.add(_elem92);
          }
        }
        struct.setChartFolderIdsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.xiaohaObjId = iprot.readString();
        struct.setXiaohaObjIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.parentFolderId = iprot.readI64();
        struct.setParentFolderIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TSet _set93 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.keyWords = new HashSet<String>(2*_set93.size);
          for (int _i94 = 0; _i94 < _set93.size; ++_i94)
          {
            String _elem95;
            _elem95 = iprot.readString();
            struct.keyWords.add(_elem95);
          }
        }
        struct.setKeyWordsIsSet(true);
      }
    }
  }

}

