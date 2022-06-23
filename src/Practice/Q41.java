package Practice;

import static projects.StorageManagement.TryCatch.scanner;

public class Q41 {
      /* Perfect Number (Mukemmel sayi)
              Kullanici tarafindan bir sayiya kadar olan sayilarin,
              mukemmel olup olmadigini bulan method yaziniz.
              Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
              kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
              ORNEK: (6, 28, 496, 8128)
              INPUT      : 6
              OUTPUT     :  1,2,3
            */

    public static void main(String[] args) {

        System.out.println("Enter a number ");
        int num = scanner.nextInt();

        perfectNumber(num);


    }

    private static void perfectNumber(int num) {
        int sum =0;

        for(int i = 1; i<num; i++) {

            if(num % i==0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println(num + " is perfect number ");
        }else System.out.println(num + " is not perfect number ");

    }
}
