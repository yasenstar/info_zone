import java.util.Scanneer;
import java.util.Scanner;
public class CountDigitalSum {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input one integer (0~1000): ");
        int a = keyboard.nextInt();
        int b = a / 100 + ((a - a / 100 * 100) / 10 + (a - a / 10 * 10));
        System.out.println("All digit summary is " + b);
        keyboard.close();
    }
}
