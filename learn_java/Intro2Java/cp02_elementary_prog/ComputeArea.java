// package Intro2Java.cp02_elementary_prog;

public class ComputeArea {
    public static void main(String[] arguments) {
        // define variables
        double radius, area;

        // read in radius
        radius = 20.0;

        // compute area

        area = 3.14159 * radius * radius;

        // display the area result

        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
