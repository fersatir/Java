package projects.GeometrikHesaplama;

public class Sekil {

    double yaricap;
    double uzunKenar;
    double kisaKenar;
     double pi = 3.14;
    double kenar;
    double etkisiz =1;

    public Sekil() {

    }

    public Sekil(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public Sekil(double kenar) {
        this.kenar = kenar;
    }

    public Sekil(double yaricap, double pi, double etkisiz) {
        this.yaricap = yaricap;
        this.etkisiz=etkisiz;
        this.pi = pi;

    }

    public double alanHesaplama(){
        return 0;
  }

    public double cevreHesaplama(){
        return 0;
    }





}
