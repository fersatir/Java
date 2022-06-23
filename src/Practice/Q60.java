package Practice;

import java.util.HashMap;
import java.util.Map;

public class Q60 {
      /*
       Verilen bir metindeki harflerin frekansini (tekrar sayisi) bolup yazdiran bir METHOD yaziniz
       Test data:
       Input = AAABBCDD
       Output = A3B2C1D2
        */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        //1.Way
        frequency(str);

        //2.Way
        String arr[] = str.split("");
        Map<String, Integer> map = new HashMap<>();

        int count = 1;
        for (String w : arr) {

            if (map.putIfAbsent(w, count) != null) {
                map.put(w, (map.putIfAbsent(w, count) + 1));
            } else {
                map.put(w, count);
            }
        }
        System.out.println(map);


    }

    private static void frequency(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i++) {
            int sayac = 0;
            for (int j = i; j < str.length(); j++) {

                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {

                    sayac++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += str.substring(i, i + 1) + sayac;
            }
        }
        System.out.println(output);


    }
}
