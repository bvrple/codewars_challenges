// https://www.codewars.com/kata/59325dc15dbb44b2440000af

import java.util.List;

class Solution {
    public static boolean isAlt(String word) {
        List<String> letters = List.of(word.split(""));
        StringBuilder check = new StringBuilder();
        boolean flag = false;

        for (String letter: letters) {
            switch (letter.toLowerCase()) {
                case "a", "e", "i", "o", "u" -> check.append("2");
                default -> check.append("1");
            };
        }


        if (Character.getNumericValue(check.charAt(0)) % 2 == 0) {
            for (int i = 0; i < check.length(); i++) {
                int value = Character.getNumericValue(check.charAt(i));

                if ((i % 2 != 0 && value % 2 !=0) || (i % 2 == 0 && value % 2 == 0)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                };
            }
        } else if (Character.getNumericValue(check.charAt(0)) % 2 != 0) {
            for (int i = 0; i < check.length(); i++) {
                int value = Character.getNumericValue(check.charAt(i));

                if ((i % 2 != 0 && value % 2 == 0) || (i % 2 == 0 && value % 2 != 0)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}