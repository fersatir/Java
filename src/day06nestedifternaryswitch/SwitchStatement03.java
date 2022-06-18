package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement03 {
    public static void main(String[] args) {

        //Create a simple calculator which does addition, subtraction, multiplication, divison,percentage calculation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number...");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter second number...");
        double secondNumber = scan.nextDouble();

        System.out.println("Select operation +,-,*,/,%");
        char operation = scan.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            default:
                System.out.println("Invalid operation for that calculator");
                break;

        }


    }
}
