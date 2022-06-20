package Enum.Ex02;

public class Ex02Main {

    public static void main(String[] args) {
/*
        Önceden belli olan sabit verilerin atanmasındaki anlama zorluğu yerine bu değerlerin karşılıkları ENUM ile
        tanımlanarak , atama değeri için kullanılrlar. Bu durum yazma ve anlama kolaylığı sağlar.
        Enum class değildir. new key word kullanilmadan veri tanımlanır.
       Enum değerleri değişken değildir static veriable gibi hafızada yer açması gerekmiyoronun için direk kullanılıyor.
       dynamic değil static bir yapıdır
 */
        User kullanıcı1=new User();
        kullanıcı1.name="faruk bey";
       // kullanıcı1.role=0;
       // kullanıcı1.status=1;
        kullanıcı1.yetkisi=Role.ADMIN;
        kullanıcı1.durum=Status.ACTIVE;

        if (kullanıcı1.yetkisi==Role.ADMIN){
            System.out.println("silme yetkiniz var");
        }else System.out.println("silme yetkiniz yok");

        User kullanıcı2=new User();
        kullanıcı1.name="altın kalpli yahya  bey";
        // kullanıcı1.role=0;
        // kullanıcı1.status=1;
        kullanıcı2.yetkisi=Role.ADMIN;
        kullanıcı1.durum=Status.LOGIN;
        if (kullanıcı2.yetkisi==Role.CUSTOMER){
            System.out.println("altın kalpli insan admin olamadı maalesef");
        }else System.out.println("selam");
    }
}
