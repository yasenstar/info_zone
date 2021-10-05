import java.util.Scanner;

public class CheckPassword {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        String password = "swordfish";
        String userInput;

        System.out.print("What's the password? ");
        userInput = keyboard.next();

        if (password.equals(userInput)) {
            System.out.println("You're OK!");
        } else {
            System.out.println("Password incorrect");
        }

        keyboard.close();
    }
}
