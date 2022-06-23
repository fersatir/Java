package Practice;

import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {

        //Get 2 numbers from the user.
        //first number base
        //second number Top
        //Write a code that calculates the prime of a number.
        // 2, 3 --> 2^3 = 2*2*2= 8

        // 4, 3 --> 4^3= 4*4*4 = 64

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two numbers base and top");
        int base = scanner.nextInt();
        int top = scanner.nextInt();
        int sum = 1;
        for (int i = 0; i < top; i++) {
            sum *= base;
        }
        System.out.println(base + "^" + top + "=" + sum);


    }
}
