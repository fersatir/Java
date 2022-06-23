package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Q36 {
        /* Kullanicidan bir String aliniz.
        String de var olan her caharacter'in sayisini ekrana yazdiriniz
        Ornek: alacan ==> a=3, l =3, c=1, n=1
               abaa ==> a=3, b=1;
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir string giriniz");
            String str = scanner.nextLine();


            //1.Way

            str = str.replaceAll("[^a-z,A-Z]","");
            String arr [] = str.split("");
            Arrays.sort(arr);
            //System.out.println(Arrays.toString(arr));

            int count =0;
            for(int i = 0; i < arr.length; i++) {
                count =1;

               for(int j = i+1; j < arr.length; j++) {

                   if(arr[i].equals(arr[j])){
                       count++;
                   }else{
                       i=j-1;
                       break;
                   }
               }
                System.out.println(arr[i] + " = " + count);
            }

            //2. way
            Map<String,Integer> hm1 = new HashMap<>();
            for(int i = 0; i < arr.length; i++) {

                if(hm1.containsKey(arr[i])){

                    hm1.put(arr[i],hm1.get(arr[i])+1);

                }else{
                    hm1.put(arr[i],1);
                }
            }
            System.out.println(hm1);

            //3.Way

            Map<String,Integer> hm2 = new HashMap<>();

            for(String each : arr){

                Integer num = hm2.get(each);

                if(num == null){
                    hm2.put(each,1);
                }else{
                    hm2.put(each, num+1);
                }
            }

            System.out.println(hm2);

            //4. Way


            harfRakamBulma(str);

        }

        public static void harfRakamBulma(String str){

            Arrays.stream(str.split(""))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(t -> t, HashMap ::new, Collectors.counting()))
                    .forEach((k, v) -> System.out.println(k + " = " + v));

        }
}
