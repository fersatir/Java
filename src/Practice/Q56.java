package Practice;

import java.util.Scanner;

public class Q56 {
    /*
     Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("carpanlarini bulmak istediginiz sayiyi giriniz :");
        int sayi = Math.abs(scan.nextInt()); //sayinin mutlak degerini aldik..

        int i = 1;
        int sayac = 0;
        while (i <= sayi) {
            if (sayi % i == 0) {
                sayac++;
                System.out.print(i + " ");
            }
            i++;

        }
        System.out.println();
        System.out.println("carpanlarinin sayisi :" + sayac);

    }
}
