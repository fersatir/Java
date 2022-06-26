package day35generics;

public class MultipleClass {//Main  Class

    /*
    Genelde tek bir java dosyası icersinde tek bir java class create edilir.
    Ancak her ne kadae tavsiye edilmese de (non-atomic) bir java dosyasına birden fazla java class (non-inner)
     create edilebilir. Byu class'lardan bir tanesini ACM public, diğer class'ların ACM public olamaz.
     */
}
class falan{//OCA Trick:aynı dosya içinde birden fazla create edilen non-inner class'ları jvm commpile ederken
    //sadece main class public olarak tanımlar.Diğer class'lar dan herhnagi biri de public olurssa CTE verir

}
class filan{

}

