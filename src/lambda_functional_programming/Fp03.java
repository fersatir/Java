package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
    public static void main(String[] args) {


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

        getElementsOnSeparateLine(l);
        System.out.println();
        getElementsOnSeparateLineWithStar(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        sumOfTheSquaresOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        getMaxElements(l);
        System.out.println();
        getMinGreaterThanSeven(l);
        System.out.println();
        getHalfOfDistinctElementsInReversedOrder(l);

    }

    //Create a method to print all elements on a separate line

    public static void getElementsOnSeparateLine(List<Integer> list) {

        list.stream().forEach(System.out::print);

    }

    //Create a method to print all elements on a separate line with a star

    public static void getElementsOnSeparateLineWithStar(List<Integer> list) {

        list.stream().forEach(Utils::printElementWithAStar);
    }


    //4) Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //between two consecutive elements.(Functional)

    public static void printCubeOfDistinctElements(List<Integer> list) {

        list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printInSameLineWithSpace);
    }

    //5)Create a method to calculate the sum of the squares of distinct even elments

    public static void sumOfTheSquaresOfDistinctEvenElements(List<Integer> list) {

        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquares).
                reduce(0, Math::addExact);
        // reduce(0,(t,u)-> t+u);

        System.out.print(sum);

    }

    //6) Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {

        Integer product = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).
                reduce(1, Math::multiplyExact);
        System.out.print(product);

    }


    //7) Create a method to find the maximum value from the list elements

    public static void getMaxElements(List<Integer> list) {
        Integer max = list.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.print("max : " + max);
    }

    //8)Create a method to find the minimum value which is greater than 7 and even from the list

    public static void getMinGreaterThanSeven(List<Integer> list) {

        Integer min = list.stream().distinct().filter(t -> t > 7).filter(Utils::checkToBeEven).
                reduce(Integer.MAX_VALUE, Math::min);

        System.out.print("min: " + min);
    }

    //9)Create a method to find the half of the elements which are distinct and greater than 5 in reverse
    // order on the list   distinct, half of the elements, greater than 5, reverse, list

    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list) {

        List<Double> newList = list.stream().distinct().filter(t -> t > 5).map(Utils::halfOfTheElements).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(newList);
    }


}
