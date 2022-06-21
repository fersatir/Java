package day29interfacemanipulations;

public interface AirCondition extends Vehicle {

    /*
    Interface is not a class, but it is an Interface
    A class should be able to use multiple Interfaces as parent
    In an Interface, most methods are abstract,
    but we can still use some concrete methods that are static and default
    we do not need to use abstract key word for an Interface(for Interface name)
    If we use a variable in an Interface, we need to assign a value
    In abstract class we can have constructors, but in Interface
    we can not have constructors
    Interface can not have concrete methods other than default and static, but abstract class can
    have concrete and abstract methods.
    In Java, when we use final variables, the name of variables should be written in upperCase letters

     */

    String MAKE = "Samsung";

    public abstract void electronicAc();

    public void climateAc();

    void bacteriaKiller();

    void run();

    public default int power() {

        System.out.println("Hybrid engines are increasing their powers");

        return 1000;
    }

    public static String model() {

        System.out.println("The best model..");

        return "The best ...";
    }


}
