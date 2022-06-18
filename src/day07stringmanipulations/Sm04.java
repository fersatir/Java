package day07stringmanipulations;

public class Sm04 {
    public static void main(String[] args) {
        String fullName = "      Ali Can         ";
        System.out.println(fullName);

        //How to remove spaces from the beginning and from the end in a String

        String trimmedName = fullName.trim();
        System.out.println(trimmedName);

        //How to understand if a String is empty or not?
        //1.Way:

        int numOfChar = fullName.length();
        if (numOfChar == 0) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("You entered your name");
        }

        //2.Way:
        //isEmpty() returns true if there is no any character

        boolean isEmpty = fullName.isEmpty();
        System.out.println(isEmpty);

        if (isEmpty) {
            System.out.println("You did not enter your name");
        } else {
            System.out.println("You entered your name successfully");
        }

        String str = " Ali 12 woow!";

        //isBlank() returns true if there is just space character or space characters or nothing
        boolean isBlank = str.isBlank();
        System.out.println(isBlank);


    }
}
