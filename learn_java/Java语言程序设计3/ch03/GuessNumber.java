import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int magic = (int)(Math.random()*101) + 100;
        System.out.print("Please guess a number (100!200): ");
        int guess = keyboard.nextInt();
        while (guess!=magic) {
            if (guess > magic) {
                System.out.println("Wrong! Too big, guess again: ");
            } else {
                System.out.println("Wrong! Too small, guess again: ");
            }
            guess = keyboard.nextInt();
        }
        System.out.println("Great, you get it!\tThat number is " + magic);
        keyboard.close();
    }
}
