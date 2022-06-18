package day04ifstatement;

import java.util.Scanner;

public class IfStatement08 {
    public static void main(String[] args) {

        /* TASK :
        Get the number of products and price of the product purchased from the user
        ask if user has customer card or not
        if there is a customer card and buy greater than 10 products, discount 20% otherwise discount 15%
        if there is not a customer card and buy greater than 10 products, discount 15% otherwise discount 10%
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many products that you bought and price of it ?");

        double numberOfProducts = scanner.nextDouble();
        double priceOfProduct = scanner.nextDouble();
        double totalPrice;

        System.out.println("if you have credit card \"y\", if you do not have \"n\"");
        char card = scanner.next().toLowerCase().charAt(0);

        if (card == 'y') {

            if (numberOfProducts > 10) {
                priceOfProduct *= 0.8;
                totalPrice = priceOfProduct * numberOfProducts;
                System.out.println("You have 20% discount. Total price that you need to pay : " + totalPrice);

            } else if (numberOfProducts > 0 && numberOfProducts <= 10) {
                priceOfProduct *= 0.85;
                totalPrice = priceOfProduct * numberOfProducts;
                System.out.println("You have 15% discount. Total price that you need to pay : " + totalPrice);

            } else {
                System.out.println("Invalid input of number of products");
            }
        } else if (card == 'n') {

            if (numberOfProducts > 10) {
                priceOfProduct *= 0.85;
                totalPrice = priceOfProduct * numberOfProducts;
                System.out.println("You have 15% discount.Total price that you need to pay : " + totalPrice);

            } else if (numberOfProducts > 0 && numberOfProducts <= 10) {
                priceOfProduct *= 0.85;
                totalPrice = priceOfProduct * numberOfProducts;
                System.out.println("You have 10% discount.Total price that you need to pay : " + totalPrice);

            } else {
                System.out.println("Invalid input of number of products");
            }

        } else {
            System.out.println("Invalid input");

        }


    }
}
