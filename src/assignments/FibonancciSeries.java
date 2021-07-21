package assignments;

public class FibonancciSeries {
   public static void main(String[] args) {


       int a = 10, firstTerm = 0, secondTerm = 1;

       System.out.println("Fibonancci Series " + a + " Term");

       for (int i = 1; i <= a; i++) {

           System.out.println(firstTerm + " ");

           int nextTerm = firstTerm + secondTerm;
           firstTerm = secondTerm;
           secondTerm = nextTerm;
       }
   }

    }






