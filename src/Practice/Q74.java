package Practice;

import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "zyxwvutsrqponmlkjihgfedcba";
        System.out.println("sifrelenecek ifadeyi giriniz");
        String str3 = scan.nextLine().toLowerCase();

        for(int i=0; i<str3.length(); i++){
            for(int j=0; j<26; j++){

                if(str3.charAt(i) == str1.charAt(j)){

                    System.out.print(str2.charAt(j));
                }
            }
        }

























    }

























}
