package Practice;

import java.util.Scanner;

public class Q70 {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scanner.nextLine().toLowerCase();
        System.out.println("1.yol ile while loop");
        //1.yol:
        int index = 0;
        while (index < str.length()) {
            char c = str.charAt(index);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c);
            }
            index++;
        }
        System.out.println();
        System.out.println("2.yol ile replace All methodu");
        //2.yol
        String s = str.replaceAll("[^aeiou]", "");

        System.out.println(s);
    }
}
