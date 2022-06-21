package day28abstraction;

public class CarRunner {
    public static void main(String[] args) {
        //reference   object
        Car car = new Toyota();

        //Inheritance
        //Abstraction
        //Poly morphism
        //When we create an abstract class, we can not create an object from Abstract class,
        //but we use abstract class as reference type

        car.make(); // honda
        car.model(); // Camry
        car.year(); // 2022

        Car car2 = new Honda();

        car2.make();
        car2.model();
        car2.year();


    }


}
