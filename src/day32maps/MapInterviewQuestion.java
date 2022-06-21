package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapInterviewQuestion {
    public static void main(String[] args) {
        /*
        How to count the number of occurences of the words in a sentence
        For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                    Java=3 is=1 easy=1 Type1 ... learn=2

                    get rid of punctuation
                    split the words into array
         */

        String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String w : words) {

            Integer numOfOccurrences = result.get(w);

            if (numOfOccurrences == null) {
                result.put(w, 1);
            } else {
                result.put(w, numOfOccurrences + 1);
            }
        }

        System.out.println(result);


    }
}
