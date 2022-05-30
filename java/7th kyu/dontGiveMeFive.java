// https://www.codewars.com/kata/5813d19765d81c592200001a

class Kata {
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;

        while (start <= end) {
            String num = String.valueOf(start);
            
            if (!num.contains(("5"))) {
                count++;
            }
            start++;
        }
        return count;
    }
}