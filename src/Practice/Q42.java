package Practice;

import java.util.Arrays;

import static projects.StorageManagement.TryCatch.scanner;

public class Q42 {
         /*
            Create a function that takes an array and the difference between the largest
            and the smallest numbers.
            Ask user to enter array elements.
         */

    public static void main(String[] args) {

        array();
    }

    private static void array() {

        System.out.println("Enter length of array");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int difference = arr[length - 1] - arr[0];

        System.out.println("difference = " + difference);
    }

}
