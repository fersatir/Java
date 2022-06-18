package day04ifstatement;
import java.util.Scanner;
public class IfStatement11 {
    public static void main(String[] args) {

        /* TASK :
        Get midterm and final grades from the user.
        User will choose proportion of exams and take the average.
        If it is greater than 50. print " congrats you pass the class"
        If it is less than 50. print " unfortunately you failed the class
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your result of midterm exam");
        int midterm = scanner.nextInt();

        System.out.println("Enter proportion of midterm exam");
        double proportionOfMidTerm = scanner.nextDouble();

        System.out.println("Enter your result of final exam");
        int fnal = scanner.nextInt();

        System.out.println("Enter proportion of final exam ");
        double proportionOfFnal = scanner.nextDouble();

        double average = (midterm * proportionOfMidTerm / 100) + (proportionOfFnal / 100 * fnal);
        System.out.println("average = " + average);


        if (average > 50) {
            System.out.println("congrats you pass the class");
        } else {
            System.out.println("unfortunately you failed the class");
        }


    }
}
