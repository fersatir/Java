package day07stringmanipulations;

import java.util.Scanner;

public class Sm07 {
    public static void main(String[] args) {

        // Get a sentence and a letter from use. Check if the letter is in sentence or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.next().toLowerCase();

        // 1.Way
        System.out.println("Enter a letter");
        String letter = String.valueOf(scanner.next().toLowerCase().charAt(0));


        if (word.indexOf(letter) >= 0) {
            System.out.println("Letter is in the sentence");
        } else {
            System.out.println("Letter is not in the sentence");
        }

        //2. Way

        if (word.contains(letter)) {
            System.out.println("Letter is in the sentence");
        } else {
            System.out.println("Letter is not in the sentence");
        }

        System.out.println("");

        //Get a sentence and a word from use. Check if the word is in sentence or not
        //the entered word is not used in the sentence
        //the entered word is used once in the sentence

        String i = scanner.nextLine();
        System.out.println("enter a sentence");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.println("Enter a word");
        String word1 = scanner.next();

        int firstused = sentence.indexOf(word1);
        int secondused = sentence.indexOf(word1, firstused + 1);

        if (firstused == -1) {
            System.out.println("Word is not used  in sentence");
        } else if (secondused == -1) {
            System.out.println("Word is used once in sentence");
        } else {
            System.out.println("Word is used more than once in sentence");
        }


    }
}
