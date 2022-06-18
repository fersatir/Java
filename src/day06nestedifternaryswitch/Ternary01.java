package day06nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        //1.Way: solve by using if-else statement

        int num = 5;
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        //2.Way Ternary
        int number = -6;
        //Condition   Question Mark   Result for happy scenario    Colon    Result for negative scenario
        String result = number > 0 ? "Number is positive" : "Number is negative";
        System.out.println(result);

        //Write a program to print the minimum of 2 integers on the console. Use ternary...
        int num1 = 9;
        int num2 = 6;

        int result1 = num1 < num2 ? num1 : num2;
        System.out.println(result1);

        int age = 18;

        String checkAge = age >= 18 ? "You can get driver licence" : "You can not get driver licence";
        System.out.println(checkAge);

        // Type code to calculate the absolute value of a number.
        // For positive numbers and zero absolute value is the same with number.
        //For negative numbers to find absolute value multiply the number by -1

        double number2 = -7.5;

        double absoluteNumber = number2 > 0 ? number2 : number2 * -1;
        System.out.println(absoluteNumber);


         /*
        You have 2 integers;
        If both of  the integers are positive do multiplication
        if one is negative the other one is positive return "I do not know how to multiply.
         */

        int num3 = 6;
        int num4 = -2;

        //If your ternary returns different data types for different scenarios, put it diretly System.out.println()
        System.out.println(num3 > 0 && num4 > 0 ? num3 * num4 : "I do not know how to multiply");


        //Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an abbreviations");
        String ch = scan.next();

        System.out.println((ch.length() < 3) ? "It is valid for state abbreviations" : "It is not valid for state abbreviations");


    }
}
