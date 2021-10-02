import java.util.Scanner;

public class WhichFace {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        String answer;

        System.out.print("Which face you want to see? (Y - smile, N - sad): ");
        answer = keyboard.next();

        if (answer == 'y') {
            System.out.println(";-)");
        } else {
            System.out.println(";-(");
        }

        keyboard.close();
    }
}
