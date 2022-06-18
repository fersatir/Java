package day08stringmanipulations;

import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz :");
        String str = scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));

        System.out.println("Lutfen soyisminizi yaziniz");
        String musteriSoyismi = scan.next();
        System.out.println(xyzVarmi(musteriSoyismi));

    }

    public static boolean xyzVarmi(String str) {

        if (str.contains("xyz")) {
            return true;
        } else {
            return false;

        }
    /*public static boolean xyzVarmi(String str) {
        boolean flag=false;
        if (str.contains("xyz")) {
            flag=true;
        }

        return flag;
    }*/
    }

}
