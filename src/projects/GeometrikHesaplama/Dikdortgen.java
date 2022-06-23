package projects.GeometrikHesaplama;

public class Dikdortgen extends Sekil {

    public Dikdortgen(double uzunKenar, double kisaKenar ) {

        super(uzunKenar, kisaKenar);
    }
    public Dikdortgen(double kenar){
        super(kenar);
    }

    @Override
    public double alanHesaplama() {
        return uzunKenar*kisaKenar;
    }

    @Override
    public double cevreHesaplama() {
        return 2*(uzunKenar+kisaKenar);
    }

    @Override
    public String toString() {
        return
                "uzunKenar= " + uzunKenar +
                        ", kisaKenar= " + kisaKenar + " dikdortgenin alani " + alanHesaplama() +
                        " dikdortgenin cevresi " + cevreHesaplama()
                ;
    }
}
