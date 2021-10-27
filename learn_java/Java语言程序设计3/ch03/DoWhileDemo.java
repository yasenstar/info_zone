import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String args[]) {
        double sum = 0, avg = 0;
        int n = 0;
        double number;
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.println("Please input a number (0 means end): ");
            number = keyboard.nextDouble();
            if (number != 0) {
                sum += number;
                n++;
            }
        } while (number != 0);

        avg = sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        
        keyboard.close();
    }
}
