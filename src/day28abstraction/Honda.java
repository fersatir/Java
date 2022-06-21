package day28abstraction;

public class Honda extends Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2022;


    @Override
    public void make() {
        System.out.println("My car is " + make);
    }

    @Override
    public void model() {
        System.out.println("my car is a (n) " + model + " model");
    }

    @Override
    public void year() {
        System.out.println("my car year is " + year);
    }
}
