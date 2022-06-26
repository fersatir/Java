package day35generics;

public class G07GenericInterface {//Main Class
    public static void main(String[] args) {

        usAlanClass<Float> floatUs = new usAlanClass<>();
        System.out.println("floatUs.usAl(4f,3f) = " + floatUs.usAl(4f, 3f));//64

        usAlanClass<Double> doubleUs = new usAlanClass<>();
        System.out.println("doubleUs.usAl(2.3,3.4) = " + doubleUs.usAl(2.3, 3.4));// 16.977535312787566

        usAlanClass<Integer> intUs = new usAlanClass<>();
        System.out.println("intUs.usAl(3,5) = " + intUs.usAl(3, 5));//243
    }

}

interface  MathIslem <T extends Number>{//generic interface data type Number olarak bounded of  parameter create edildi.
    double usAl(T t,T u);//abs  doble parametreli generic meth.
}

class usAlanClass <T extends  Number> implements MathIslem<T>{//Generic interface implement edilen generic class create edildi


    @Override
    public double usAl(T t , T u) {//pow() methodu parametre olarak double data type kullandıgı için
        // t.doubleValue(),u.doubleValue() ile T u , T t parametrelerin
        //double data type cast edildi
        return Math.pow( t.doubleValue(),u.doubleValue());
    }
}
