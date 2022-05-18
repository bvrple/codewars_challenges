// https://www.codewars.com/kata/622de76d28bf330057cd6af8

public class HowManyPagesInABook {
  
  public static int amountOfPages(int summary) {

        int pages = 1;
        int size = String.valueOf(pages).length();
        int reference = 0;
        
        while (reference < summary) {
            size = String.valueOf(pages).length();
            reference += size;
            if (reference == summary) {
                break;
            }
            pages++;
        }
        return pages;
    }

}