package Practice;

import java.util.Scanner;

public class Q17 {
    /*

      Ask user to enter the number of lines of a inverted half pyramid by using numbers.
      Type a program to create the inverted half pyramid.
    For example if the number of lines is 5, the pyramid will be like;  1 2 3 4 5
                                                                        1 2 3 4
                                                                        1 2 3
                                                                        1 2
                                                                        1
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();


        for (int i = 1, p = num; i <= num; i++, p--) {

            for (int j = 1; j <= p; j++) {

                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
