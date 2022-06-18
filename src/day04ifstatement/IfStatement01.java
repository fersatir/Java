package day04ifstatement;
import java.util.Scanner;
public class IfStatement01 {
    public static void main(String[] args) {

        /*
        Ask user to enter an integer, then
        print"Positive" on the console if the number is positive
        print "Negative" on the console if the number is negative
        print "Neuter" on the console if the number is zero
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check its sign...");
        int number = scan.nextInt();

        if(number>0){
            System.out.println("Number is positive");
        }
        else if(number<0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is Neuter");
        }

        //Ask user to enter an integer then
        //print "Even" if the integer is even
        //print "Odd" if the integer is odd


        System.out.println("Enter an integer to check if it is even or odd...");
        int num = scan.nextInt();

        //"Even" means divisible by 2, "Odd" means not divisible by 2.For example 6 is even, 5 is odd.
        //In Java, we have "modulus" operator.For modulus operation we use "%".
        //"Modulus" operator gives you the remainder in a divison operation

        //Note: "==" means equals               "!=" means does not equal
        //Note: "!true" means false     "!false" means true      "!!true" means true
        if(num%2 == 0){
            System.out.println("Even");
        }
        else if (num%2 != 0){
            System.out.println("Odd");
        }


        //Ask user to enter a day name then
        //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        //print "Weekend Day" for Saturday and Sunday

        //Note: To compare 2 Strings do not use "==" it returns wrong result mostly


        System.out.println("Enter a day name");
        String dayName = scan.next();
        //Following
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend Day");
        }if(dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }

        //Solve the previous task without repetition
        //Note: In Java, there is OR operator. OR operator is sign "||"


        System.out.println("Enter a day name");
        String dayName1 = scan.next();
        if(dayName1.equals("Monday") || dayName1.equals("Tuesday")|| dayName1.equals("Wednesday") || dayName1.equals("Thursday") || dayName1.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName1.equals("Saturday") || dayName1.equals("Sunday")){
            System.out.println("Weekend Day");
        }

        //If user enters the day names in different cases like mondayor mOnDaY
        //Note: Java created another method to compare 2 Strings, the method will ignore the cases.
        //According to that method monday, MONDAY, mOnDay will be the same

        System.out.println("Enter a day name");
        String dayName2 = scan.next();
        if(dayName2.equalsIgnoreCase("Monday") || dayName2.equalsIgnoreCase("Tuesday")|| dayName2.equalsIgnoreCase("Wednesday") || dayName2.equalsIgnoreCase("Thursday") || dayName2.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");
        }
        if(dayName2.equalsIgnoreCase("Saturday") || dayName2.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend Day");
        }

        // Make the if statement parenthesis shorter

        boolean isWeekday = dayName.equalsIgnoreCase("Monday") ||
                dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday");
        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday");

        if(isWeekday){
            System.out.println("Weekday");
        }
        else if(isWeekendDay){
            System.out.println("Weekendday");
        }

        /*
        What is the difference between “&” and “&&” ?
        40 < 30 & 5 > 2 Both conditions are checked every time; therefore, it is slow.
        40 < 30 && 5 > 2 If the first condition is false then second condition is not checked;
        therefore, it is faster
         */




































    }
}
