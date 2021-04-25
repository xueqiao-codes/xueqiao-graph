package xueqiao.graph.xiaoha.chart.webapi.thriftapi;


import java.util.HashMap;
import java.util.Map; 

public class XiaohaChartWebapiFunctionMapping {

  private static Map<String, Integer> sMapping = new HashMap<String, Integer>();

  static {
    putEntry("reqChart",1);
    putEntry("updateChartTags",2);
    putEntry("updateChartState",3);
    putEntry("reqTags",4);
    putEntry("reqPlates",5);
    putEntry("removeTag",6);
    putEntry("updateTag",7);
    putEntry("addTag",8);
    putEntry("reqTagPage",9);
  }

  public static int getUniqueNumber(String functionName) {
    Integer number = sMapping.get(functionName);
    if (number == null) {
      return -1;    }
    return number.intValue();
  }

  private static void putEntry(String functionName, int uniqueNumber) {
    sMapping.put(functionName, uniqueNumber);
  }

}
