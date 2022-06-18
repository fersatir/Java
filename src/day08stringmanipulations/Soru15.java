package day08stringmanipulations;

import java.util.Scanner;

public class Soru15 {
    public static void main(String[] args) {
        /*Bir Stringin tersten ayni olup olmadigini bulunuz.  (Palindrom)
         *
         * ornek
         *  madam , nurses run  ==> palindromdur
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz:");
        String str = scan.nextLine().replaceAll(" ", "").toLowerCase();


        palindrom(str);


    }

    public static void palindrom(String str) {
        String strTers = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            strTers += str.charAt(i);
        }
        if (strTers.equals(str)) {
            System.out.println("girilen string palindromdur");
        } else {
            System.out.println("girilen string palindrom degildir");
        }
    }


}
