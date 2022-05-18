// https://www.codewars.com/kata/550554fd08b86f84fe000a58

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class WhichAreIn { 
public static String[] inArray(String[] array1, String[] array2) {
        List<String> subStrings = new ArrayList<>();

        for (String str1: array1) {
            for (String str2: array2) {
                if (str2.contains(str1) && !(subStrings.contains(str1))) {
                    subStrings.add(str1);
                }
            }
        }

        Collections.sort(subStrings);
        String[] result = subStrings.toArray(new String[subStrings.size()]);
        
        return result;

    }
}