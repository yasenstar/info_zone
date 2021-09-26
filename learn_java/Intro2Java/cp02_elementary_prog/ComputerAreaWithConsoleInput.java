// package Intro2Java.cp02_elementary_prog;

import java.util.Scanner; // Scanner is in the java.util package

public class ComputerAreaWithConsoleInput {
    public static void main(String[] args) {
        final double PI = 3.1415926; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // nextByte(), nextShort(), nextInt(), nextLong(),
        // nextFloat(), nextDouble(), next(), nextLine()

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radium: ");
        double radius = input.nextDouble();

        // Computee area
        double area = radius * radius * PI;

        // Display results
        System.out.println("The radius you input is: " + radius + "\nThe area is " + area);
    }
}
