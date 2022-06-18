package day08stringmanipulations;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = scanner.nextLine();

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)
        int boslukIndex = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, boslukIndex);
        String Soyad = adSoyad.substring(boslukIndex + 1);

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    }
}
