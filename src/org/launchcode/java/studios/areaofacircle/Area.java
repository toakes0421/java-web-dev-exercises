package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = input.nextFloat();
        input.close();
        double area = Circle.getArea(radius);
        System.out.printf("The area of a circle with radius %f is %f.",radius, area);
    }
}
