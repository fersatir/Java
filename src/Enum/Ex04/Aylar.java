package Enum.Ex04;

public enum Aylar {
   // OCAK(31,"kış","Ali bey"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int days;
  //Aylar (int gunMiktarı,String mevsim,String birtDay){//const parametresi isteniildgi kadar cretae edileblir
  Aylar (int gunMiktarı){// parametreli cons enum create edildi.
        days=gunMiktarı;
    }
    void getGunMiktarı(){//enum method cretae edildi
        System.out.println("gun miktarı : " +days);
    }
}
