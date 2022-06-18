package day04ifstatement;
import java.util.Scanner;
public class IfStatement03 {
    public static void main(String[] args) {

        /*TASK:
        Get 3 positive number from use
        Check the triangle formation status of these three numbers
        If it can be a triangle, also check for an equilateral triangle

        INFO:
        condition of being triangle:
         a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c   equilateral triangle
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 positive integer");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 ==num2 && num2 ==num3){
            System.out.println("It is a equilateral triangle");
        }
        else if(num1+num2>num3 && num3> num1-num2 && num1+num3>num2 && num2>num1-num3 && num2+num3>num1 && num1>num2-num3 ){
            System.out.println("It is a triangle");
        } else{
            System.out.println("It is not a triangle");
        }




    }
}
