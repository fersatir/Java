package objectmanipulations;

import java.util.ArrayList;
import java.util.List;

import static day13statickeywordvariabletypes.Static01.sCounter;

public class MainRunner4 {
    /*
    Ask user to type 3 names and 3 lastnames
    Then concatenate the names with lastnames and add also "@gmail.com"
    Finally print them on the console
     */
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Fuat", "Koca");
        Person person2 = new Person("Cagri", "Selcuk");
        Person person3 = new Person("Cigdem", "Bakar");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size());

        // for(Person person : people){
        //     System.out.println(person.getName());
        //     System.out.println(person.getLastname());
        // }

//        for(int i = 0; i < people.size(); i++){
//
//            System.out.println(people.get(i).getName());
//            System.out.println(people.get(i).getLastname());
//        }

        List<String> emails = generateEmails(people);
        System.out.println("First email :" + emails.get(0));
        System.out.println("Second email :" + emails.get(1));
        System.out.println("Third email :" + emails.get(2));


    }//main method


    public static List<String> generateEmails(List<Person> people) {

        List<String> emails = new ArrayList<>();

        //System.out.println("email1 :" + people.get(0).getName()+ people.get(0).getLastname() +"@gmail.com");
        //System.out.println("email2 :" + people.get(1).getName()+ people.get(1).getLastname() +"@gmail.com");
        //System.out.println("email3 :" + people.get(2).getName()+ people.get(2).getLastname() +"@gmail.com");

        for (Person eachPerson : people) {

            emails.add((eachPerson.getName() + eachPerson.getLastname() + "@gmail.com").toLowerCase());
        }


        return emails;

    }


}
