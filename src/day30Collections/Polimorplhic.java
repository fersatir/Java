package day30Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Polimorplhic {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list1);

        /*
        Which one is faster?
        reading =>arrayList
        removing and inserting => linkedList
         */


    }
}
