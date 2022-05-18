// https://www.codewars.com/kata/5663f5305102699bad000056

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
      
      if (a1.length == 0 || a2.length == 0) {
        return -1;
      } else {
      int max1 = a1[0].length();
      int min1 = a1[0].length();
      int max2 = a2[0].length();
      int min2 = a2[0].length();
      
      for (int i = 0; i < a1.length; i++) {
        if (a1[i].length() > max1) {
          max1 = a1[i].length();
        }
        if (a1[i].length() < min1) {
          min1 = a1[i].length();
        }
      }
      
      for (int j = 0; j < a2.length; j++) {
        if (a2[j].length() > max2) {
          max2 = a2[j].length();
        }
        if (a2[j].length() < min2) {
          min2 = a2[j].length();
        }
      }
      
      int res1 = max1 - min2;
      int res2 = max2 - min1;
      
      if (res1 > res2) {
        return res1;
      } else {
        return res2;
      }
      }
      
      
    }
}