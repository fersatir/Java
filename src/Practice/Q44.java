package Practice;

import java.util.Scanner;

public class Q44 {
    /*
       Crteate a program checks if a String is PALINDROME or not.
       If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
       For Example : "madam" or "nursesrun" .

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("String bir ifade giriniz : ");
        String str = scan.nextLine();

        palindomeWithStringBuilder(str);
        palindromeWithForLoop(str);


    }

    private static void palindomeWithStringBuilder(String str) {

        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();

        if (reversedStr.equalsIgnoreCase(str)) {
            System.out.println("It is a palindrome");
        } else System.out.println("It is not a palindrome");

        //  System.out.println(sb);


    }

    private static void palindromeWithForLoop(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("reversedStr = " + reversedStr);
        if (reversedStr.equalsIgnoreCase(str)) {
            System.out.print("It is a palindrome -> " + reversedStr);
        } else System.out.print("It is not a palindrome ->" + reversedStr);
    }
}
