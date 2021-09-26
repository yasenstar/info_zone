package initial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitByInput {
    public static void main(String[] args) {

        try {
            // Declare and initialize three variables
            int numOranges = 0;
            int numApples = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input the # of Oranges:");
            String strOrange = reader.readLine();
            System.out.println("Please input the # of Apples:");
            String strApple = reader.readLine();
            try {
                numOranges = Integer.parseInt(strOrange);
                numApples = Integer.parseInt(strApple);
                int numFruit = 0;       // Count of fruit

                numFruit = numOranges + numApples;      // Calculate the total fruit count

                // Display the result
                System.out.println("A total fruity program");
                System.out.println("Total oranges is " + numOranges);
                System.out.println("Total apples is " + numApples);
                System.out.println("Total fruit is " + numFruit);

            } catch (NumberFormatException e) {
                System.out.println("not a number, please run again!");
                return;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

