package day07stringmanipulations;

public class Sm02 {
    public static void main(String[] args) {

        String str = "Ali Can";

        String newStr = str.concat("!...").concat("Wow"); // You can do concatenation by "+" sign but using concat() is better

        System.out.println(newStr); // Ali Can!

        boolean isLast = str.endsWith("n");
        System.out.println(isLast);

        boolean isFirst = str.startsWith("A");
        System.out.println(isFirst);

        //str.startsWith("C",4) means skip 4 characters then check if the remaining String is starting with "C"
        boolean isTheForth = str.startsWith("C", 4);
        System.out.println(isTheForth);

        /*
        11) concat()
        12)endsWith()
        13)startsWith(with 1 parameter)
        14)startsWith(with 2 parameter)
         */


    }
}
