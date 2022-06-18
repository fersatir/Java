package day05ifelsestatement;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {

        //   &&          ||

        // I can move from North Carolina to Virginia by a car or bus
        boolean car = true;
        boolean bus = false;

        if (car || bus) {
            System.out.println("I can go to Virginia");
        }
        // || one of our conditions must be true
        //I have cash money, I also have debit card.I will buy a PC

        boolean cashMoney = true;
        boolean debitCard = true;

        if (cashMoney || debitCard) {
            System.out.println("I can buy PC");
        } else {
            System.out.println("I can not buy a PC");
        }

        //If we have day time class, I can join it.
        //If we have night time class, I can join it,

        boolean dt = true;
        boolean nt = true;

        if (dt && nt) {
            System.out.println("I can attend class");
        } else {
            System.out.println("I can not attend class");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a month name of the year");

        String month = scan.next();

        if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("January")) {
            System.out.println(month + " is in winter");
        } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            System.out.println(month + " is in spring");
        } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
            System.out.println(month + " is summer");
        } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("November") || month.equalsIgnoreCase("October")) {
            System.out.println(month + " is fall");
        } else {
            System.out.println(month + " is not actually a month of the year");
        }

        /*
        Ask user ta enter a 4 digits integer, then print the sum of the first
        and the last digit of the number on console.
        For example; if user enters 1234 you will add 1 and 4,
        then print on the console 5
         */


        System.out.println("Enter 4 digits integer");
        String num = scan.next();


        String firstDigit = String.valueOf(num.charAt(0));
        String lastDigit = String.valueOf(num.charAt(num.length() - 1));
        int a = Integer.parseInt(firstDigit);
        int b = Integer.parseInt(lastDigit);

        if (num.length() >= 4) {
            System.out.println(a + b);
        } else {
            System.out.println("Please enter 4 digits integer");
        }

        /*
        Type java code by using if-else if() statement,
        if both of the two integers are positive, output will be the sum of them.
        If both of the two integers are negative, output will be the multiplication of them.
        Otherwise; output will be “I cannot add or multiply different signed numbers”
         */

        System.out.println("Enter an integer");
        int num1 = scan.nextInt();

        System.out.println("Enter an integer");
        int num2 = scan.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 + num2);
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("I can not add or multiply different signed numbers");
        }


        /*  Ask user to enter year
            Type java code by using if-else if() statement.
            Write a program to check if a year is leap year or not.
            if the year is divisible by 100 then it must be divisible by 400.
            If a year is not divisible by 100 then it must be divisible by 4
        */

        System.out.println("Enter an integer");
        int year = scan.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        } else if (year % 100 != 0) {
            if (year % 4 == 0) {
                System.out.println("It is a leap year");
            } else {
                System.out.println("It is not a leap year");
            }
        }


        //Ask user to enter a character, then check whether the character is alphabet or not

        System.out.println("Enter a character");
        char ch = scan.next().charAt(0);

        if (ch > 'A' && ch < 'Z' || ch > 'a' && ch < 'z') {
            System.out.println("It is a character");

        } else {
            System.out.println("Please enter a character");
        }


    }
}
