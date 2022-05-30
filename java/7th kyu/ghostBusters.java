// https://www.codewars.com/kata/5668e3800636a6cd6a000018

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Ghostbusters {

    public static String ghostBusters(String building) {
      
      if (!building.contains(" ")) {
        return "You just wanted my autograph didn't you?";
      }
      
        List<String> split = new ArrayList<>(Arrays.asList(building.split(" ")));
        StringBuilder result = new StringBuilder();
        split.forEach(result::append);
        return result.toString();
    }
}