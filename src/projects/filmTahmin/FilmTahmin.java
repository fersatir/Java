package projects.filmTahmin;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.Scanner;

public class FilmTahmin {

    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
/*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");

        System.out.println("1-" + (film.size()) + " arasinda bir sayi giriniz");

        String secilenFilm = film.get(scan.nextInt() - 1);

        String arrSecilenFilm[] = secilenFilm.split("");

        List<String> filmListe = new ArrayList<>(Collections.nCopies(arrSecilenFilm.length, "-"));

        int tahmin = 0;
        int hak = secilenFilm.length() * 2;
        String harf = "";
        System.out.println(arrSecilenFilm.length + " Harfli Yabancı Bir Film Tahmin Ediniz");
        for (String s : filmListe) {
            System.out.print(s);
        }
        while (tahmin <= hak) {

            System.out.println("");
            System.out.println("Yanlış tahmin sayısı " + tahmin + "/" + hak);
            System.out.println("Tahmin için bir harf giriniz.");
            harf = scan.next().toUpperCase();
            for (int i = 0; i < arrSecilenFilm.length; i++) {
                if (arrSecilenFilm[i].contains(harf)) {
                    filmListe.set(i, harf);
                }
            }
            if(!secilenFilm.contains(harf)){
                tahmin++;
            }
            for (String s : filmListe) {
                System.out.print(s);
            }
            if (!filmListe.contains("-")) {
                System.out.println("");
                System.out.println("Tebrikler bildiniz: " + tahmin + "/" + hak);
                break;
            } else if (tahmin >= hak) {
                System.out.println("Maalesef hakkınızı tamamladınız : " + tahmin + "/" + hak);
                break;
            }

        }
    }
}
