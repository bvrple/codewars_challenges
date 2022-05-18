// https://www.codewars.com/kata/5601409514fc93442500010b

import java.util.*;
import java.util.stream.*;

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int average = Arrays.stream(classPoints).sum()/classPoints.length;
    if (average < yourPoints) {
      return true;
      } else {
        return false;
    }
  }
}