// https://www.codewars.com/kata/5467e4d82edf8bbf40000155

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class DescendingOrder {
    public static int sortDesc(final int num) {
        List<String> numList = new ArrayList<>(List.of(String.valueOf(num).split("")));
        numList.sort(Collections.reverseOrder());
        int result = Integer.parseInt(String.join("", numList));

    return result;
    }
}