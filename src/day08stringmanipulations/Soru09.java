package day08stringmanipulations;

import java.util.Scanner;

public class Soru09 {
    public static void main(String[] args) {
        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there arent 16 digit print "Invalid credit
         * card number"
         *
         * Input : John White 1234234534561478 Output : Name : J*** W**** CCN : ****
         * **** **** 1478 (Initials for name and surname should be uppercase)
         *
         *
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();
        System.out.print("Lutfen bir soyisim giriniz :");
        String soyisim = scan.next();
        System.out.print("Lutfen kart numaranizi giriniz :");
        String kartno = scan.next();

        if (kartno.length() == 16) {

            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
            soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
            kartno = kartno.substring(0,12).replaceAll("\\d", "*") + kartno.substring(12);

        } else {
            System.out.print("lutfen 16 haneli kart numarasi giriniz :");
        }

        System.out.println(isim + " " + soyisim + " " + kartno);


    }
}
