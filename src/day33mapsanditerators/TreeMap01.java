package day33mapsanditerators;

import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {

        /*
        TreeMap puts the entries in natural order
        TreeMap does not accept Null key, but accepts multiple null values
        TreeMap is not thread-safe and not synchronized
        TreeMap is the slowest map in java as it uses natural order
         */

        TreeMap<String, Integer> tm1 = new TreeMap<>();

        tm1.put("Ali", 3000);
        tm1.put("Tom", 500);
        tm1.put("Alexandra", 12000);
        tm1.put("Mark", 5000);
        tm1.put("Angelina", 23000);
        tm1.put("Walker", null);
        tm1.put("Talker", null);

        System.out.println(tm1);

        // What is the best way to place elements of a map in natural order


    }
}
