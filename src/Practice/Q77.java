package Practice;
import java.util.ArrayList;
import java.util.Arrays;
public class Q77 {
    public static void main(String[] args) {

        String str ="Javaisalsoeasy";
        char arr [] = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        ArrayList<Character> output = new ArrayList<Character>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j] && !output.contains(arr[j])){
                    output.add(arr[i]);
                }
            }
        }
        System.out.println(output);


    }
}
