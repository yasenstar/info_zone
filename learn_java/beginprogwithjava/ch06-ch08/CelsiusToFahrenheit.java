import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Please enter the temperature in Celsius: ");
        celsius = keyboard.nextDouble();

        fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println("The temperature in Fahrenheit is " + fahrenheit);

        keyboard.close();
    }
}
