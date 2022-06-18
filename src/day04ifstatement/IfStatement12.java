package day04ifstatement;
import java.util.Scanner;
public class IfStatement12 {
    public static void main(String[] args) {
        /* TASK :
        Get 3 digits int from user. write a code that if it is sides of steep triangle or not.
        info : (a*a) + (b*b) = (c*c)
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println("it is a steep triangle");
        } else if ((a * a) + (c * c) == (b * b)) {
            System.out.println("it is a steep triangle");
        } else if ((c * c) + (b * b) == (a * a)) {
            System.out.println("it is a steep triangle");
        } else {
            System.out.println("It is not a steep triangle ");
        }


    }
}
