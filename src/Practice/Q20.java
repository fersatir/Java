package Practice;

import static day13statickeywordvariabletypes.Static01.sCounter;
import static projects.StorageManagement.TryCatch.scanner;

public class Q20 {
    	/*

	 Type code to draw isosceles right triangle whose side length will be given by user.
	 For example; if the side is 5 triangle will be like;   *
															* *
															*   *
															*     *
															* * * * *
	 */

    static int deger = 0;

    public static void main(String[] args) {
        //1.way
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 2 && j == 1) {
                    System.out.print("  ");
                } else if (i == 3 && j == 1) {

                    System.out.print("  ");
                } else if (i == 3 && j == 2) {

                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }


        //2.way
        System.out.print("Sayi gir :");
        int num = 5;
        // int num = scanner.nextInt();
        System.out.println("* ");

        for (int i = 0; i < num; i++) {

            if (i != num - 1) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("* ");
                    for (int k = 0; k < i; k++) {
                        System.out.print("  ");
                    }
                }
            } else {
                for (int k = 0; k <= i + 1; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //3.way
        System.out.println("*");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println(" *");
            deger = i + 3;
        }
        System.out.print("*");

        for (int k = 1; k < deger; k++) {
            System.out.print(" *");
        }

        //4.way














    }//main
}












