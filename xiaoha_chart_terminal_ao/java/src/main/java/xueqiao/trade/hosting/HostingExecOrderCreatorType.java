/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package xueqiao.trade.hosting;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum HostingExecOrderCreatorType implements org.apache.thrift.TEnum {
  ORDER_ARTIFICAL(1),
  ORDER_MACHINE(2);

  private final int value;

  private HostingExecOrderCreatorType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static HostingExecOrderCreatorType findByValue(int value) { 
    switch (value) {
      case 1:
        return ORDER_ARTIFICAL;
      case 2:
        return ORDER_MACHINE;
      default:
        return null;
    }
  }
}
