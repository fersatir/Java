package day10forloopwhileloop;

import java.util.Arrays;
import java.util.Comparator;

public class Q01 {
    public static void main(String[] args) {

        // create a program to print from 100 to 0 even numbers without usind decrement(--)

        String str = "";

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {

                str += i + " ";

            }
        }

        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.reverseOrder()));
        System.out.println(Arrays.toString(arr));


    }
}
