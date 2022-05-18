// https://www.codewars.com/kata/563b74ddd19a3ad462000054

public class Kata {
  public static String stringy(int size) {
    String result = "";
    
    for (int i = 0; i < size; i++) {
      if (i % 2 == 0) {
        result += "1";
      } else {
        result +="0";
      }
    }
    return result;
  }
}