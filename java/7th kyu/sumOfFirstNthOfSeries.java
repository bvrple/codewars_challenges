// https://www.codewars.com/kata/555eded1ad94b00403000071

public class NthSeries {
  public static String seriesSum(int n) {
        double denominator = (n*3.0)-2.0, fraction = 1/denominator;
        int count = 0;
        double temp = 0.0;
        while (count < n) {
            temp += fraction;
            denominator -= 3.0;
            fraction = 1/denominator;
            count++;
        }
        double rounded = Math.round(temp * 100.0) / 100.0;

        if (String.valueOf(rounded).length() == 3) {
            return String.valueOf(rounded)+"0";
        }
        return String.valueOf(rounded);
    }
}