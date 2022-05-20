// https://www.codewars.com/kata/59b401e24f98a813f9000026

import java.util.ArrayList;
import java.util.List;

class MySolution {
    public int computeDepth(int n) {
        int multiple = 0;
        int value;
        String valueString;
        List<Integer> exists = new ArrayList<Integer>();

        while (exists.size() != 10) {
            multiple++;
            value = n * multiple;
            valueString = String.valueOf(value);

            for (int j = 0; j < valueString.length(); j++) {
                if (!exists.contains(Character.getNumericValue(valueString.charAt(j)))) {
                    exists.add(Character.getNumericValue(valueString.charAt(j)));
                }
            }
        }
        return multiple;
    }
}