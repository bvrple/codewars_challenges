// https://www.codewars.com/kata/523f5d21c841566fde000009

import java.util.ArrayList;
import java.util.List;

class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = new ArrayList<Integer>();
        List<Integer> listB = new ArrayList<Integer>();

        for (int i: a) {
            listA.add(i);
        }

        for (int i: b) {
            listB.add(i);
        }

        listA.removeAll(listB);
        int[] result = new int[listA.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = listA.get(i);
        }
        return result;
    }
}