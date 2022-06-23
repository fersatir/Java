package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08 {
    /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list elements. to stop entrance press '*'");

        List<String> list = new ArrayList<String>();

        String str = "";

        while (!str.equals("*")) {

            str = scanner.next();
            if (!str.equals("*")) {

                list.add(str);
            }
        }
        System.out.println(list);

        List<String> list2 = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {

            if (!list2.contains(list.get(i))) {

                list2.add(list.get(i));
            }
        }
        System.out.println(list2);


    }
}
