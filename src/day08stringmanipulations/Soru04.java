package day08stringmanipulations;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //ikinci ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("str1 : ");
        String str1 = scanner.nextLine();  //mavi

        System.out.print("str2 : "); //gokyuzu
        String str2 = scanner.nextLine();

        String al1 = str1.substring(1);
        String al2 = str2.substring(1);
        System.out.println("Stringlerin ilk birlesimi: " + str1 + " " + str2); //Stringlerin ilk birlesimi: mavi gokyuzu
        System.out.println("Stringlerin ilk birlesimi: " + str1.concat(" " + str2));
        System.out.println("Stringlerin islemden sonraki birlesimi: " + al1 + " " + al2); //Stringlerin islemden sonraki birlesimi: avi okyuzu
    }
}
