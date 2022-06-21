package day34enum.Exp02;

public class User {

    String name;
    int role=0; // role=0->Admin, 1->customer
    int status=0;// 0->active, 1->login, 2->inactive

    Role yetkisi;//Role enumDan yetkisi adında bir field create edildi
    Status durum;//Status enumDan durum adında bir field create edildi
}
