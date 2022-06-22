package objectmanipulations;

public class Person {

    private String name;
    private String lastname;
    private int id;
    private int age;
    private int salary;


    public Person() {

    }

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static void main(String[] args) {

        Person person = new Person("Jim", "Carey");

        System.out.println(person.name);
        System.out.println(person.lastname);


    }

    public static String getEmail(String name, String lastname) {

        return (name.replace(" ", "") + lastname + "@gmail.com").toLowerCase();


    }


}
