package day25overriding;

public class Mammal extends Animal{

    public void feedBabyWithMilk(){
        System.out.println("Mammal feed their baby with milk");
    }

    @Override
    public Animal myMethod() {
        return new Mammal();
    }










}
