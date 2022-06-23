package Practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q54 {
    public static void main(String[] args) {
         /*
        create one int
        do while int is less than 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int");
        int num = scan.nextInt();

        do {
            System.out.print(num + " ");
            num += 5;

        } while (num < 100);


    }

}
