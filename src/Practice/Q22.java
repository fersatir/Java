package Practice;

import java.util.Scanner;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class Q22 {
    /*

	 	Get a String and a character from user
	 	Count the number of characters between the first occurence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 3
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String str = scan.nextLine();

        System.out.println("Enter a character...");
        String letter = scan.next().toLowerCase();

        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.substring(i, i + 1).equals(letter)) {

                count++;
            }
        }


        if (count == 1 || count == 0) {
            System.out.println("-1");
        } else System.out.println(letter + " = " + count);


    }
}
