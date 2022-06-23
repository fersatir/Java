package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to see repeated characters");
        String str = scan.nextLine();
        //1.Way
        findRepeated(str);

        //2.Way
        findRepeated2(str);

    }

    private static void findRepeated2(String str2) {
        str2 = str2.replaceAll("[^a-zA-Z]", "");
        System.out.println(str2);
        String arr[] = str2.split("");
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    count++;
                } else {
                    i = j - 1;
                    break;
                }
            }
            if (count != 1) {
                System.out.println(arr[i] + " = " + count);
            }

        }


    }

    private static void findRepeated(String str) {
        str = str.replaceAll("[^a-zA-Z]", "");
        String arr[] = str.split("");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String w : arr) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<String, Integer> w : map.entrySet()) {
            if (w.getValue() > 1) {
                System.out.println(w.getKey() + " = " + w.getValue());


            }
        }
    }}
