package day30Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethods02 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List: " + list);

        //to remove all elements use remove() after next();
        //if you do not use next you wil get IllegalStateException

        ListIterator<String> listItr1 = list.listIterator();

        while (listItr1.hasNext()) {
            listItr1.next();
            listItr1.remove();
        }
        System.out.println("After removing: " + list);

        // to add new elements to the list use add()
        listItr1.add("A");
        listItr1.add("B");
        listItr1.add("C");
        System.out.println("After adding : " + list);


    }
}
