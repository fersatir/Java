package day30Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    If you need to use unique elements in a natural order, then use TreeSet
    it will sort the elements in ascending order
    HashSet is faster than TreeSet but TreeSet can also order the elements

     */
    public static void main(String[] args) {

        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(12);
        ts1.add(35);
        ts1.add(10);
        ts1.add(46);
        ts1.add(9);

        System.out.println(ts1);


        /*
        How to store unique elements in natural order?
        I can use TreeSet
        Yes. but as you know TreeSet is so slow, How can you make it faster?
        I will first create a HashSet and add all elements to a HashSet
        Then I can convert them into a TreeSet and it will be faster
         */

        // A C C B
        //1. way
        Long t1 = System.nanoTime();
        TreeSet<String> ts2 = new TreeSet<>();

        ts2.add("K");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("C");
        ts2.add("T");

        System.out.println(ts2);
        Long t2 = System.nanoTime();

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
        System.out.println(hs1);

        TreeSet<String> ts3 = new TreeSet<>(hs1);
        Long t3 = System.nanoTime();
        System.out.println(ts3);
        System.out.println(t2 - t1);
        System.out.println(t3 - t2);


    }
}
