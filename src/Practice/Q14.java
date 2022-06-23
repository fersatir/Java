package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q14 {
    public static void main(String[] args) {

    /*
	  If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
	  type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
	*/

    /*
     If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
    type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
    */

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        List<Integer> list2 = new ArrayList<>();

        int count = 0;

        while (list.size() > 0) {
            int sum = 0;
            for (int j = 0; j < count + 1; j++) {
                sum+=list.get(0);
                list.remove(0);
            }
            list2.add(sum);
            count++;
        }
        System.out.println(list2);


    }
}
