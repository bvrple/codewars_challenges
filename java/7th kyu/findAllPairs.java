// https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3

import java.util.HashMap;

public class Solution {
  public static int duplicates(int[] array) {
        int pairs = 0;
        HashMap<Integer, Integer> noOfPairs = new HashMap<Integer, Integer>();

        for (int num: array) {
            if (!noOfPairs.containsKey(num)) {
                noOfPairs.put(num, 1);
            } else {
                noOfPairs.put(num, noOfPairs.get(num)+1);
            }
        }

        for (int value: noOfPairs.keySet()) {
            if (noOfPairs.get(value) % 2 == 0) {
                pairs += noOfPairs.get(value);
            } else {
                pairs += (noOfPairs.get(value) - 1);
            }
        }
        pairs = pairs/2;
        return pairs;
  }
}