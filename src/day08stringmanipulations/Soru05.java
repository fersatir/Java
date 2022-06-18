package day08stringmanipulations;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("4 harfli kelime giriniz : "); //mavi
        String str = scan.nextLine();

        String tersStr = str.substring(3) + str.substring(2, 3) + str.substring(1, 2) + str.substring(0, 1);

        if (str.length() != 4) {
            System.out.print("lütfen 4 karakterli kelime giriniz");
        } else {
            System.out.print("tersten kelime : " + tersStr); //tersten kelime : ivam


        }

    }
}
