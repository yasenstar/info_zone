import java.util.Scanner;

public class TextCalc {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        double num1, num2;
        char oper;

        System.out.print("First Number: ");
        num1 = keyboard.nextDouble();
        System.out.print("Second Number: ");
        num2 = keyboard.nextDouble();
        
        System.out.print("Operation ( + - * or /): ");
        oper = keyboard.findWithinHorizon(".", 0).charAt(0);
        
        System.out.println();

        switch (oper) {
            case '+':
                System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / num2));
                break;
        }

        keyboard.close();
    }
}
