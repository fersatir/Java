package Practice;

public class Q73 {
    public static void main(String[] args) {
       /*
       Interview sorusu...
       Verilen bir metindeki harflerin frekansini (tekrar sayisi) bolup yazdiran bir METHOD yaziniz

       Test data:
       Input = AAABBCDD
       Output = A3B2C1D2

        */

    String str = "wwwbbbw";

    frekans(str);


}

    private static void frekans(String str) {


        String output = "";

        for (int i = 0; i < str.length(); i++) {      //AAABBCDD
            int sayac = 0;
            for (int j = i; j < str.length(); j++) {

                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {

                    sayac++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += sayac + str.substring(i, i + 1);
            }//else sayac = 0;
        }
        System.out.println(output);


    }
}
