package day28abstraction;

public class AnimalRunner {

    public static void main(String[] args) {
        /*
        create 2 animal one Cat, one Sheep and make their sounds as necessary
        type their names then call them from your objects
         */

        Animal animal1 = new Cat("Cat meows", "Tom");
        animal1.animalSound();
        animal1.animalNames();

        Animal animal2 = new Sheep("sheep bleats as mee / baa", "ilkhan");
        animal2.animalSound();
        animal2.animalNames();

        // Difference between an abstract class and a regular class?
        //Abstract class can not generate any objects vc concrete class can have objects
        //Abstract class can have abstract methods and non-abstract methods
        // vs Concrete class can have only concrete methods


    }


}
