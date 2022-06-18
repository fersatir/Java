package day08stringmanipulations;

import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz fakat girdiginiz isim lutfen 3 harfli olsun");
        String isim = scan.next();

        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 && (c1 != c2 && c1 != c3 && c2 != c3) ? "Girdiginiz string 3 harfli ve unique karakterlere sahip"
                : "Girdiginiz isim unique karakterlere sahip degil veya 3 harfli degil";

        System.out.println(result);


    }
}