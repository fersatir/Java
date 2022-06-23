package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Q10 {
    /*
	  Count the words in a String one by one
	  String is "Ali came to school and Ayse came to school"
	  Ali=1, came=2, to=2, school=2, and=1, Ayse=1
	 */
    public static void main(String[] args) {
        String str = "Ali came to school, and Ayse came to school.";
        str = str.replaceAll("\\p{P}", "");
        System.out.println(str);
        String words[] = str.split(" ");
        System.out.println(Arrays.toString(words));

        //1.Way
        harfRakamBulma(words);

        //2.Way
        List<String> wordsList = new ArrayList<String>();
        for (String w : words) {
            wordsList.add(w.replaceAll("\\W", ""));
        }
        System.out.println(wordsList);// [Ali, came, to, school, and, Ayse, came, to, school]

        Map<String, Integer> numOfWords = new HashMap<>();// {                                   }

        for (String w : wordsList) {

            if (numOfWords.containsKey(w)) {

                numOfWords.put(w, numOfWords.get(w) + 1);

            } else {

                numOfWords.put(w, 1);
            }
        }
        System.out.println(numOfWords);

        //3.Way
        String str1 = "Ali came to school, and Ayse came to school.";
        str1 = str1.replaceAll("\\p{P}", "");
        String[] arr = str1.split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
           int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;

                    if (j == arr.length - 1) {
                        i = j;
                    }

                } else {
                    i = j - 1;
                    break;
                }
            }
            System.out.println(arr[i] + " = " + count);

        }


    }

    public static void harfRakamBulma(String words[]) {

        Arrays.stream(words)
                .collect(Collectors.groupingBy(t -> t, HashMap::new, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " = " + v));

    }

}

