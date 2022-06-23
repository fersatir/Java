package Practice;

import java.util.*;

public class Q13 {
    	/*
	  Ask user to enter 2 Strings.
	  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
	  Otherwise, print "Not Anagram" on the console.
	  Ignore cases.
	  For example; "Mary" and "army" and "RAMY" are Anagrams.
	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki String giriniz");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        //1.way
        isAnagram(s1, s2);

        //2.way
        isAnagram2(s1, s2);
    }

    private static void isAnagram2(String s1, String s2) {
        String arr1[] = s1.toLowerCase().split("");
        Arrays.sort(arr1);

        String arr2[] = s2.toLowerCase().split("");
        Arrays.sort(arr2);

        if (s1.length() != s2.length()) {
            System.out.println("It is not an anagram");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("It is not an anagram");
        } else if (Arrays.equals(arr1, arr2)) {
            System.out.println("It is an anagram");
        } else {
            System.out.println("It is not an anagram");
        }
    }

    private static void isAnagram(String s1, String s2) {

        s1 = s1.replaceAll("[^a-zA-Z]", "");
        s2 = s2.replaceAll("[^a-zA-Z]", "");

        List<String> s1List = new ArrayList<>(List.of(s1.toLowerCase().split("")));
        Collections.sort(s1List);
        List<String> s2List = new ArrayList<>(List.of(s2.toLowerCase().split("")));
        Collections.sort(s2List);

        if (s1.length() != s2.length()) {
            System.out.println("It is not an anagram");
        } else if (s1List.equals(s2List)) {
            System.out.println("It is an anagram");
        } else System.out.println("It is not an anagram");


    }
}
