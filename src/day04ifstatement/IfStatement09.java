package day04ifstatement;

import java.util.Scanner;

public class IfStatement09 {
    public static void main(String[] args) {
         /*
          TASK :
          create a double , value is 45
          if double divide 5 and 8. remaining is 0 print "able to divide by 5 and 8"

           if double divide 10 remaining 5 and divide 9 remaining 0.
            print "able to divide by 9 and divide by 10 reminder is 5"
         */

        double num = 45;

        if (num % 5 == 0 && num % 8 == 0) {
            System.out.println("able to divide by 5 and 8");
        } else if (num % 10 == 0 && num % 9 == 0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }


    }
}
