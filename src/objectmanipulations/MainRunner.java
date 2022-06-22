package objectmanipulations;

import java.util.Scanner;

import static objectmanipulations.Person.getEmail;

public class MainRunner {

    /*
    Type a program that ask user their name and lastname, then create an email for the user
    concatenate the name and lastname then add @gmail.com
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name and lastname to see your email");

        String name = scanner.nextLine();
        String lastname = scanner.nextLine();

        System.out.println("person name = " + name);
        System.out.println("person lastname = " + lastname);

        System.out.println("Person's email : " + getEmail(name, lastname));


    }


}
