// https://www.codewars.com/kata/554e4a2f232cdd87d9000038

import java.util.ArrayList;
import java.util.List;

class DnaStrand {
    public static String makeComplement(String dna) {
        List<String> letters = new ArrayList<String>(List.of(dna.split("")));
        StringBuilder complement = new StringBuilder();

        for (String letter: letters) {
            switch (letter) {
                case "A" -> complement.append("T");
                case "T" -> complement.append("A");
                case "C" -> complement.append("G");
                case "G" -> complement.append("C");
            }
        }
        return complement.toString();
    }
}