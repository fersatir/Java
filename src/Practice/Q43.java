package Practice;

public class Q43 {
    // Stringi ters cevirmek icin bir Java Programi yazin
    public static void main(String[] args) {

        String str = "All is well";
        tersArray(str);

    }

    private static void tersArray(String str) {

        char[] arr = str.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");

        }

    }
}
