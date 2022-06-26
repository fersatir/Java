package day35generics;

public class G05genericClasses {//non-Generic Main class
    public static void main(String[] args) {
        veriSakla<String> data1=new veriSakla<>("Suat Başaran ama yavaş başaran");//Generic Class'tan String data type obj. create edildi.
        veriSakla<Integer> data2=new veriSakla<>(1453);//Generic Class'tan Integer data type obj. create edildi.
        veriSakla<Double> data3=new veriSakla<>(19.05);//Generic Class'tan Double data type obj. create edildi.

        //veriSakla Generic pojo Class'dan create edilen obj.(data1-2-3) (obj encap->get()) print edildi.
        System.out.println("data1.getData() = " + data1.getData());//Suat Başaran ama yavaş başaran
        System.out.println("data2.getData() = " + data2.getData());//1453
        System.out.println("data3.getData() = " + data3.getData());//19.05
        //veriSakla Generic pojo Class'dan create edilen obj.(data1-2-3) (obj encap->get()) dataPrint non-generic Class'tan
        // call edilen yazdır generic method ile print edildi.
        dataPrint.yazdir(data1.getData());//Suat Başaran ama yavaş başaran
        dataPrint.yazdir(data2.getData());//1453
        dataPrint.yazdir(data3.getData());//19.05

    }
}
class veriSakla <T>{//Generic pojo Class
    private T data;

    public veriSakla(T veri) {//parametreli generic cons.
        this.data = veri;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
class dataPrint{//non-Generic class
    public static <T> void yazdir(T veri){//parametreli generic method create edildi.
        System.out.println("veri = " + veri);
    }
}
