package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        float length = input.nextFloat();

        System.out.println("Enter width of rectangle:");
        float width = input.nextFloat();
        input.close();

        double area = length * width;
        System.out.println("The are of your rectanlge is " + area);
    }
}
