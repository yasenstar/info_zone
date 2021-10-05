import java.util.Scanner;

public class CheckNumber {

    enum NumberType {Positive, Negative, Zero}
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int number;
        NumberType type;

        System.out.print("Input a integer number: ");
        number = keyboard.nextInt();

        if (number > 0) {
            type = NumberType.Positive;
        } else if (number < 0) {
            type = NumberType.Negative;
        } else {
            type = NumberType.Zero;
        }

        System.out.println(number + " is " + type);

        keyboard.close();
    }
}
