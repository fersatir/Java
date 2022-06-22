package objectmanipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {
     /*
    Ask user to type 2 names and 2 lastnames
    String name,name2: String lastname, lastname2
    List<String>names; List<String> lastnames
    Then concatenate them to create emails
    use @gmail.com at the end
     */


    public static void main(String[] args) {
        List<String> names = new ArrayList();

        List<String> lastnames = new ArrayList();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type 2 names");
        names.add(scanner.nextLine());
        names.add(scanner.nextLine());

        System.out.println("Please type 2 lastnames");
        lastnames.add(scanner.nextLine());
        lastnames.add(scanner.nextLine());

        System.out.println("user names = " + names);
        System.out.println("user lastnames = " + lastnames);

        System.out.println("email  ids: " + generateEmail(names, lastnames));

    }//main method


    public static List<String> generateEmail(List<String> names, List<String> lastnames) {

        List<String> emails = new ArrayList<>();

        // emails.add(names.get(0) + lastnames.get(0)+"@gmail.com");
        // emails.add(names.get(1) + lastnames.get(1)+"@gmail.com");

        for (int i = 0; i < names.size(); i++) {

            emails.add((names.get(i) + lastnames.get(i) + "@gmail.com").toLowerCase());
        }

        return emails;

    }


}
