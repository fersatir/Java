package day30Collections;

import java.util.LinkedList;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

        /*print and see all elements on the console
        System.out.println(ll1);

        String firstElement = ll1.element();
        System.out.println(firstElement); // returns first element of the list without removing any element(copy+paste)
        System.out.println(ll1);

        String firstElement2 = ll1.poll();// returns the first element, but removing the element from the list (cut+paste)
        System.out.println(firstElement2); Ali
        System.out.println(ll1);   [Can, Mark, Tom]

        String firstElement3 = ll1.peek(); //returns the first element without removing the element( copy + paste )
        System.out.println(firstElement3);
        System.out.println(ll1);

         */

        LinkedList<String> ll2 = new LinkedList<>();

        // System.out.println(ll2.element()); // returns NoSuchElementException

        // System.out.println(ll2.peek()); // this returns just a null if there is no value

        //  System.out.println(ll2.poll()); // this returns just a null if there is no value

        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(0, 12); // When I want to use order for the elements, I can place at specific indexes my list elements
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);

        System.out.println(ll3);

        Integer first1 = ll3.remove(); // retrieve the first element and will remove it from the list
        System.out.println(first1);
        System.out.println(ll3);

        Integer first2 = ll3.remove(2);
        System.out.println(first2); // retrieve 2 index element and remove it from the list
        System.out.println(ll3);

        System.out.println(ll3.poll());
        System.out.println(ll3);


    }
}
