package day30Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class ListIteratorMethods01 {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List: " + list);

        System.out.println("List is in the given order");
        //to print elements on the console

        ListIterator<String> listItr1 = list.listIterator();
        while(listItr1.hasNext()) {

            Object element = listItr1.next();
            System.out.println(element);
        }

        System.out.println("List is reversed");
          /*
          To display the list backwards use hasPrevious() and previous()
          Before using hasPrevious() and previous(), you need to use hasNext() and next()
          to move the pointer to the end of the list
           */

        while(listItr1.hasPrevious()){
            Object element = listItr1.previous();
            System.out.println(element);
        }

        System.out.println("List is updated");

        //To update the elements use set()

        ListIterator<String> listItr2 = list.listIterator();
        while(listItr2.hasNext()){

            Object element = listItr2.next();
            listItr2.set(element + "W");
        }

        System.out.println("Updated list: " + list);























































    }
}
