package Practice;

import java.util.Scanner;
import java.util.stream.Stream;

public class Q03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci numbers do you want to see");
        int num = scanner.nextInt();

        fibo(num);
        //fibonacci(num);


    }

    public static void fibonacci(int num) {

        int fibonacci = 0;
        int fibo1 = 1;
        int fibo2 = 1;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i = 1; i < num - 1; i++) {

            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }


    }

    public static void fibo(int num) {

        Stream.iterate(new long[] { 1, 1 }, p -> new long[] { p[1], p[0] + p[1] })
                .limit(num)
                .forEach(p -> System.out.println(p[0]));

    }

}

