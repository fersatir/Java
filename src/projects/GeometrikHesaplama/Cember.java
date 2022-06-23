package projects.GeometrikHesaplama;

public class Cember extends Sekil {

    public Cember(double yaricap,double pi,double etkisiz) {
        super(yaricap,pi,etkisiz);
    }

    @Override
    public double alanHesaplama() {
        return yaricap*yaricap*pi;
    }

    @Override
    public double cevreHesaplama() {
        return 2*pi*yaricap;
    }

    @Override
    public String toString() {
        return "{ yaricap = " + yaricap + " cember alan " + alanHesaplama() + " cember cevre " + cevreHesaplama() +
                '}';
    }


}
