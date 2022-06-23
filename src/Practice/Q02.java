package Practice;

import java.util.Scanner;

public class Q02 {
    //Write a Java Program to swap two numbers
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("before swap " + n1 + " " + n2);

        double temp = 0;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swap : " + n1 + " " + n2);


    }
}
