// https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

import java.util.List;
import java.util.ArrayList;

public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    List<Object> result = new ArrayList<Object>();
    for (Object item: list) {
            if (item.getClass().getSimpleName().equals("Integer")) {
              result.add(item);
            }
        }
    return result;
  }
}