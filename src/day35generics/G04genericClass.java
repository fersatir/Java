package day35generics;

public class G04genericClass <T>{//T: type parametrik pojo class declaration
    private T ebıkGabık;

    public G04genericClass(T ebıkGabık) {//parametreli generic cons.
        this.ebıkGabık = ebıkGabık;
    }
    public G04genericClass() {//parametresiz generic cons.

    }

    public T getEbıkGabık() {
        return ebıkGabık;
    }

    public void setEbıkGabık(T ebıkGabık) {
        this.ebıkGabık = ebıkGabık;
    }


    public static void main(String[] args) {


        G04genericClass<Integer> intEbikGabık=new G04genericClass<>(1453);
        System.out.println("intEbikGabık.getEbıkGabık() = " + intEbikGabık.getEbıkGabık());//1453

        G04genericClass<Double> dbEbikGabık=new G04genericClass<>(19.91);
        System.out.println("dbEbikGabık.getEbıkGabık() = " + dbEbikGabık.getEbıkGabık());//19.91

        G04genericClass<String> strtEbikGabık=new G04genericClass<>();
        strtEbikGabık.setEbıkGabık("selam guzel insan MİRAC bey :)");
        System.out.println("strtEbikGabık.getEbıkGabık() = " + strtEbikGabık.getEbıkGabık());

        // G04genericClass<String> hata=new G04genericClass<>(1453);//cte
    }
}
