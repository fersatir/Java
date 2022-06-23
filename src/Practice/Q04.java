package Practice;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Q04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int num = scan.nextInt();

        primeNumber(num);
        primeNumbersLambda(num);
    }

    public static void primeNumber(int num) {
        int counter = 0;

        if (num > 0) {
            if (num == 1) {
                System.out.println("It is not a prime number");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) counter++;
                }
                if (counter == 0) {
                    System.out.println("It is a prime number");
                } else {
                    System.out.println("It is not a prime number");
                }
            }
        } else {
            System.out.println("Please enter positive number");
        }

    }

    public static void primeNumbersLambda(int num) {
        System.out.println(IntStream.range(2, num).
                allMatch(t -> num % t != 0) ?  (num + " is a prime number"):(num + " isn't a prime number") );
    }



}
