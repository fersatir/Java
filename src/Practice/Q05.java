package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 { /*
	 	Create a function that takes an array and
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter length of an Array");
        int length = scan.nextInt();

        differenceNumbers(length);


    }

    private static void differenceNumbers(int length) {


        int arr[] = new int[length];
        System.out.println("Enter " + length + " array numbers");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        int difference = arr[arr.length - 1] - arr[0];
        System.out.println("difference between the biggest and the smallest numbers = " + difference);


    }
}
