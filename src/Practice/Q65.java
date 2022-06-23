package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q65 {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

        //1.way
        String str= "Javaisalsoeasy";
        String arr1[] = str.split("");
        Arrays.sort(arr1);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < arr1.length; i++) {
            for(int j = i+1; j < arr1.length; j++) {

            if(arr1[i].equals(arr1[j]) && !list.contains(arr1[j])) {
                list.add(arr1[i]);

            }
            }
        }
        System.out.println(list);


        //2.way
        char arr[]= str.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Character> output = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){

                if(arr[i] == arr[j] && !output.contains(arr[j])){

                    output.add(arr[j]);
                }
            }
        }
        System.out.println(output);




















    }
}
