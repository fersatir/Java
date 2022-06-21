package day30Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class IteratorAndForEachLoop {
    public static void main(String[] args) {
        List<String> list2 = new LinkedList<>();
        list2.add("X");
        list2.add("Y");
        list2.add("Z");
        System.out.println(list2);

        /*
        Iterator is used to modifythe collections.
        It has three methods
            1)hasNext(); Returns true if there are more elements.Otherwise, returns false.
            2)next(); Returns the next element. Throws NoSuchElementException if there is not a next element
            3)remove(); Removes the current element.
              Throws IllegalStateException if you call remove() before using next()
         */

        Iterator<String> itr1 = list2.iterator();
        //to print elements we can use next() method

        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }

        // We can use for-each() loop to print elements on the console as well

        for(String w: list2){
            System.out.println(w);

        }

        //What is the difference between for-each() and iterator?
        // we can not modify a collection by using for-each(); however, iterator() can modify

        for(String w: list2){
            w = w+"M";
        }
        System.out.println("After for-each() loop : " + list2);

        // Before every while you need to use iterator()

        //Before every while you need to use iterator()
        Iterator<String> iterator2= list2.iterator();

        while(iterator2.hasNext()){
            iterator2.next(); // Do not forget to use next() before using remove()
            iterator2.remove();
        }

        System.out.println("After iterator(): " + list2);











































    }






































}
