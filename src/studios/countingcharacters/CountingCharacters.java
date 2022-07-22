package studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            if (Character.isLetter(charactersInString[i])) {
                if (!charCounts.containsKey(charactersInString[i])) {
                    charCounts.put(charactersInString[i], 1);
                } else {
                    charCounts.put(charactersInString[i], charCounts.get(charactersInString[i]) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> character : charCounts.entrySet()) {
            System.out.printf(character.getKey() + ": " + character.getValue() + '\n');
        }

    }
}
