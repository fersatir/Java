package day08stringmanipulations;

import java.util.Scanner;

public class Bankamatik {

    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   ****   ");
        System.out.println("   ATM'ye hos geldiniz     ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatirma : 3\ncikis : 4 ");


        secim();

    }

    public static void secim() {

        System.out.println("Yapacaginiz islemi secin : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                bakiyeSorgulama();
                break;

            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Hatali veri girdiniz");


        }


    }

    public static void paraYatir() {
        System.out.print("Ne kadar yatirmak istiyorsunuz");
        int yatirilacakMiktar = scan.nextInt();
        bakiye += yatirilacakMiktar;
        System.out.println("paraniz yatmistir");
        System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    public static void paraCek() {
        System.out.print("Cekeceginiz miktari giriniz");
        int cekilecekMiktar = scan.nextInt();

        if (cekilecekMiktar > bakiye) {
            System.out.println("Bakiyeniz yetersiz");
        } else {

            bakiye -= cekilecekMiktar;
            System.out.println("        ********          ");
            System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");
            int karar = scan.nextInt();
            if (karar == 1) {
                secim();
            } else cikis();
        }

    }

    public static void bakiyeSorgulama() {
        System.out.print("bakiyeniz : " + bakiye);
        System.out.println("        ********          ");
        System.out.println("isleme devam etmek istiyorsaniz 1\n isleme devam etmek istemiyorsaniz 0\n tuslayiniz");

        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    public static void cikis() {

        System.out.println("cikisiniz yapildi yine bekleriz ");

    }
}
