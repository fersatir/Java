package Practice;

import java.util.Scanner;

public class Q58 {
    /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise tell user "Lost!"
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        do {
            System.out.print("Bir sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("Won!");
            }
        } while (sayi < 100);

        System.out.println("Lost!");
    }
}
