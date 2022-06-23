package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q21 {

    /*
     Ebay Interview Question
     Put all zeros to end in an integer array
     {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
     {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int length = scanner.nextInt();
        System.out.println("Enter elements of array");
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int arr1[] = new int[length];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                arr1[idx] = arr[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(arr1));


    }


}
