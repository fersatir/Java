package day35generics;

import java.util.Arrays;

public class G02genericsMethods {
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

        System.out.println("*** non-generic method ***");
        System.out.println("maxBul(34,35,17) = "+ maxBul(34, 35, 17));
        System.out.println("maxBul(23,44,63) = " + maxBul(23, 44, 63));

        System.out.println("***  generic method ***");
        System.out.println("maxBulGeneric(34,35,41) = " + maxBulGeneric(34, 35, 41));
        System.out.println("maxBulGeneric(23.3,45.5,61.1) = " + maxBulGeneric(23.3, 45.5, 61.1));
        System.out.println("maxBulGeneric(\"12\",\"14\",\"17\") = " + maxBulGeneric("12", "14", "17"));

    }

    public static <T> void diziYazdir(T[] dizi) {//Generics method declaration->tek parametreli
        Arrays.stream(dizi).forEach(System.out::println);
    }
    // - Bir Generic (type özgü)  method tanımlanırken metodun return type önüne < T > (angle brackets) konulur.
    // - E - Element (used extensively by the Java Collections Framework)
    //   K - Key
    //   N - Number
    //   T - Type
    //   V - Value
    //   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
    // - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
    // - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
    // - çoook önemli TRİCKYYY : Parametre tipleri non-primitif olmalıdır.
    // - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
    //   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.

    private static int maxBul(int a, int b, int c) {
        int max = 1;

        if(b>c){
            max=b;
        }
        if(c>b){
            max=c;
        }

        return max;
    }
    // - Generic veri tipleri sadece non-primitif olabilir.
    // - Binary operatörler (+, -,*, / ,<, >) ise non-primitif veri tiplerinde kullanılamazlar.
    // - Dolayısıyla bir generic metotta karşılaştırma için ne kullanılabilir?
    // - CEVAP: Comparable interface’i kullanılmalı.

    // public static x x maxBulGeneric(x x x) {//generic method

    public static <T extends Comparable<T>> T maxBulGeneric(T a, T b, T c) {
        T max = a;

        if (b.compareTo(c) > 0) {
            max = b;
        }
        if (c.compareTo(b) > 0) {//b generic ınt degeri obj ile max generic obj int degeri farkı return eder
            max = c;
        }
        return max;
    }
}
