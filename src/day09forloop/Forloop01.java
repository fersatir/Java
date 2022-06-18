package day09forloop;

public class Forloop01 {
    public static void main(String[] args) {

        //1.example: Type code to print 5 times "Hello!" on the console.
        //1 Way: Not recommend a)Repetition b) For larger numbers impossible to do

        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");
        System.out.println("Hello!");

        //2. Way: For repeated actions Java created a structure which is loops
        //       There are 4 different loop structure  in Java a)for-loop b)while-loop c)do-while-loop d)for-each-loop

        System.out.println("===============");
        //for-loop

        for (int i = 1; i < 6; i++) {
            System.out.println("Hello!");
        }

        //2.Example: Type all integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i = 11; i < 44; i++) {
            System.out.print(i + " ");
        }
        System.out.println("===============");

        //3.Example: Type even integers from 11 to 44 in the same line with a space between consecutive integers

        for (int i = 11; i < 44; i++) {
            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println("===============");

        //4.Example: Type odd integers from 68 to 13 in the same line with a space between consecutive integers

        for (int i = 68; i > 13; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("===============");
        //5.Example: Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutive integers

        for (int i = 120; i > 11; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println("=============="); //120 108 96 84 72 60 48 36 24 12


    }

}