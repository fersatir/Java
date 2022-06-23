package projects.Market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shopping {
    static double totalPrice;
    static List<Products> products = new ArrayList<>();// Ürün listesini tutar
    static List<Products> shoppingCart = new ArrayList<>();// alışveriş sepetindeki ürünlerin listesini tutar
    static Scanner scan = new Scanner(System.in);

    public void start() {
        Products products1 = new Products("1", "Domates", "2.10");
        Products products2 = new Products("2", "Patetes", "3.20");
        Products products3 = new Products("3", "Biber", "1.50");
        Products products4 = new Products("4", "Sogan", "2.30");
        Products products5 = new Products("5", "Havuc", "3.10");
        Products products6 = new Products("6", "Elma", "1.20");
        Products products7 = new Products("7", "Muz  ", "1.90");
        Products products8 = new Products("8", "Cilek", "6.10");
        Products products9 = new Products("9", "Kavun", "4.30");
        Products products10 = new Products("10", "Uzum", "2.70");
        Products products11 = new Products("11", "Limon", "0.50");
        products.add(products1);
        products.add(products2);
        products.add(products3);
        products.add(products4);
        products.add(products5);
        products.add(products6);
        products.add(products7);
        products.add(products8);
        products.add(products9);
        products.add(products10);
        products.add(products11);

        System.out.println("--------------YAVUZ MARKETE HOSGELDINIZ--------------");
        System.out.println("No: " + "\t \t" + "Adı:" + "\t " + "Kg Fiyatı");
        System.out.println("----    --------    --------");
        for (Products w : products) {
            System.out.println(w.productsNumber + "\t \t" + w.productName + "\t \t" + w.productPrice);
        }

        select();
    }

    public void select() { // ürün seçme methodu
        System.out.println("Almak İstediğiniz Ürünün Kodunu Girin");
        String number = scan.next();
        System.out.println("Kilogram Girin");
        String kilo = scan.next();

        Products shopping = new Products(number, kilo);
        shoppingCart.add(shopping);

        shoppingPrint();
    }

    public void shoppingPrint() { // Aldığı ürünleri gösteren alışveriş fişi
        System.out.println("Sepetinizdeki ürünler:");
        totalPrice = 0.0;
        for (Products w : shoppingCart) {
            System.out.println(w.productWeight + " kg " + products.get(Integer.valueOf(w.productsNumber) - 1).productName + " - " +
                    "Fiyat: " + (Double.valueOf(products.get(Integer.valueOf(w.productsNumber) - 1).productPrice) * Double.valueOf(w.productWeight)));

            totalPrice += (Double.valueOf(products.get(Integer.valueOf(w.productsNumber) - 1).productPrice) * Double.valueOf(w.productWeight));
        }
        System.out.println("Toplam Tutar: " + totalPrice);
        isContinious();
    }

    private void isContinious() { // Alışverişe devam edip etmeyeceği sorulur
        System.out.println("Alışverişe Devam Etmek İstiyor musunuz Evet için \"E\" Hayır için \"H\" tuşlayınız ");

        char result = scan.next().toUpperCase().charAt(0);

        if (result == 'E') {
            select();
        } else if (result == 'H') {
            payments();
        } else {
            System.out.println("Yanlış işlem seçimi yaptınız.");
            isContinious();
        }

    }

    private void payments() { // Ödeme methodu

        System.out.println("Yaptığınız Alışveriş Sonrası Ödemeniz Gereken Tutar: " + totalPrice);
        System.out.println("Lütfen Ödeme Yapılan Tutarı Giriniz:");
        double pay = scan.nextDouble();

        if (totalPrice > pay) {
            System.out.println("Eksik Ödeme Yaptınız.");
            payments();
        } else if (totalPrice == pay) {
            System.out.println("Ödemeniz Tamamlanmıştır.");
            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler Yine Bekleriz...");
        } else if (totalPrice < pay) {
            System.out.println("Para üstünüz :" + (pay - totalPrice));
            System.out.println("Bizi Tercih Ettiğiniz İçin Teşekkürler Yine Bekleriz...");
        }else{
            System.out.println("Yanlış giriş yaptınız.");
            payments();
        }


    }

}
