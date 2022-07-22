package exercises.chp3.arraypractice;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String line = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] lineArray = line.split("\\. ");
        System.out.println(Arrays.toString(lineArray));
    }
}
