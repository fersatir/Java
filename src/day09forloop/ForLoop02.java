package day09forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        //1.Example: Put * between 2 consecutive and to the end in a String.

        String s = "Java";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "*");
        }
        System.out.println("");

        //2.Example: Type code to print unique characters in a String. Hello ==> Heo

        String t = "Hello";

        for (int i = 0; i < t.length(); i++) {
            if (t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))) {
                System.out.print(t.charAt(i));
            }
        }
        System.out.println("");

        //3.Example: Type code to print a String in reverse after removing spaces."Ali Can" ==> "naCilA"

        String u = "Ali Can";
        String a = u.replace(" ", "");

        for (int i = a.length() - 1; i > -1; i--) {
            System.out.print(a.charAt(i));
        }


    }
}
