package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        /*
        HashTable is a Map
        HashTable is thread-safe and synchronized
        HashTable does not accept any null key or value
        HashTable does not put the elements in natural order
        HashTable is slower than HashMap
         */

        Hashtable<String, Integer> ht1 = new Hashtable<>();
        ht1.put("Ali", 300);
        ht1.put("Tom", 500);
        ht1.put("Alexandra", 12000);
        ht1.put("Mark", 500);
        ht1.put("Angelina", 23000);
        // ht1.put("value",null); can not be accepted
        //if we use null as key or value, we will get NULLPOINTEREXCEPTION

        System.out.println(ht1);

        System.out.println(ht1.containsKey("Angelina")); //if we have this key, it will return true,if not it returns false

        System.out.println(ht1.containsValue(500));//if we want to check the value for entries, then if value exists, it return true


        Hashtable<String, Integer> ht2 = new Hashtable<>();
        ht2.put("Ali", 300);
        ht2.put("Tom", 500);
        ht2.put("Alexandra", 12000);
        ht2.put("Mark", 500);
        ht2.put("Angelina", 23000);

        System.out.println(ht1.equals(ht2)); //when we check the elements of 2 maps, it will not check the order, but just values

        System.out.println(ht1.size() == 0);// this is not best way to check whether your map has elements or not
        System.out.println(ht1.isEmpty());// this is the best way to check if your map has elements or not


    }
}
