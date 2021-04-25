package xueqiao.personal.user.dao.thriftapi;


import java.util.HashMap;
import java.util.Map; 

public class PersonalUserDaoFunctionMapping {

  private static Map<String, Integer> sMapping = new HashMap<String, Integer>();

  static {
    putEntry("addPersonalUser",1);
    putEntry("updatePersonalUser",2);
    putEntry("reqPersonalUser",3);
    putEntry("addUserRelateInfo",4);
    putEntry("reqUserRelateInfo",5);
    putEntry("addFavoriteFolder",6);
    putEntry("updateFavoriteFolder",7);
    putEntry("reqFavoriteFolder",8);
    putEntry("removeFavoriteFolder",9);
    putEntry("addFavoriteChart",10);
    putEntry("updateFavoriteChart",11);
    putEntry("reqFavoriteChart",12);
    putEntry("removeFavoriteChart",13);
    putEntry("mergeUserRelateInfo",14);
    putEntry("isUserRelate",15);
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
