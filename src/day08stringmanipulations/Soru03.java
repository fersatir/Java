package day08stringmanipulations;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz");
        String str = scan.nextLine().toUpperCase();

        int ilkSpace = str.indexOf(" ");
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);

        String fstLetter = str.substring(0, 1) + "." +
                str.substring(str.indexOf(" ") + 1, str.indexOf(" ") + 2) + "." +
                str.substring(ikinciSpace + 1, ikinciSpace + 2);

        System.out.println(fstLetter);

        // charAt(lastIndexOf(" ") bu iki methodda kullanilarak gerkli olanlar bulunabilir
        //charAt(ikinciSpace+1)


    }
}
