package day07stringmanipulations;

import java.util.Scanner;

public class Sm08 {
    public static void main(String[] args) {

        // Get a sentence and a letter from use. Check if the letter is in sentence or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.next().toLowerCase();

        System.out.println("Enter a letter");
        String letter = scanner.next().toLowerCase().substring(0, 1);

        if (word.lastIndexOf(letter) != -1) {
            System.out.println("Letter is in the sentence");
        } else {
            System.out.println("Letter is not in the sentence");
        }

        String i = scanner.nextLine();

        //Get a sentence and a word from use. Check if the word is in sentence or not
        //the entered word is not used in the sentence
        //the entered word is used once in the sentence

        System.out.println("enter a sentence");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.println("Enter a word");
        String word1 = scanner.next().toLowerCase();

        int firstused = sentence.indexOf(word1);
        int secondused = sentence.lastIndexOf(word1);

        if (firstused == -1) {
            System.out.println("Word is not used  in sentence");
        } else if (secondused == firstused) {
            System.out.println("Word is used once in sentence");
        } else {
            System.out.println("Word is used more than once in sentence");
        }

    }
}
