package Practice;

import java.util.Scanner;

public class Q18 {/*

	 Ask user to enter the number of lines of a pyramide.
	  Type a program to create the pyramide.
	  For example if the number of lines is 5, the pyramide will be like;           *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
	 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();


        for (int i = 0; i < num; i++) {

            for (int j = i; j < num; j++) {

                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {

                System.out.print("* ");
            }
            for (int l = 0; l < i; l++) {

                System.out.print("* ");
            }
            System.out.println();


        }


    }
}
