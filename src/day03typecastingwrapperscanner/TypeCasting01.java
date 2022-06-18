package day03typecastingwrapperscanner;

import java.util.Scanner;

public class TypeCasting01 {
    public static void main(String[] args) {

        long g = 142536;
        short c = (short)g;
        System.out.println(c);


        double d = 1.2;
        short s = (short)d;
        System.out.println(s);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a day");
        String dayName = scan.next();

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























    }
}
