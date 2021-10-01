import java.util.Scanner;

public class MakeChanges {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int quarters, dimes, nickels, cents;
        int whatsLeft, total;

        System.out.print("How many cents do you have? ");
        total = keyboard.nextInt();

        quarters = total / 25;
        whatsLeft = total % 25;
        
        dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        cents = whatsLeft;

        System.out.println("=====Result====");
        System.out.print("From " + total + " cents you get ");
        System.out.print(quarters + " quarters, ");
        System.out.print(dimes + " dimes, ");
        System.out.print(nickels + " nickels and ");
        System.out.println(cents + " cents.");

        keyboard.close();
    }
}
