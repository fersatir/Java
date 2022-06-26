package day35generics;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericClass {

    public static void main(String[] args) {

     /*
        Java5 öncesi (raw list) farklı data type ile çalışılabilir..Ancak list elemanlrı alınırken  Cast işlemi
        yapılırken Runtime hatası lama ihtimali yuksektir.
         */
        // List<String> list=new ArrayList<>();--< generic list
        List liste = new ArrayList(); //java5 öncesi raw list

        liste.add("tugba hanım");
        liste.add(571622);
        System.out.println("liste = " + liste);
        String name = (String) liste.get(0);//Object class data type String Class data tyoe casting yapıldı
        int tel = (int) liste.get(1);//Object class data type int  data tyoe casting yapıldı

        System.out.println("name+\" \"+tel = " + name + " " + tel);

        liste.add(20.21);
        //  System.out.println((Integer) liste.get(2));//cte vermez ama rte ClassCastException fırlatır

        //Row list yerine Object super Class data type...

        List<Object> objList = new ArrayList<>();//Object super Class data type list create edildi
        objList.add("enes faruk baltacı");
        objList.add(2022);
        objList.add(2000.5);

        String uzman = (String) objList.get(0);
        Integer yıl = (Integer) objList.get(1);

        for (Object each : objList) {
            String yazi = (String) each;
            System.out.println(yazi);// rte ClassCastException
        }
    }
}
