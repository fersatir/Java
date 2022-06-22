package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class Fp01 {
    public static void main(String[] args) {
        /*
        Lambda is a functional programming, we have had Lambda in Java with version 8
        Functional programming focuses on "What to do", with structured programming we focus on "How to"
        Functional programming is used just with Collections and Arrays
        We can not use Maps directly in functional programming, but we can convert Maps to Sets and use them
        we can use entrySet()
         */

        List<Integer> l = new ArrayList<Integer>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);


        printElementStructured(l);
        System.out.println();
        printElementFunctional(l);
        System.out.println();
        printEvenElementStructured(l);
        System.out.println();
        printEvenElementFunctional(l);
        System.out.println();
        printSquareOfOddList(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        getMaxElements01(l);
        System.out.println();
        getMaxElement02(l);
        System.out.println();
        getMinGreaterThanSeven01(l);
        System.out.println();
        getMinGreaterThanSeven02(l);
        System.out.println();
        getMinGreaterThanSeven03(l);
        System.out.println();
        getHalfOfDistinctElementsInReversedOrder(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);


    }// main method

    //1)Create a method to print the list elements on the console in the same line with a space
    // between two consecutive elements.(Structured)

    public static void printElementStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");

        }
    }

    //1) Create a method to print the list elements on the console in the same line with a space
    //between two consecutive elements.(functional)

    public static void printElementFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));
    }

    //1) Create a method to print the even list elements on the console in the same line with a space
    //between two consecutive elements.(Structured)

    public static void printEvenElementStructured(List<Integer> list) {

        for (Integer w : list) {

            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }


    //2) Create a method to print the even list elements on the console in the same line with a space
    //between two consecutive elements.(Functional)

    public static void printEvenElementFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }

    //3) Create a method to print the square of odd list elements on the console in the same line with a space
    //between two consecutive elements.(Functional)

    public static void printSquareOfOddList(List<Integer> list) {

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }

    //4) Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //between two consecutive elements.(Functional)
    //elements should be distinct (unique)
    //elements should be odd
    //elements printed as cube

    public static void printCubeOfDistinctElements(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //7)Create a method to find the maximum value from the list elements


    public static void getMaxElements01(List<Integer> list) {

        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.print("maxValue:" + maxValue);
    }

    //2.way
    public static void getMaxElement02(List<Integer> list) {

        Integer maxValue2 = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.print("maxValue2:" + maxValue2);
    }

    //Create a method to find the minimum value which is greater than 7 and even from the list
    //more than 7, even min value

    //1.Way
    public static void getMinGreaterThanSeven01(List<Integer> list) {

        Integer minGreaterThanSeven = list.stream().
                distinct().
                filter(t -> t > 7).
                filter(t -> t % 2 == 0).
                reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.print(minGreaterThanSeven);
    }

    //2. way

    public static void getMinGreaterThanSeven02(List<Integer> list) {
        Integer minGreaterThanSeven02 =
                list.stream().distinct().
                        filter(t -> t > 7).
                        filter(t -> t % 2 == 0).
                        sorted(Comparator.reverseOrder()).
                        reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.print(minGreaterThanSeven02);
    }

    //3. way

    public static void getMinGreaterThanSeven03(List<Integer> list) {

        Integer minGreaterThanSeven03 =
                list.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).sorted().findFirst().get();

        System.out.println(minGreaterThanSeven03);
    }


    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list
    //distinct,half of the elements, greater than 5, reverse,list

    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {

        List<Double> newList = list.stream().distinct().
                filter(t -> t > 5).
                map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.print(newList + " ");
    }

    //5)Create a method to calculate the sum of the squares if distinct even elements


    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list) {

        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.print(sum);
    }

    //6)Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {

        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);

        System.out.print(product);
    }


}
