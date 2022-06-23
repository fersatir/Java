package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    //Write a Java Program to reverse a string
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String str = scanner.next();

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i) + " ");

        }

        //2.way

        StringBuilder strB = new StringBuilder();
        strB.append(str);

        System.out.println();
        System.out.println(strB.reverse());




    }


}
