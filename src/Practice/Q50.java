package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Q50 {
    public static void main(String[] args) {

         /*
            Problem Tanımı :
            getSum isminde bir method oluşturun.
            Parametresi ArrayList'tir.
            Dizideki tüm $ ları kaldır ve tüm sayıları topla
            return yaptğımız veri tipi 'int' olmalıdır.
            sonuç 0'dan küçükse, -1 yazdırın.

            Örnek1:
            ArrayList = $13, $15, $20
            Cevap = 48 olmalı

            Örnek 2 :
            ArrayList= $-13, $0, $0
            Cevap = -1 olmalı.
             */


        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("$13", "$15", "$20"));

        System.out.println(getSum(arrList));
    }

    private static int getSum(ArrayList<String> arrList) {
        int sum = 0;
        for (String each : arrList) {

            String str = each.replace("$", "");
            sum += Integer.parseInt(str);
        }

        if (sum < 0) {
            return -1;
        } else return sum;

    }
}
