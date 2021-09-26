import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Random generator = new Random();
        int value1 = generator.nextInt();
        float value2 = generator.nextFloat();
        System.out.println("The random number is " + value1 + " and " + value2);
    }
}
