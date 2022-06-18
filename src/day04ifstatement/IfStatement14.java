package day04ifstatement;
import java.util.Scanner;
public class IfStatement14 {
    public static void main(String[] args) {

        /* TASK :
        Get 3 numbers from user. Check the greatest and smallest number then print on the console
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 positive integers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
            if (num2 > num3) {
                System.out.println("num3 is smallest");
            } else {
                System.out.println("num2 is smallest");
            }
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
            if (num1 > num3) {
                System.out.println("num3 is smallest");

            } else {
                System.out.println("num1 is smallest");
            }
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 is greatest");
            if (num2 > num1) {
                System.out.println("num1 is smallest");

            } else {
                System.out.println("num2 is smallest");
            }

        } else {
            System.out.println("Invalid input");
        }


    }
}
