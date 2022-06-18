package day06nestedifternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Example 1 find the output for y = 8 and y = 4 and y = 5

        //(y>5)?(y<10?2*y:3*y):(y>10?2+y:3+y);



        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        int year = 2004;
        //(Condition)    ?             (Ternary 1)                       :                  (Ternary 2);
        String isLeapYear = (year % 100 == 0) ? (year % 400 == 0 ? "Leap year" : "Not leap year") : (year % 4 == 0 ? "Leap year" : "Not leap year");
        System.out.println(isLeapYear);

         /*
        Type code to check the password
        if it has more than 8 characters, initial should be'i'
        if it has no more than 8 characters, inital should be 'K' (and last character should be '!')

        Solve th e task by using nested ternary
         */
        //length() method returns the number of characters in a String

        String pwd = "izmir538";

        String result = (pwd.length() > 8) ? (pwd.charAt(0) == 'i' ? "Valid password" : "Invalid password") : (pwd.charAt(0) == 'K' ? "Valid password" : "Invalid password");
        System.out.println(result);


    }
}
