package Practice;

import java.util.Scanner;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class Q40 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        String strSayi = scanner.next();

        armstrongMethod(strSayi);

    }

    private static void armstrongMethod(String strSayi) {

        String arr[] = strSayi.split("");
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += Math.pow(Integer.parseInt(arr[i]), arr.length);

        }

        if (toplam == Integer.parseInt(strSayi)) {
            System.out.println(strSayi + " armstrong sayidir");
        } else System.out.println(strSayi + " armstrong sayi degildir");


    }
}
