package day04ifstatement;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        /* TASK :
		 * Calculate BMI(VKE) by getting user's height and weight

        INFO :
		BMI = (weight)(kg) /(height*height)(m)
		BMI <=20 skinny
		20<BMI<=25 fit
		25<BMI<=30 fat
		30<BMI ==> obese

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height(cm)");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight(kg)");
        double weight = scanner.nextDouble();

        double bmi = weight / (height / 100 * height / 100);

        if (bmi < 20) {
            System.out.println("Skinny");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("Fit");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Fat");
        } else if (bmi > 30) {
            System.out.println("Obese");
        } else {
            System.out.println();
        }


    }
}
