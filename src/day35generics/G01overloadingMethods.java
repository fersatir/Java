package day35generics;

import java.util.Arrays;

public class G01overloadingMethods {
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleDizi = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charDizi = {'T', 'U', 'G', 'B', 'A' };
        System.out.println("integer dizi: ");
        diziYazdir(intDizi);
        System.out.println("double dizi: ");
        diziYazdir(doubleDizi);
        System.out.println("char dizi: ");
        diziYazdir(charDizi);
        System.out.println("***  Super Object Class *** ");
        diziYazdirObject(intDizi);
        diziYazdirObject(doubleDizi);
        diziYazdirObject(charDizi);
    }
    //Overloaded methods...
    public static void diziYazdir(Integer[] dizi) {//parametre için wraper class sartı yok
        Arrays.stream(dizi).forEach(System.out::println);
    }
    public static void diziYazdir(Double[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }
    public static void diziYazdir(Character[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }
    public static void diziYazdirObject(Object[] dizi) {
        Arrays.stream(dizi).forEach(System.out::println);
    }
    //Object Class'daki datalarin type'ı farklı oldg için bu veriler alınırken casting yapılmazsa CTE verir
}
