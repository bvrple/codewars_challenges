// https://www.codewars.com/kata/55a2d7ebe362935a210000b2

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        
        int min = Integer.MAX_VALUE;
        for (int num: args) {
          if (num < min) {
            min = num;
          }
        }
      return min;
    }
}