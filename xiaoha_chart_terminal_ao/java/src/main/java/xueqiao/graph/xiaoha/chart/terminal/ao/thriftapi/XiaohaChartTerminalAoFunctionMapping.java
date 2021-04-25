package xueqiao.graph.xiaoha.chart.terminal.ao.thriftapi;


import java.util.HashMap;
import java.util.Map; 

public class XiaohaChartTerminalAoFunctionMapping {

  private static Map<String, Integer> sMapping = new HashMap<String, Integer>();

  static {
    putEntry("login",1);
    putEntry("logout",2);
    putEntry("authorizeXueQiaoApp",3);
    putEntry("signUp",4);
    putEntry("sendVerifyCode",5);
    putEntry("reqChartFolder",10);
    putEntry("reqChart",11);
    putEntry("addFavoriteFolder",20);
    putEntry("reqFavoriteFolder",21);
    putEntry("removeFavoriteFolder",22);
    putEntry("renameFavoriteFolder",23);
    putEntry("moveFavoriteFolder",24);
    putEntry("addFavoriteChart",25);
    putEntry("reqFavoriteChart",26);
    putEntry("removeFavoriteChart",27);
    putEntry("moveFavoriteChart",28);
    putEntry("linkExistAccount",29);
    putEntry("getLinkState",30);
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
