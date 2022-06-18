package day08stringmanipulations;

import java.util.Scanner;

public class Soru14 {

    /*
    Bir String parametre kabul eden bir method yazin, String builder kullanarak
    o Stringi ters cevirin. Sonrasinda girilen String palindrome mu degil mi kontrol eden
    java kodunu yaziniz
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I .
    It is not a palindrome"

/*
     ONEMLI*****: Eger methodumuzun return type'i void ise method icerisinde
 bir deger return edemeyiz. Fakat methodumuzun return type'i void'den farkli bir return type ise
 bir return keyword'u olmak zorunda. Return type'i voidden farkli bir method syso() kullanamaz diye
 bir kural soz konusu bile olamaz. Return edilicek deger'de method'un return type'i ile ayni veri
 tipinde olmak zorundadir.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //System.out.println(isPalindrome(input));
        System.out.println(isPalindrome(input));
        //Return type'i void harici bir method'da
        //System.out.println(isPalindrome(scan.nextLine())); 18 ve 19. cu satirlarla ayni islemi gorur

    }

    public static boolean isPalindrome(String word) {
        boolean flag = true;
        // kutuk  kutuk
        StringBuilder wordSb = new StringBuilder(word);
        wordSb.reverse(); // alican -> nacila || kutuk -> kutuk
        //System.out.println(wordSb + " " + word);
        if (wordSb.toString().equals(word)) {
            flag = true;
        }

        System.out.println(flag);
        return flag;
    }

    public static boolean isPalindrome2(String input) {
        String str = "";
        boolean isPalindrome = false;
        for (int i = input.length() - 1; i >= 0; i--) {

            str += input.charAt(i);
        }
        if (str.equalsIgnoreCase(input)) {
            System.out.println("Bu bir palindromedur");
            isPalindrome = true;
        } else {
            System.out.println("Palindrome degildir");
            isPalindrome = false;
        }

        return isPalindrome;

    }
}
