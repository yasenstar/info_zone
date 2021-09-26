//package Intro2Java.cp02_elementary_prog;

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter 4 numbers
        System.out.println("Please enter four numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();

        // Compute the average
        // Display results
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " " + number4 + " is "
                + ((number1 + number2 + number3 + number4) / 4));
    }
}
