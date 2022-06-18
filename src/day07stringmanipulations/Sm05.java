package day07stringmanipulations;

import java.util.Scanner;

public class Sm05 {
    public static void main(String[] args) {
        /*
        Get email address from user
        Print if mail contains @gmail.com "Email has been registed", if not "Please type gmail address"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your email address");
        String email = scanner.nextLine();

        if (email.contains("@gmail.com")) {
            System.out.println("Email address has been registered");
        } else {
            System.out.println("Please type gmail address");
        }


        /* Get a sentence from user.If sentence includes a word "buyuk", make sentence uppercase
        if sentence includes a word "kucuk", make sentence lowercase
        if sentence does not include both of them, print "Sentence does not include "buyuk" or "kucuk""
        */

        System.out.println("enter a sentence");
        String sentence = scanner.nextLine().toLowerCase();

        if (sentence.contains("buyuk")) {
            System.out.println(sentence.toUpperCase());
        } else if (sentence.contains("kucuk")) {
            System.out.println(sentence.toLowerCase());
        } else {
            System.out.println("Sentence does not include \"buyuk\" or \"kucuk\" ");
        }


    }
}
