package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp07 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");

        printStartsWithA(list);
        System.out.println();
        printStartsWithAOrO(list);
        System.out.println();
        sortWithLength(list);
        System.out.println();
        printElLengthGreaterThanFive(list);
        System.out.println();
        // System.out.println(removeIfLengthLessThanFive(list));
        System.out.println();
        getCharAndLength(list);
        System.out.println();
        System.out.println(checkNoLength(list));


    }

    //1)Functional Programming
    //Create a method to print list elements which are starting with "A" in uppercases
    private static void printStartsWithA(List<String> list) {

        list.stream().filter(t -> t.startsWith("A")).forEach(t -> System.out.print(t.toUpperCase() + " "));
    }

    /*
	 	2)Functional Programming
	 	Create a method to print list elements which are starting with "A" or ending with "o" in lowercases
    */

    public static void printStartsWithAOrO(List<String> list) {

        list.stream().filter(t -> t.startsWith("A") || t.endsWith("o")).forEach(t -> System.out.print(t.toLowerCase() + " "));
    }

        /*
	 	3)Functional Programming
	 	Create a method to print the elements in uppercases after ordering according to their lengths
	    */

    public static void sortWithLength(List<String> list) {

        list.stream().
                sorted(Comparator.comparing(String::length)).
                map(String::toUpperCase).
                forEach(Utils::printInSameLineWithSpace);
    }

    /*
      4)Use "Functional Programming"
      Create a method to print the elements if the length is greater than 5
     */
    public static void printElLengthGreaterThanFive(List<String> list) {

        list.stream().filter(t -> t.length() > 5).forEach(Utils::printInSameLineWithSpace);
    }

         /*
              5)Use "Functional Programming"
              Create a method to remove the elements if the length is less than 5

             //If you want to use "remove()" methods do not use stream(), work with list directly.
        */
//      public static List<String> removeIfLengthLessThanFive(List<String> list){
//
//        list.removeIf(t-> t.length()<5);
//
//        return list;
//        }

        /*
	          6 )Use "Functional Programming"
	          Create a method to print the length of every element in the following format.
	          Sort by length.
	          Ali: 3        Mark: 4       Amanda: 6     etc.
	    */

    public static void getCharAndLength(List<String> list) {

        list.stream().
                sorted(Comparator.comparing(String::length)).map(t -> t + " : " + t.length()).
                forEach(Utils::printInSameLineWithSpace);
    }

        /*
	 	    9)Use "Functional Programming"
	 	    Create a method to check if no element has length 11
         */

    public static boolean checkNoLength(List<String> list) {

        return list.stream().noneMatch(t -> t.length() == 11);
    }


}
