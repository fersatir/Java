package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a password

		If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd = scan.nextLine();

        //How to get first character from a String

        //Note: If it is possible, do not use nested-if because it has "time-complexity" means takes too much time to execute.
        //System.out.println(pwd.charAt(0)); //A

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {
            if (pwd.charAt(0) == 'z') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid password because first character must be letter");
        }

        //Retirement question

        System.out.println("Please enter your gender ");
        char gender = scan.next().toLowerCase().charAt(0);

        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (gender == 'f') {
            if (age > 60) {
                System.out.println("You can retire");
            } else {
                System.out.println("You can not retire. There is a " + (60 - age) + " year(s) left for your retirement");
            }
        } else if (gender == 'm') {
            if (age > 65) {
                System.out.println("You can retire");
            } else {
                System.out.println("You can not retire. There is a " + (65 - age) + " year(s) left for your retirement");
            }
        } else {
            System.out.println("Please enter a valid character for gender");
        }


        /*
        Type java code by using nested if statement,
        If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect even number” otherwise, the output will be “Good even number.”
        If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
        “Perfect odd number” otherwise, the output will be “Good odd number.”
         */

        System.out.println("Please enter an integer");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number");
            }
        } else if (num % 2 != 0) {
            if (num % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good odd number");
            }
        }


    }
}
