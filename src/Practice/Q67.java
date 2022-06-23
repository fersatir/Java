package Practice;

import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        /*
        create one int
        do while int is less than 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("100'den kucuk bir sayi girin");
        int sayi = scanner.nextInt();

        do {
            System.out.print(sayi + " ");
            sayi += 5;
        } while (sayi < 100);


    }
}
