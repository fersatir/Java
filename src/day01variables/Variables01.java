package day01variables;

public class Variables01 {
    public static void main(String[] args) {

    String name; //This is declaration
    boolean isSheStudent;
    int score;
    double average;

    name = "John"; // This is assignment
    isSheStudent = true;
    score = 85;
    average = 78.3;

    int level = 1;

    level = 2;
    level =3;
    System.out.println(level); // After you do declaration, you can assign it many times

        // I am creating integer variable whose name is age

        int age = 12;

        // I am creating a char variable whose name is initial
        char initial = 'A';

        // Let's print the values of age and initial variables on th console


        System.out.println(age); // 12
        System.out.println(initial);

        // create 3 integer variables, assign values to them, print them on the console one by one
        // a) Print them on the console
        // b) Print the sum of the console one by one
        // c) Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 39'

        int i01 = 15, i02 = 9, i03 = 6;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        System.out.println("The sum is " +(i01+i02+i03));

        // We need concatenation operation to add string and integer.
        System.out.println("The sum is: "+ i01 + i02 + i03); // "The sum is: "+121314
        System.out.println("The sum is: "+( i01 + i02 + i03));

        int sum = i01+i02+i03;
        System.out.println("The sum is " + sum); // This is better than previous one.

        //Create 2 integer variables and print their multiplication on the console with a label

        int x = 5, y =3;

        System.out.println("The multiplication is : " + (x*y));
        System.out.println("The multiplication is : " + x*y);

        /*
            Order of Operations in Math
            1) Do the operations inside the parenthesis first
            2) Do multiplication and division
            3) Do addition and substraction
        */


        String a = "water";
        String b = "Kool-aid";
        String temp = "null";

        System.out.println( a+ " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);



    }
}
