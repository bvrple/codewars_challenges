// https://www.codewars.com/kata/5412509bd436bd33920011bc

public class Maskify {
    public static String maskify(String str) {
            int size = str.length()-5;
            String masked = "";

            if (str.length() <= 4) {
                return str;
            } else {
                int i = 0;
                while (i < str.length()) {
                    if (i <= size) {
                        masked += "#";
                    } else {
                        masked += str.charAt(i);
                    }
                    i++;
                }
                return masked;
            }
        }
}