// https://www.codewars.com/kata/5ce399e0047a45001c853c2b

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SumParts {

    public static int[] sumParts(int[] ls) {
        List<Integer> toSum = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();

        for (int i: ls) {
            toSum.add(i);
        }
        int total = toSum.stream().mapToInt(Integer::intValue).sum();

        int i = 0;
        while (i < toSum.size()) {
            sumList.add(total);
            total -= toSum.get(i);
            i++;
        }
        sumList.add(0);

        int[] sumArray = new int[sumList.size()];
        for (int j = 0; j < sumList.size(); j++) {
            sumArray[j] = sumList.get(j);
        }

        return sumArray;
    }
}