package day10forloopwhileloop;

import java.util.*;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");


        int kalanHak = 0;
        int toplamHak = 0;


        while (true) {
            int yanlis = 0;
            int dogru = 0;
            System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");
            int secim = scan.nextInt();

            toplamHak = film.get(secim - 1).length() * 2;
            kalanHak = toplamHak;


            System.out.println("Secilen filmin karakter sayisi : " + film.get(secim - 1).length() + "\ntahmin hakkiniz : " + kalanHak);
            boolean tahmin = false;
            while (kalanHak > 0) {
                kalanHak--;

                System.out.println("Lutfen film tahmininde bulunun");
                String filmTahmin = scan.next().toLowerCase();

                if (filmTahmin.equalsIgnoreCase(film.get(secim - 1))) {
                    dogru++;
                    System.out.println("Dogru tahmini " + (toplamHak - kalanHak) + ". defada buldunuz." +
                            "\nDogru tahmin sayisi : " + dogru + "\t Kalan hak sayiniz : " + kalanHak);
                    tahmin = true;
                    break;
                } else {
                    yanlis++;
                    System.out.println(yanlis + "  defa yanlis tahminde bulundunuz.Kalan hak sayiniz : " + kalanHak);

                }
            }

            if (tahmin) {

                System.out.println("Oyunu kazandiniz.");
            } else {
                System.out.println("Oyunu kaybettiniz.Tahmin etmeniz gereken film : " + film.get(secim - 1));
            }

            System.out.println("Tekrar oynamak icin 1'e basin\ncikmak icin 0'a basin");
            int karar = scan.nextInt();
            if (karar == 0) {
                break;
            }

        }


    }// main method
}
