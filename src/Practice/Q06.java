package Practice;

import java.util.Scanner;

public class Q06 {
    /*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
	    For example, "madam" or "nurses run".
	 */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String str = scan.nextLine().toLowerCase();
        str = str.replace(" ", "");

        isPalindrome(str);
        palindromeCheck();

    }

    private static void isPalindrome(String str) {

        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversedStr += str.charAt(i);
        }

        if (reversedStr.equals(str)) {

            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }


    }

    public static void palindromeCheck() {
        System.out.println("please enter a word or phrase");
        String entry = scan.nextLine().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(entry);
        sb.reverse();
        System.out.println(entry.contentEquals(sb) ? "this entry is palindrome" : "this entry is not palindrome");
    }
}
