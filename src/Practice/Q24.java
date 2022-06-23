package Practice;

public class Q24 {
    public static void main(String[] args) {
        String str = "aaabbccd";
        String[] str1 = str.split("");

        int j = 0;

        for (int i = 0; i < str1.length; i++) {
            int count = 1;

            if (j >= str1.length) {
                break;
            } else {

                for (j = i + 1; j < str1.length; j++) {

                    if (str1[i].equals(str1[j])) {
                        count++;
                    } else {
                        i = j - 1;
                        break;
                    }
                }

            }
            System.out.print(count + str1[i]);
        }


    }


}
