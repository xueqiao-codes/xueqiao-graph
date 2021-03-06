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

public enum HostingUpsideNotifyStateType implements org.apache.thrift.TEnum {
  NOTIFY_UPSIDE_RECIVED(1),
  NOTIFY_CONDITION_NOT_TRIGGERED(2),
  NOTIFY_CONDITION_TRIGGERED(3),
  NOTIFY_ORDER_RESTING(4),
  NOTIFY_ORDER_CANCELLED(5),
  NOTIFY_ORDER_PARTFINISHED(6),
  NOTIFY_ORDER_FINISHED(7),
  NOTIFY_ORDER_REJECTED(8),
  NOTIFY_ORDER_CANCEL_RECEIVED(9);

  private final int value;

  private HostingUpsideNotifyStateType(int value) {
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
  public static HostingUpsideNotifyStateType findByValue(int value) { 
    switch (value) {
      case 1:
        return NOTIFY_UPSIDE_RECIVED;
      case 2:
        return NOTIFY_CONDITION_NOT_TRIGGERED;
      case 3:
        return NOTIFY_CONDITION_TRIGGERED;
      case 4:
        return NOTIFY_ORDER_RESTING;
      case 5:
        return NOTIFY_ORDER_CANCELLED;
      case 6:
        return NOTIFY_ORDER_PARTFINISHED;
      case 7:
        return NOTIFY_ORDER_FINISHED;
      case 8:
        return NOTIFY_ORDER_REJECTED;
      case 9:
        return NOTIFY_ORDER_CANCEL_RECEIVED;
      default:
        return null;
    }
  }
}
