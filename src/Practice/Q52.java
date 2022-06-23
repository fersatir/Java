package Practice;

import java.util.ArrayList;

public class Q52 {
    public static void main(String[] args) {
        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemaının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        ArrayList<Integer> list = new ArrayList<>();
        randomEkle(list, 0, 20);
    }

    private static void randomEkle(ArrayList<Integer> list, int min, int max) {

        for (int i = 0; i < 10; i++) {

            list.add((int) (Math.random() * (max - min + 1)));
        }
        System.out.println("random list :" + list);

        int sayac = 0;
        for (int each : list) {

            if (each % 2 == 0) {
                list.set(list.indexOf(each), 111);
                sayac++;
            }
        }
        System.out.println("111 ler eklendikten sonra random liste : " + list);
        if (sayac == 0) {
            System.out.println("cift sayi yoktur");
        }

        System.out.println("listenin son hali : " + list);
    }


}
