/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package xueqiao.trade.hosting;

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

public class HostingExecOrderContractSummary implements org.apache.thrift.TBase<HostingExecOrderContractSummary, HostingExecOrderContractSummary._Fields>, java.io.Serializable, Cloneable, Comparable<HostingExecOrderContractSummary> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostingExecOrderContractSummary");

  private static final org.apache.thrift.protocol.TField SLED_CONTRACT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sledContractId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SLED_CONTRACT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("sledContractCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SLED_COMMODITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sledCommodityId", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField SLED_COMMODITY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("sledCommodityType", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField SLED_COMMODITY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("sledCommodityCode", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SLED_EXCHANGE_MIC_FIELD_DESC = new org.apache.thrift.protocol.TField("sledExchangeMic", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField RELATED_LEGS_FIELD_DESC = new org.apache.thrift.protocol.TField("relatedLegs", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostingExecOrderContractSummaryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostingExecOrderContractSummaryTupleSchemeFactory());
  }

  public long sledContractId; // optional
  public String sledContractCode; // optional
  public long sledCommodityId; // optional
  public short sledCommodityType; // optional
  public String sledCommodityCode; // optional
  public String sledExchangeMic; // optional
  public List<HostingExecOrderLegContractSummary> relatedLegs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SLED_CONTRACT_ID((short)1, "sledContractId"),
    SLED_CONTRACT_CODE((short)2, "sledContractCode"),
    SLED_COMMODITY_ID((short)3, "sledCommodityId"),
    SLED_COMMODITY_TYPE((short)4, "sledCommodityType"),
    SLED_COMMODITY_CODE((short)5, "sledCommodityCode"),
    SLED_EXCHANGE_MIC((short)6, "sledExchangeMic"),
    RELATED_LEGS((short)7, "relatedLegs");

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
        case 1: // SLED_CONTRACT_ID
          return SLED_CONTRACT_ID;
        case 2: // SLED_CONTRACT_CODE
          return SLED_CONTRACT_CODE;
        case 3: // SLED_COMMODITY_ID
          return SLED_COMMODITY_ID;
        case 4: // SLED_COMMODITY_TYPE
          return SLED_COMMODITY_TYPE;
        case 5: // SLED_COMMODITY_CODE
          return SLED_COMMODITY_CODE;
        case 6: // SLED_EXCHANGE_MIC
          return SLED_EXCHANGE_MIC;
        case 7: // RELATED_LEGS
          return RELATED_LEGS;
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
  private static final int __SLEDCONTRACTID_ISSET_ID = 0;
  private static final int __SLEDCOMMODITYID_ISSET_ID = 1;
  private static final int __SLEDCOMMODITYTYPE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.SLED_CONTRACT_ID,_Fields.SLED_CONTRACT_CODE,_Fields.SLED_COMMODITY_ID,_Fields.SLED_COMMODITY_TYPE,_Fields.SLED_COMMODITY_CODE,_Fields.SLED_EXCHANGE_MIC,_Fields.RELATED_LEGS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SLED_CONTRACT_ID, new org.apache.thrift.meta_data.FieldMetaData("sledContractId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SLED_CONTRACT_CODE, new org.apache.thrift.meta_data.FieldMetaData("sledContractCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLED_COMMODITY_ID, new org.apache.thrift.meta_data.FieldMetaData("sledCommodityId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SLED_COMMODITY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("sledCommodityType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SLED_COMMODITY_CODE, new org.apache.thrift.meta_data.FieldMetaData("sledCommodityCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SLED_EXCHANGE_MIC, new org.apache.thrift.meta_data.FieldMetaData("sledExchangeMic", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RELATED_LEGS, new org.apache.thrift.meta_data.FieldMetaData("relatedLegs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HostingExecOrderLegContractSummary.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostingExecOrderContractSummary.class, metaDataMap);
  }

  public HostingExecOrderContractSummary() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostingExecOrderContractSummary(HostingExecOrderContractSummary other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sledContractId = other.sledContractId;
    if (other.isSetSledContractCode()) {
      this.sledContractCode = other.sledContractCode;
    }
    this.sledCommodityId = other.sledCommodityId;
    this.sledCommodityType = other.sledCommodityType;
    if (other.isSetSledCommodityCode()) {
      this.sledCommodityCode = other.sledCommodityCode;
    }
    if (other.isSetSledExchangeMic()) {
      this.sledExchangeMic = other.sledExchangeMic;
    }
    if (other.isSetRelatedLegs()) {
      List<HostingExecOrderLegContractSummary> __this__relatedLegs = new ArrayList<HostingExecOrderLegContractSummary>(other.relatedLegs.size());
      for (HostingExecOrderLegContractSummary other_element : other.relatedLegs) {
        __this__relatedLegs.add(new HostingExecOrderLegContractSummary(other_element));
      }
      this.relatedLegs = __this__relatedLegs;
    }
  }

  public HostingExecOrderContractSummary deepCopy() {
    return new HostingExecOrderContractSummary(this);
  }

  @Override
  public void clear() {
    setSledContractIdIsSet(false);
    this.sledContractId = 0;
    this.sledContractCode = null;
    setSledCommodityIdIsSet(false);
    this.sledCommodityId = 0;
    setSledCommodityTypeIsSet(false);
    this.sledCommodityType = 0;
    this.sledCommodityCode = null;
    this.sledExchangeMic = null;
    this.relatedLegs = null;
  }

  public long getSledContractId() {
    return this.sledContractId;
  }

  public HostingExecOrderContractSummary setSledContractId(long sledContractId) {
    this.sledContractId = sledContractId;
    setSledContractIdIsSet(true);
    return this;
  }

  public void unsetSledContractId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SLEDCONTRACTID_ISSET_ID);
  }

  /** Returns true if field sledContractId is set (has been assigned a value) and false otherwise */
  public boolean isSetSledContractId() {
    return EncodingUtils.testBit(__isset_bitfield, __SLEDCONTRACTID_ISSET_ID);
  }

  public void setSledContractIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SLEDCONTRACTID_ISSET_ID, value);
  }

  public String getSledContractCode() {
    return this.sledContractCode;
  }

  public HostingExecOrderContractSummary setSledContractCode(String sledContractCode) {
    this.sledContractCode = sledContractCode;
    return this;
  }

  public void unsetSledContractCode() {
    this.sledContractCode = null;
  }

  /** Returns true if field sledContractCode is set (has been assigned a value) and false otherwise */
  public boolean isSetSledContractCode() {
    return this.sledContractCode != null;
  }

  public void setSledContractCodeIsSet(boolean value) {
    if (!value) {
      this.sledContractCode = null;
    }
  }

  public long getSledCommodityId() {
    return this.sledCommodityId;
  }

  public HostingExecOrderContractSummary setSledCommodityId(long sledCommodityId) {
    this.sledCommodityId = sledCommodityId;
    setSledCommodityIdIsSet(true);
    return this;
  }

  public void unsetSledCommodityId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SLEDCOMMODITYID_ISSET_ID);
  }

  /** Returns true if field sledCommodityId is set (has been assigned a value) and false otherwise */
  public boolean isSetSledCommodityId() {
    return EncodingUtils.testBit(__isset_bitfield, __SLEDCOMMODITYID_ISSET_ID);
  }

  public void setSledCommodityIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SLEDCOMMODITYID_ISSET_ID, value);
  }

  public short getSledCommodityType() {
    return this.sledCommodityType;
  }

  public HostingExecOrderContractSummary setSledCommodityType(short sledCommodityType) {
    this.sledCommodityType = sledCommodityType;
    setSledCommodityTypeIsSet(true);
    return this;
  }

  public void unsetSledCommodityType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SLEDCOMMODITYTYPE_ISSET_ID);
  }

  /** Returns true if field sledCommodityType is set (has been assigned a value) and false otherwise */
  public boolean isSetSledCommodityType() {
    return EncodingUtils.testBit(__isset_bitfield, __SLEDCOMMODITYTYPE_ISSET_ID);
  }

  public void setSledCommodityTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SLEDCOMMODITYTYPE_ISSET_ID, value);
  }

  public String getSledCommodityCode() {
    return this.sledCommodityCode;
  }

  public HostingExecOrderContractSummary setSledCommodityCode(String sledCommodityCode) {
    this.sledCommodityCode = sledCommodityCode;
    return this;
  }

  public void unsetSledCommodityCode() {
    this.sledCommodityCode = null;
  }

  /** Returns true if field sledCommodityCode is set (has been assigned a value) and false otherwise */
  public boolean isSetSledCommodityCode() {
    return this.sledCommodityCode != null;
  }

  public void setSledCommodityCodeIsSet(boolean value) {
    if (!value) {
      this.sledCommodityCode = null;
    }
  }

  public String getSledExchangeMic() {
    return this.sledExchangeMic;
  }

  public HostingExecOrderContractSummary setSledExchangeMic(String sledExchangeMic) {
    this.sledExchangeMic = sledExchangeMic;
    return this;
  }

  public void unsetSledExchangeMic() {
    this.sledExchangeMic = null;
  }

  /** Returns true if field sledExchangeMic is set (has been assigned a value) and false otherwise */
  public boolean isSetSledExchangeMic() {
    return this.sledExchangeMic != null;
  }

  public void setSledExchangeMicIsSet(boolean value) {
    if (!value) {
      this.sledExchangeMic = null;
    }
  }

  public int getRelatedLegsSize() {
    return (this.relatedLegs == null) ? 0 : this.relatedLegs.size();
  }

  public java.util.Iterator<HostingExecOrderLegContractSummary> getRelatedLegsIterator() {
    return (this.relatedLegs == null) ? null : this.relatedLegs.iterator();
  }

  public void addToRelatedLegs(HostingExecOrderLegContractSummary elem) {
    if (this.relatedLegs == null) {
      this.relatedLegs = new ArrayList<HostingExecOrderLegContractSummary>();
    }
    this.relatedLegs.add(elem);
  }

  public List<HostingExecOrderLegContractSummary> getRelatedLegs() {
    return this.relatedLegs;
  }

  public HostingExecOrderContractSummary setRelatedLegs(List<HostingExecOrderLegContractSummary> relatedLegs) {
    this.relatedLegs = relatedLegs;
    return this;
  }

  public void unsetRelatedLegs() {
    this.relatedLegs = null;
  }

  /** Returns true if field relatedLegs is set (has been assigned a value) and false otherwise */
  public boolean isSetRelatedLegs() {
    return this.relatedLegs != null;
  }

  public void setRelatedLegsIsSet(boolean value) {
    if (!value) {
      this.relatedLegs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SLED_CONTRACT_ID:
      if (value == null) {
        unsetSledContractId();
      } else {
        setSledContractId((Long)value);
      }
      break;

    case SLED_CONTRACT_CODE:
      if (value == null) {
        unsetSledContractCode();
      } else {
        setSledContractCode((String)value);
      }
      break;

    case SLED_COMMODITY_ID:
      if (value == null) {
        unsetSledCommodityId();
      } else {
        setSledCommodityId((Long)value);
      }
      break;

    case SLED_COMMODITY_TYPE:
      if (value == null) {
        unsetSledCommodityType();
      } else {
        setSledCommodityType((Short)value);
      }
      break;

    case SLED_COMMODITY_CODE:
      if (value == null) {
        unsetSledCommodityCode();
      } else {
        setSledCommodityCode((String)value);
      }
      break;

    case SLED_EXCHANGE_MIC:
      if (value == null) {
        unsetSledExchangeMic();
      } else {
        setSledExchangeMic((String)value);
      }
      break;

    case RELATED_LEGS:
      if (value == null) {
        unsetRelatedLegs();
      } else {
        setRelatedLegs((List<HostingExecOrderLegContractSummary>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SLED_CONTRACT_ID:
      return Long.valueOf(getSledContractId());

    case SLED_CONTRACT_CODE:
      return getSledContractCode();

    case SLED_COMMODITY_ID:
      return Long.valueOf(getSledCommodityId());

    case SLED_COMMODITY_TYPE:
      return Short.valueOf(getSledCommodityType());

    case SLED_COMMODITY_CODE:
      return getSledCommodityCode();

    case SLED_EXCHANGE_MIC:
      return getSledExchangeMic();

    case RELATED_LEGS:
      return getRelatedLegs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SLED_CONTRACT_ID:
      return isSetSledContractId();
    case SLED_CONTRACT_CODE:
      return isSetSledContractCode();
    case SLED_COMMODITY_ID:
      return isSetSledCommodityId();
    case SLED_COMMODITY_TYPE:
      return isSetSledCommodityType();
    case SLED_COMMODITY_CODE:
      return isSetSledCommodityCode();
    case SLED_EXCHANGE_MIC:
      return isSetSledExchangeMic();
    case RELATED_LEGS:
      return isSetRelatedLegs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostingExecOrderContractSummary)
      return this.equals((HostingExecOrderContractSummary)that);
    return false;
  }

  public boolean equals(HostingExecOrderContractSummary that) {
    if (that == null)
      return false;

    boolean this_present_sledContractId = true && this.isSetSledContractId();
    boolean that_present_sledContractId = true && that.isSetSledContractId();
    if (this_present_sledContractId || that_present_sledContractId) {
      if (!(this_present_sledContractId && that_present_sledContractId))
        return false;
      if (this.sledContractId != that.sledContractId)
        return false;
    }

    boolean this_present_sledContractCode = true && this.isSetSledContractCode();
    boolean that_present_sledContractCode = true && that.isSetSledContractCode();
    if (this_present_sledContractCode || that_present_sledContractCode) {
      if (!(this_present_sledContractCode && that_present_sledContractCode))
        return false;
      if (!this.sledContractCode.equals(that.sledContractCode))
        return false;
    }

    boolean this_present_sledCommodityId = true && this.isSetSledCommodityId();
    boolean that_present_sledCommodityId = true && that.isSetSledCommodityId();
    if (this_present_sledCommodityId || that_present_sledCommodityId) {
      if (!(this_present_sledCommodityId && that_present_sledCommodityId))
        return false;
      if (this.sledCommodityId != that.sledCommodityId)
        return false;
    }

    boolean this_present_sledCommodityType = true && this.isSetSledCommodityType();
    boolean that_present_sledCommodityType = true && that.isSetSledCommodityType();
    if (this_present_sledCommodityType || that_present_sledCommodityType) {
      if (!(this_present_sledCommodityType && that_present_sledCommodityType))
        return false;
      if (this.sledCommodityType != that.sledCommodityType)
        return false;
    }

    boolean this_present_sledCommodityCode = true && this.isSetSledCommodityCode();
    boolean that_present_sledCommodityCode = true && that.isSetSledCommodityCode();
    if (this_present_sledCommodityCode || that_present_sledCommodityCode) {
      if (!(this_present_sledCommodityCode && that_present_sledCommodityCode))
        return false;
      if (!this.sledCommodityCode.equals(that.sledCommodityCode))
        return false;
    }

    boolean this_present_sledExchangeMic = true && this.isSetSledExchangeMic();
    boolean that_present_sledExchangeMic = true && that.isSetSledExchangeMic();
    if (this_present_sledExchangeMic || that_present_sledExchangeMic) {
      if (!(this_present_sledExchangeMic && that_present_sledExchangeMic))
        return false;
      if (!this.sledExchangeMic.equals(that.sledExchangeMic))
        return false;
    }

    boolean this_present_relatedLegs = true && this.isSetRelatedLegs();
    boolean that_present_relatedLegs = true && that.isSetRelatedLegs();
    if (this_present_relatedLegs || that_present_relatedLegs) {
      if (!(this_present_relatedLegs && that_present_relatedLegs))
        return false;
      if (!this.relatedLegs.equals(that.relatedLegs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(HostingExecOrderContractSummary other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSledContractId()).compareTo(other.isSetSledContractId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledContractId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledContractId, other.sledContractId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSledContractCode()).compareTo(other.isSetSledContractCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledContractCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledContractCode, other.sledContractCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSledCommodityId()).compareTo(other.isSetSledCommodityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledCommodityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledCommodityId, other.sledCommodityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSledCommodityType()).compareTo(other.isSetSledCommodityType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledCommodityType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledCommodityType, other.sledCommodityType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSledCommodityCode()).compareTo(other.isSetSledCommodityCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledCommodityCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledCommodityCode, other.sledCommodityCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSledExchangeMic()).compareTo(other.isSetSledExchangeMic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSledExchangeMic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sledExchangeMic, other.sledExchangeMic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRelatedLegs()).compareTo(other.isSetRelatedLegs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelatedLegs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relatedLegs, other.relatedLegs);
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
    StringBuilder sb = new StringBuilder("HostingExecOrderContractSummary(");
    boolean first = true;

    if (isSetSledContractId()) {
      sb.append("sledContractId:");
      sb.append(this.sledContractId);
      first = false;
    }
    if (isSetSledContractCode()) {
      if (!first) sb.append(", ");
      sb.append("sledContractCode:");
      if (this.sledContractCode == null) {
        sb.append("null");
      } else {
        sb.append(this.sledContractCode);
      }
      first = false;
    }
    if (isSetSledCommodityId()) {
      if (!first) sb.append(", ");
      sb.append("sledCommodityId:");
      sb.append(this.sledCommodityId);
      first = false;
    }
    if (isSetSledCommodityType()) {
      if (!first) sb.append(", ");
      sb.append("sledCommodityType:");
      sb.append(this.sledCommodityType);
      first = false;
    }
    if (isSetSledCommodityCode()) {
      if (!first) sb.append(", ");
      sb.append("sledCommodityCode:");
      if (this.sledCommodityCode == null) {
        sb.append("null");
      } else {
        sb.append(this.sledCommodityCode);
      }
      first = false;
    }
    if (isSetSledExchangeMic()) {
      if (!first) sb.append(", ");
      sb.append("sledExchangeMic:");
      if (this.sledExchangeMic == null) {
        sb.append("null");
      } else {
        sb.append(this.sledExchangeMic);
      }
      first = false;
    }
    if (isSetRelatedLegs()) {
      if (!first) sb.append(", ");
      sb.append("relatedLegs:");
      if (this.relatedLegs == null) {
        sb.append("null");
      } else {
        sb.append(this.relatedLegs);
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

  private static class HostingExecOrderContractSummaryStandardSchemeFactory implements SchemeFactory {
    public HostingExecOrderContractSummaryStandardScheme getScheme() {
      return new HostingExecOrderContractSummaryStandardScheme();
    }
  }

  private static class HostingExecOrderContractSummaryStandardScheme extends StandardScheme<HostingExecOrderContractSummary> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HostingExecOrderContractSummary struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SLED_CONTRACT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sledContractId = iprot.readI64();
              struct.setSledContractIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SLED_CONTRACT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sledContractCode = iprot.readString();
              struct.setSledContractCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SLED_COMMODITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sledCommodityId = iprot.readI64();
              struct.setSledCommodityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SLED_COMMODITY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.sledCommodityType = iprot.readI16();
              struct.setSledCommodityTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SLED_COMMODITY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sledCommodityCode = iprot.readString();
              struct.setSledCommodityCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SLED_EXCHANGE_MIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sledExchangeMic = iprot.readString();
              struct.setSledExchangeMicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // RELATED_LEGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list124 = iprot.readListBegin();
                struct.relatedLegs = new ArrayList<HostingExecOrderLegContractSummary>(_list124.size);
                for (int _i125 = 0; _i125 < _list124.size; ++_i125)
                {
                  HostingExecOrderLegContractSummary _elem126;
                  _elem126 = new HostingExecOrderLegContractSummary();
                  _elem126.read(iprot);
                  struct.relatedLegs.add(_elem126);
                }
                iprot.readListEnd();
              }
              struct.setRelatedLegsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HostingExecOrderContractSummary struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetSledContractId()) {
        oprot.writeFieldBegin(SLED_CONTRACT_ID_FIELD_DESC);
        oprot.writeI64(struct.sledContractId);
        oprot.writeFieldEnd();
      }
      if (struct.sledContractCode != null) {
        if (struct.isSetSledContractCode()) {
          oprot.writeFieldBegin(SLED_CONTRACT_CODE_FIELD_DESC);
          oprot.writeString(struct.sledContractCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSledCommodityId()) {
        oprot.writeFieldBegin(SLED_COMMODITY_ID_FIELD_DESC);
        oprot.writeI64(struct.sledCommodityId);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSledCommodityType()) {
        oprot.writeFieldBegin(SLED_COMMODITY_TYPE_FIELD_DESC);
        oprot.writeI16(struct.sledCommodityType);
        oprot.writeFieldEnd();
      }
      if (struct.sledCommodityCode != null) {
        if (struct.isSetSledCommodityCode()) {
          oprot.writeFieldBegin(SLED_COMMODITY_CODE_FIELD_DESC);
          oprot.writeString(struct.sledCommodityCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sledExchangeMic != null) {
        if (struct.isSetSledExchangeMic()) {
          oprot.writeFieldBegin(SLED_EXCHANGE_MIC_FIELD_DESC);
          oprot.writeString(struct.sledExchangeMic);
          oprot.writeFieldEnd();
        }
      }
      if (struct.relatedLegs != null) {
        if (struct.isSetRelatedLegs()) {
          oprot.writeFieldBegin(RELATED_LEGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.relatedLegs.size()));
            for (HostingExecOrderLegContractSummary _iter127 : struct.relatedLegs)
            {
              _iter127.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostingExecOrderContractSummaryTupleSchemeFactory implements SchemeFactory {
    public HostingExecOrderContractSummaryTupleScheme getScheme() {
      return new HostingExecOrderContractSummaryTupleScheme();
    }
  }

  private static class HostingExecOrderContractSummaryTupleScheme extends TupleScheme<HostingExecOrderContractSummary> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HostingExecOrderContractSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSledContractId()) {
        optionals.set(0);
      }
      if (struct.isSetSledContractCode()) {
        optionals.set(1);
      }
      if (struct.isSetSledCommodityId()) {
        optionals.set(2);
      }
      if (struct.isSetSledCommodityType()) {
        optionals.set(3);
      }
      if (struct.isSetSledCommodityCode()) {
        optionals.set(4);
      }
      if (struct.isSetSledExchangeMic()) {
        optionals.set(5);
      }
      if (struct.isSetRelatedLegs()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetSledContractId()) {
        oprot.writeI64(struct.sledContractId);
      }
      if (struct.isSetSledContractCode()) {
        oprot.writeString(struct.sledContractCode);
      }
      if (struct.isSetSledCommodityId()) {
        oprot.writeI64(struct.sledCommodityId);
      }
      if (struct.isSetSledCommodityType()) {
        oprot.writeI16(struct.sledCommodityType);
      }
      if (struct.isSetSledCommodityCode()) {
        oprot.writeString(struct.sledCommodityCode);
      }
      if (struct.isSetSledExchangeMic()) {
        oprot.writeString(struct.sledExchangeMic);
      }
      if (struct.isSetRelatedLegs()) {
        {
          oprot.writeI32(struct.relatedLegs.size());
          for (HostingExecOrderLegContractSummary _iter128 : struct.relatedLegs)
          {
            _iter128.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HostingExecOrderContractSummary struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.sledContractId = iprot.readI64();
        struct.setSledContractIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sledContractCode = iprot.readString();
        struct.setSledContractCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sledCommodityId = iprot.readI64();
        struct.setSledCommodityIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sledCommodityType = iprot.readI16();
        struct.setSledCommodityTypeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sledCommodityCode = iprot.readString();
        struct.setSledCommodityCodeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.sledExchangeMic = iprot.readString();
        struct.setSledExchangeMicIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list129 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.relatedLegs = new ArrayList<HostingExecOrderLegContractSummary>(_list129.size);
          for (int _i130 = 0; _i130 < _list129.size; ++_i130)
          {
            HostingExecOrderLegContractSummary _elem131;
            _elem131 = new HostingExecOrderLegContractSummary();
            _elem131.read(iprot);
            struct.relatedLegs.add(_elem131);
          }
        }
        struct.setRelatedLegsIsSet(true);
      }
    }
  }

}

