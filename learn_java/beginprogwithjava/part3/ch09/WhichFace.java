import java.util.Scanner;

public class WhichFace {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        char answer;

        System.out.print("Which face you want to see? (Y - smile, other - sad): ");
        answer = keyboard.findWithinHorizon(".", 0).charAt(0);

        if (answer == 'Y' || answer == 'y') {
            System.out.println(";-)");
        } else {
            System.out.println(";-(");
        }

        keyboard.close();
    }
}
