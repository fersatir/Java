package day30Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args) {

        /*
        Set is collection that is used just for unique elements
        Hash is a technique to create unique codes for each data
        HashSet is a fast operation because they do not use any specific order for data
         */

        HashSet<String> hs1 = new HashSet<>();

        hs1.add("K");
        hs1.add("K");
        hs1.add(null);
        hs1.add(null);

        System.out.println(hs1);

        HashSet<String> hs2 = new HashSet<>();
        hs2.add("K");
        hs2.add(null);


        System.out.println(hs1.equals(hs2)); // [null, K] //[null, K] => true

        // Interview questions : type a code to display arrayList elements only once
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);

        System.out.println(list); //[5, 3, 5, 2, 5, 3] // 5,3,2

        HashSet<Integer> hs3 = new HashSet<>();

        hs3.addAll(list);

        System.out.println(hs3); //[2, 3, 5]


        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add(null);
        System.out.println(set); //[null, A]


    }
}
