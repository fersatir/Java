package day28abstraction2;

public class CalculatorRunner {

    public static void main(String[] args) {

        String name = "Kerem";
        System.out.println(name.indexOf("e"));


        Calculator calculator = new Profit();

        //Polymorphism, Inheritanca, Abstraction
        int num = 21;
        int num2 = 12;


        Calculator calculator1 = new Loss();

        System.out.println(calculator.addition(12, 23));
        System.out.println(calculator.multiplication(num, num2));

        System.out.println(calculator1.addition(num, num2));
        System.out.println(calculator1.division(num, num2));


    }


}
