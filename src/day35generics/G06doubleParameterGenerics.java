package day35generics;

public class G06doubleParameterGenerics {
    public static void main(String[] args) {
        EbikGabık<Integer,String> obj1=new EbikGabık<>(101,"Ahmet Güzel");//generic class'tan Integer ,String data type obj. create edildi.
        EbikGabık<Float,String> obj4=new EbikGabık<>(102f,"Mirac bey");//generic class'tan Integer ,String data type obj. create edildi.
        // EbikGabık<String ,String > obj2=new EbikGabık<>("102","Suat Basaran");//generic class'tan String ,String data type obj. create edildi.
        // EbikGabık<Boolean,String> obj3=new EbikGabık<>(true,"Ali Keskin");//generic class'tan Double ,String data type obj. create edildi.

        System.out.println("obj1.getAnahtar()+\" \"+obj1.getDeger() = " + obj1.getAnahtar() + " " + obj1.getDeger());
        System.out.println("obj4.getAnahtar()+\" \"+obj4.getDeger() = " + obj4.getAnahtar() + " " + obj4.getDeger());
    }
}

class EbikGabık <K extends Number, V extends  String>{//double parameter generic class->data type sınırlandırılmıştıt
    //class EbikGabık <K, V>{//double parameter generic class
    // K : key
    // V : value  ->convention named
    //generic Class'larda parametre data type sınırlandırılırken istene data type extends edilir.
    //King of TRİCKKK :Generics yapılarda data type esnektir. bu işleme PARAMETER BOUNDING denir.
    private K anahtar;
    private V deger;

    public EbikGabık(K anahtar, V deger) {//double parameter generic cons->telescopic cons.
        this.anahtar = anahtar;
        this.deger = deger;
    }

    public K getAnahtar() {
        return anahtar;
    }

    public void setAnahtar(K anahtar) {
        this.anahtar = anahtar;
    }

    public V getDeger() {
        return deger;
    }

    public void setDeger(V deger) {
        this.deger = deger;
    }
}
