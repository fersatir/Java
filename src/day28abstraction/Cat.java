package day28abstraction;

public class Cat extends Animal {

    String sound;
    String name;

    public Cat(String sound, String name) {
        this.sound = sound;
        this.name = name;
    }

    public Cat() {

    }

    @Override
    public void animalSound() {
        System.out.println("animal sound is " + sound);
    }

    @Override
    public void animalNames() {
        System.out.println("animal name is " + name);


    }
}
