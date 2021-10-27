import java.util.Scanner;

public class FunctionDemo {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input one float number: ");
        double d = keyboard.nextDouble();
        System.out.println("Integer par is " + (int)d);
        System.out.println("Floating part is " + (d - (int)d));
        keyboard.close();
    }
}