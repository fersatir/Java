package Practice;

import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {

        // indexi tek sayi olan karakterleri yazdiran bir code yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String str = scanner.nextLine();

        int index = 0;

        do {

            if (index % 2 != 0) {
                System.out.print(str.charAt(index) + " ");
            }
            index++;
        } while (index < str.length());


    }

}
