// https://www.codewars.com/kata/58235a167a8cb37e1a0000db

import java.util.HashMap;

class Kata {
    public static int numberOfPairs(String[] gloves) {
        HashMap<String, Integer> pairs = new HashMap<>();
        for (String colour: gloves) {
            if (pairs.containsKey(colour)) {
                pairs.put(colour, pairs.get(colour) + 1);
            } else {
                pairs.put(colour, 1);
            }
        }

        int result = 0;

        for (int num: pairs.values()) {
          if (num % 2 != 0) {
            num -= 1;
        } 
          result += num;
        }
        
        return result/2;
    }
}