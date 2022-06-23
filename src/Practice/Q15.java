package Practice;

import java.util.Scanner;

public class Q15 {
    /*
      Ask user to enter the number of lines of a half pyramid.
      Type a program to create the half pyramid.
      For example if the number of lines is 5, the pyramid will be like;  *
                                                                        * *
                                                                        * * *
                                                                        * * * *
                                                                        * * * * *
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
