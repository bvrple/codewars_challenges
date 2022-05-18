// https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af

public class Fibonacci {
  public static long fib (int n){
        int[] fibStart = {0, 1, 1, 2};
        int count = 3, current = fibStart[3], previous = fibStart[2], temp = 0;

        if (n < 4) {
            return fibStart[n];
        }

        while (count < n) {
            temp = previous;
            previous = current;
            current = current + temp;
            count++;
        }

        return current;

    }

}