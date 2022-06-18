package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {
    public static void main(String[] args) {
        //Print the first and last character of the given String on console."Java is easy" ==>Jy

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string...");
        String str = scan.nextLine();

        //1. Example Print the first and last character of the given String on the console."Java is easy" ==>Jy
        //to get characters from String one by one 2 ways;
        //1.Way: Using CharAt();
        //If you use '0' inside the charAt() method you will get first character in a String

        char firstChar = str.charAt(0);
        System.out.println(firstChar);

        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar);

        //2. Way: using substring()
        //To get first character from a string by using substring() methods use str.substring(0,1)

        String firstCharacter = str.substring(0, 1);
        System.out.println(firstCharacter);

        String lastCharacter = str.substring(str.length() - 1, str.length());
        System.out.println(lastCharacter);

        //2.Example: Type code to get initials of the first name and the last name of a given name.
        //Ali Can ==> AC, Mary Star ==>

        String initialOfFirstName = str.substring(0, 1);

        //How to find index of space character
        int indexOfInitialOfLastName = str.indexOf(" ") + 1;
        System.out.println(indexOfInitialOfLastName);

        String initialOfLastName = str.substring(indexOfInitialOfLastName, indexOfInitialOfLastName + 1);
        System.out.println(initialOfLastName);

        //3. Example: Check if any character exists in a String or Not.
        //1. Way:

        String characterToCheck = "Can";

        int result = str.indexOf(characterToCheck);

        if (result == -1) {
            System.out.println("The character does not exist");
        } else {
            System.out.println("The character exists");
        }

        //2. Way:
        // Java created contains() method to check if a specific character or characters exist in a String or not

        boolean isContain = str.contains("x");

        if (isContain) {
            System.out.println("The character exists");
        } else {
            System.out.println("The character does not exist");
        }




        /*
            The methods we learned so far;
            1)equals()
            2)equalsIgnoreCase()
            3)length()
            4)charAt()
            5)substring(with 1 index)
            6)substring(with 2 indexes)
            7)indexOf()
            8)contains()
            9)toLowerCase()
            10)toUpperCase()
        */


    }
}
