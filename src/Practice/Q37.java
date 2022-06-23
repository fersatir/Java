package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
         /*
        Kullanicidan alinan bir String in ilk ve son harfini yine kullanicidan alinan sayi kadar
        return eden bir method yaziniz
        ornek: input        output
               elma 2       eaea
               army 3       ayayay

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String str = scan.next();

        System.out.println("Bir sayi giriniz : ");
        int sayi = scan.nextInt();
        System.out.println(ilkSonHarf(str, sayi));

        //2.Way
        List<String> list = new ArrayList<String>(Arrays.asList(str));
        ilkSonHarf(list, sayi);

    }

    private static String ilkSonHarf(String str, int sayi) {

        String ilkHarf = str.substring(0, 1);
        String sonHarf = str.substring(str.length() - 1);
        String str1 = "";

        for (int i = 0; i < sayi; i++) {

            str1 += ilkHarf + sonHarf;
        }
        return str1;
    }

    public static void ilkSonHarf(List<String> list, int sayi) {

        for (int i = 0; i < sayi; i++) {
            list.stream().map(t -> t.substring(0, 1) + t.substring(t.length() - 1)).forEach(System.out::print);
        }


    }
}
