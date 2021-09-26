// package Intro2Java.cp02_elementary_prog;

import java.util.Scanner; // Scanner is in the java.util package

public class ComputerAreaWithConsoleInputNew {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // nextByte(), nextShort(), nextInt(), nextLong(),
        // nextFloat(), nextDouble(), next(), nextLine()

        System.out.println("What kind of area you want to calc? Choose from below:");
        System.out.println("Circle (C), Triangle (T) or Rectangle (R)");

        String choice = input.next();
        Double area;

        switch (choice) {
            case "C": case "c": {
                // Prompt the user to enter a radius
                System.out.println("Enter a number for radium: ");
                double radius = input.nextDouble();

                // Computee area
                area = radius * radius * 3.1415926;

                // Display results
                System.out.println("The radius you input is: " + radius + "\nThe area is " + area);

                break;
            }
            case "T": case "t": {
                System.out.println("Enter a number as bottom length: ");
                double bottomLength = input.nextDouble();
                System.out.println("Enter a number as height: ");
                Double height = input.nextDouble();

                area = bottomLength * height / 2;

                System.out.println("The bottom length is: " + bottomLength + ", height is: " + height + ", and the area is " + area);

                break;
            }
            case "R": case "r": {
                System.out.println("Enter a number as bottom length: ");
                double length = input.nextDouble();
                System.out.println("Enter a number as height: ");
                Double height = input.nextDouble();

                area = length * height;

                System.out.println("The length is: " + length + ", height is: " + height + ", and the area is " + area);

                break;

            }
            default:
                System.out.println("You choose wrong :-(");
        }
    }
}
