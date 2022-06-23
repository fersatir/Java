package Practice;

import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("sifrelenecek ifadeyi giriniz");
        String ifade = scan.nextLine().toLowerCase();

        for (int i = 0; i < ifade.length(); i++) {

            int index = 'z' - ifade.charAt(i); // tersten bakacagi icin sondan cikardik, bir nevi kayma miktarini bulduk
            System.out.print((char) (('a') + index));

        }

        System.out.println();
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("sifrelenecek ifadeyi giriniz");
        String str3 = scan.nextLine().toLowerCase();

        for (int i = 0; i < str3.length(); i++) {
            for (int j = 0; j < 26; j++) {// str1 ve str2 icin index => j
                //Kullanicidan aldigim str3 deki herhangi bir karakter str1 deki bir karaktere esit ise
                if (str3.charAt(i) == str1.charAt(j)) { // ayni

                    System.out.println(str2.charAt(j));
                }
            }
        }
    }
}
