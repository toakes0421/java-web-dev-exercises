package exercises.chp3.arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintFiveLetterStrings {
    public static void main(String[] args) {
        String[] sentenceString = ("I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.").split(" ");
        ArrayList<String> sentenceArrayList = new ArrayList<>(
                Arrays.asList(sentenceString));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of word to search for: ");
        int length = input.nextInt();
        input.close();

        System.out.println("Here are the words of length " + length + ":");
        for (String word : sentenceArrayList) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
