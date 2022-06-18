package day04ifstatement;
import java.util.Scanner;
public class IfStatement02 {
    public static void main(String[] args) {

        /* TASK:
            Process the two numbers you will receive from the user and make user do one of the four operations
            that user will choose, print the result
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("addition 1 \nsubtraction 2 \nmultiplication 3 \ndivision 4 ");
        int operation = scan.nextInt();

        System.out.println("Please enter two integer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if(operation == 1){
            System.out.println("Result of addition: " +(num1 + num2));
        }else if (operation == 2){
            System.out.println("Result of subtraction: " + (num1 - num2));
        }else if (operation == 3){
            System.out.println("Result of multiplication: " + num1*num2);
        }else if (operation == 4) {
            System.out.println("Result of multiplication: " + num1 / num2);
        }else{
            System.out.println("Please enter an integer");
        }



    }
}
