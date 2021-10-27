import java.util.Scanner;

public class TempConvertor {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a temperature in Fahrenheit scale: ");
        double t = keyboard.nextDouble();
        System.out.println("The temperature in Celsius scale is " + (5.0 / 9.0 * (t - 32.0)));
        keyboard.close();
    }
}
