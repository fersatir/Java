package day04ifstatement;

import java.util.Scanner;

public class IfStatement10 {
    public static void main(String[] args) {
        /*
        TASK:
        Get speed of vehicle from user
        calculate ticket because of some reasons
        speed limit = 45
        if speed is between 55-74. Ticket is 100$
        if speed is between 75-84. Ticket is 150$
        if speed is between 85-94. Ticket is 320$
        if speed is greater than 94. Ticket is 500$

        by the way driving without driver licence add 200$ as a ticket

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you have driver licence type \"y\", if you do not have type \"n\"");
        char isDriverLicenceAvailable = scanner.next().toLowerCase().charAt(0);

        System.out.println("Enter your current speeed");
        int currentSpeed = scanner.nextInt();

        if (isDriverLicenceAvailable == 'y') {
            if (currentSpeed >= 55 && currentSpeed < 75) {
                System.out.println("Ticket is 100 $ ");
            } else if (currentSpeed >= 75 && currentSpeed < 85) {
                System.out.println("Ticket is 150 $ ");
            } else if (currentSpeed >= 85 && currentSpeed < 95) {
                System.out.println("Ticket is 320 $ ");
            } else if (currentSpeed >= 95) {
                System.out.println("Ticket is 500 $ ");
            } else {
                System.out.println("There is no problem on your speed");
            }
        } else if (isDriverLicenceAvailable == 'n') {
            if (currentSpeed >= 55 && currentSpeed < 75) {
                System.out.println("Ticket is 300 $ ");
            } else if (currentSpeed >= 75 && currentSpeed < 85) {
                System.out.println("Ticket is 450 $ ");
            } else if (currentSpeed >= 85 && currentSpeed < 95) {
                System.out.println("Ticket is 520 $ ");
            } else if (currentSpeed >= 95) {
                System.out.println("Ticket is 700 $ ");
            } else {
                System.out.println("There is no problem on your speed but you do not have driver license. Ticket is 200$");
            }
        } else {
            System.out.println("Invalid input");
        }


    }
}
