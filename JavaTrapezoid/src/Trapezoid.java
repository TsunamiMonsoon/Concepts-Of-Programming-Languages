// Created by @Heather Willis on 1/17/2021

import java.util.Scanner;

public class Trapezoid {
    public static Scanner scanner;

    public static void main(String[] args) {
        double base1, base2, height, area; // defining the variables
        scanner = new Scanner(System.in); //setting up the scanner

        System.out.println("Enter number for the first base of the trapezoid.");
        base1 = scanner.nextDouble(); // grabbing the first num
        System.out.println("Enter number for the second base of the trapezoid.");
        base2 = scanner.nextDouble(); // grabbing the second num
        System.out.println("Enter the height of the trapezoid.");
        height = scanner.nextDouble(); // grabbing the third num

        area = .5 * (base1 + base2) * height; // trapezoid formula

        System.out.println("Area of the trapezoid is: " + area); // print the area of the trapezoid
    }
}
