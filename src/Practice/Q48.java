package Practice;

import java.util.Arrays;

public class Q48 {

    /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
    public static void main(String[] args) {
        int arr[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        System.out.println("eleman sayisi " + elemanSayisi(arr));
        System.out.println("lambda eleman sayisi " + elemanSayisi2(arr));

    }

    private static int elemanSayisi(int[][] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                count++;
            }
        }
        return count;
    }

    private static int elemanSayisi2(int[][] arr) {

        return (int) Arrays.stream(arr).flatMapToInt(Arrays::stream).count();

    }

}
