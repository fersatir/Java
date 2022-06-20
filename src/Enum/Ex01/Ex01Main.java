package Enum.Ex01;

public class Ex01Main {
    public static void main(String[] args) {
        //verilen ay nuarasına göre ayın kaç gün oldugunu print ediniz.

        Aylar ay=Aylar.NISAN;//enum yapıdan bir field create edildi
        //int ay=6;
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay){
            case OCAK:
                System.out.println("ocak");
                break;
            case SUBAT:
                System.out.println("subat");
                break;
            case MART:
                System.out.println("mart");
                break;
            case NISAN:
                System.out.println("nisan güzel insan faruk teşrif ayı...");
                break;
            case MAYIS:
                System.out.println("mayıs");
                break;
            case HAZIRAN:
                System.out.println("haziran");
                break;
            case TEMMUZ:
                System.out.println("temmuz");
                break;
            case AGUSTOS:
                System.out.println("agstos");
                break;
            case EYLUL:
                System.out.println("eyll");
                break;

        }
    }
}
