package day07stringmanipulations;

import java.util.Scanner;

public class Sm06 {
    public static void main(String[] args) {

        /*Ask user to enter password, if the password is okay for the following conditions output will be
          “Your password is created successfully.” If the password is not okay for any of the following conditions
          Output will be “Enter a new password according to the give conditions”
          1.First letter must be uppercase
          2.Last letter must be lowercase
          3.Password must contain 6 characters

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password");
        String pwd = scanner.next();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z' && pwd.charAt(pwd.length() - 1) >= 'a' && pwd.charAt(pwd.length() - 1) < 'z' &&
                !pwd.contains(" ") && pwd.length() >= 6) {

            System.out.println("“Your password is created successfully");
        } else {
            System.out.println("“Enter a new password according to the give conditions");
            System.out.println("1-First letter must be uppercase \n2-Last letter must be lowercase  " +
                    "\n3-Password must contain 6 characters ");
        }


    }
}
