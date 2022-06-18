package day04ifstatement;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        //TASK : Write a code that prints in which region the coordinate point you received from the user is

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x point");
        int x = scanner.nextInt();

        System.out.println("Enter y point");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("value that you input belongs to first region");
        }
        else if (x < 0 && y > 0) {
            System.out.println("value that you input belongs to second region");
        } else if (x < 0 && y < 0) {
            System.out.println("value that you input belongs to third region");
        } else if (x > 0 && y < 0) {
            System.out.println("value that you input belongs to fourth region");
        } else if (x != 0 && y == 0) {
            System.out.println("value that you input belongs to x point");
        } else if (x == 0 && y != 0) {
            System.out.println("value that you input belongs to y point");
        } else {
            System.out.println("It is in origin");
        }


    }
}
