package projects.GeometrikHesaplama;

public class Kare extends Dikdortgen {

    public Kare(double kenar) {
        super(kenar);

    }

    @Override
    public double alanHesaplama() {
        return kenar*kenar;
    }

    @Override
    public double cevreHesaplama() {
        return 4*kenar;
    }

    @Override
    public String toString() {
        return "{" +
                "kenar= " + kenar + " alan " + alanHesaplama() + " cevre " + cevreHesaplama() +
                '}';
    }
}
