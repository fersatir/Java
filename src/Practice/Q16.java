package Practice;

import java.util.Scanner;

public class Q16 {/*
	  	Ask user to enter the number of lines of a inverted half pyramid.
	  	Type a program to create the inverted half pyramid.
	    For example if the number of lines is 5, the pyramid will be like;  * * * * *
																			* * * *
																			* * *
																			* *
																			*
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = i; j < num; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
