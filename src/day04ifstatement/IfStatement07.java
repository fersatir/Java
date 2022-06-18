package day04ifstatement;
import java.util.Scanner;
public class IfStatement07 {
    public static void main(String[] args) {

        /* TASK :
          Write a code that get a character(a letter) from user and check if it is capital,lowercase letter or invalid input
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char letter = scanner.next().charAt(0);

        if(letter >='A' && letter <='Z') {

            System.out.println("It is uppercase letter");
        }else if(letter >='a' && letter <='z' ){

            System.out.println("It is lowercase letter");
        }else{

            System.out.println("Invalid input ");
        }




    }
}
