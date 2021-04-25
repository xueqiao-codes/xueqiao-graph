package xueqiao.graph.xiaoha.chart.dao.thriftapi;


import java.util.HashMap;
import java.util.Map; 

public class XiaohaChartDaoFunctionMapping {

  private static Map<String, Integer> sMapping = new HashMap<String, Integer>();

  static {
    putEntry("addChart",1);
    putEntry("updateChart",2);
    putEntry("reqChart",3);
    putEntry("addChartFolder",4);
    putEntry("updateChartFolder",5);
    putEntry("reqChartFolder",6);
    putEntry("addTag",7);
    putEntry("removeTag",8);
    putEntry("reqTag",9);
    putEntry("addPlate",10);
    putEntry("reqPlate",11);
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
