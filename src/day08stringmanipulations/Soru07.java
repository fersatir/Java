package day08stringmanipulations;

import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args) {
           /*

            Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
            ve asagidaki gibi yazdirin
            isim-soyisim : M***** B*******
            kart no : **** **** **** 1234
            */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen isminizi giriniz :"); //zehra
        String isim = scan.next();

        System.out.print("Lutfen soyisminizi giriniz :"); //esen
        String soyisim = scan.next();

        System.out.print("Lutfen kart numaranizi giriniz :"); //1234134514561234
        String kartNo = scan.next();


        char isimIlkHarf = isim.toUpperCase().charAt(0);
        String isimGeriKalan = isim.substring(1).replaceAll("\\w", "*");
        String soyisimIlkHarf = soyisim.toUpperCase().substring(0, 1);
        String soyisimGeriyeKalan = soyisim.substring(1).replaceAll("\\w", "*");
        String kartNoBasi = "**** **** **** ";
        String kartNoSonu = kartNo.substring(kartNo.length() - 4);


        System.out.println("isminiz ve soyisminiz : " + isimIlkHarf + isimGeriKalan + " " + soyisimIlkHarf + soyisimGeriyeKalan);
        //isminiz ve soyisminiz : Z**** E***

        System.out.println("Kart No : " + kartNoBasi + kartNoSonu); //Kart No : **** **** **** 1234


    }
}
