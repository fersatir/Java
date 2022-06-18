package day03typecastingwrapperscanner;
import java.util.Scanner;
public class Scanner01 {
    public static void main(String[] args) {

        //Scanner Class is used to get data from user in Java

        //How will we get data from user?
        //1. step
        Scanner scan = new Scanner(System.in);

        //2. step
        System.out.println("Enter your age");

        // 3. step
        System.out.println("The user's age is");

        System.out.println("Enter your fullname");

        String fullName = scan.nextLine(); // To get String data from user use nextLine() method

        System.out.println("The user's name is " + fullName );

        System.out.println("Enter the price of shirt");
        float priceOfShirt = scan.nextFloat();

        System.out.println("The price is " + priceOfShirt);

        System.out.println("Enter the price of skirt");
        Double skirt = scan.nextDouble();

        System.out.println("The price is " + skirt);


        // Take user's name and print first letter
        System.out.println("Please enter your name");
        char firstLetter = scan.next().charAt(0);
        System.out.println(firstLetter);

        // Type a code for calculating perimeter and area of a rectangle.
        // Take width and length of rectangle from user


        System.out.println("Enter the width and the length of a rectangle to calculate area");
        int width = scan.nextInt();
        int length = scan.nextInt();

        System.out.println("Area of rectangle: " + width * length);
        System.out.println("Perimeter of rectangle: " + 2*( width + length ));

        /*
        Type a program which calculates the volume of a rectangular prism whose length, width, and height are entered by user.
		Hint: Volume of a rectangular prism is width x length x height
         */

        System.out.println("Enter the length...");
        double length1 = scan.nextDouble();
        System.out.println("Enter the width...");
        double width1 = scan.nextDouble();
        System.out.println("Enter the height...");
        double height1 = scan.nextDouble();
        System.out.println("The volume is " + length1*width1*height1);

        /*
        Get the firstname, middle name, lastname, SSN from user then print them like the following

	 	Ali Mert Can
	 	123456789
         */


        System.out.println("Enter your first name...");
        String firstName = scan.next(); // nextLine() takes all the String, next() takes just the first word

        System.out.println("Enter your middle name...");
        String middleName = scan.next();

        System.out.println("Enter your last name...");
        String lastName = scan.next();

        System.out.println("Enter your SSN...");
        int ssn = scan.nextInt();

        System.out.println(firstName+ " "+middleName+" "+ lastName );
        System.out.println(ssn);























































    }
}
