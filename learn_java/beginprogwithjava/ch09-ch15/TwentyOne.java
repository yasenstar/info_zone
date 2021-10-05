import java.util.Random;

public class TwentyOne {
    public static void main(String args[]){
        Random myrandom = new Random();
        int dice, total = 0;

        System.out.println("Card\tTotal");

        while (total < 21) {
            dice = myrandom.nextInt(6) + 1;
            total = total + dice;
            System.out.println(dice + "\t" + total);
        }

        if (total == 21) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
