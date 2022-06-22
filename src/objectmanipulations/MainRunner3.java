package objectmanipulations;

import java.util.Scanner;

public class MainRunner3 {
    /*Ask user their name and lastname
    Then generate an meail for them
    concatenate firstname and lastname
    and "@gmail.com" then print email for the user on the console
     */
    public static void main(String[] args) {
        //                          name and surname
        // Person person = new Person();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your name and lastname");

        Person person = new Person(scanner.next(), scanner.next());

        generateEmail(person);


    }// main method

    //primitives  // Objects  //
    public static void generateEmail(Person person) {


        System.out.println((person.getName() + person.getLastname() + "@gmail.com").toLowerCase());


    }


}
