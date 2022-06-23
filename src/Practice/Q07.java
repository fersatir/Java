package Practice;

import java.util.Scanner;

public class Q07 {/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number if it is armstrong number or not");
        String strNum = scanner.next();

        sumOfCubes(strNum);

    }

    private static void sumOfCubes(String strNum) {

       String num [] =  strNum.split("");

        int sum = 0;

        for(int i = 0; i < num.length; i++){

            sum += Math.pow(Integer.valueOf(num[i]),num.length);

        }

        if(sum == Integer.valueOf(strNum)){

            System.out.println("Number is armstrong ");
        }else{
            System.out.println("Number is not armstrong");
        }


    }
}
