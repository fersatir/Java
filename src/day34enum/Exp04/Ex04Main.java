package day34enum.Exp04;

public class Ex04Main {
    public static void main(String[] args) {
        Aylar ay=Aylar.SUBAT;
        ay.getGunMiktarı();//enum method call edildi
        System.out.println("ay.days = " + ay.days);
        System.out.println("ay = " + ay);
      // switch (ay){
      //     case OCAK:
      //         System.out.println("gun sayısı 31");
      //         break;
      //     case SUBAT:
      //         System.out.println("gun sayısı 31");
      //         break;
      // }
    }
}
