package day28abstraction2;

public class Loss extends Calculator {


    @Override
    public int addition(int num1, int num2) {
        return -1;
    }

    @Override
    public int multiplication(int num1, int num2) {
        return -1;
    }

    @Override
    public int substraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int division(int num1, int num2) {
        return num1 / num2;
    }
}
