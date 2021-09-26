package initial;

import java.io.IOException;

public class FruitWait_childs {
    public static void main(String[] args) {
        // Declare and initialize three variables
        int numOranges = 9;     // Count of oranges
        int numApples = 23;     // Count of apples
        int numFruit = 0;       // Count of fruit
        int numChildren = 6;    // Number of childs
        int numFruitEach = 0;
        int numRemainder = 0;

        numFruit = numOranges++ + numApples;      // Calculate the total fruit count
        numFruitEach = numFruit / numChildren;
        numRemainder = numFruit % numChildren;

        // Display the result
        System.out.println("A total fruity program");
        System.out.println("Total oranges is " + numOranges);
        System.out.println("Total apples is " + numApples);
        System.out.println("Total fruit is " + numFruit + " fruits, which is " + numOranges + " Oranges and " + numApples + " Apples.");
        System.out.println("Total children are " + numChildren);
        System.out.println("The number of fruit each is " + numFruitEach + " and there are " + numRemainder + " left over.");


        // Code to delay ending the program
        System.out.println("(Press Enter to exit)");
        try {
            System.in.read();           // Read some input from the keyboard
        } catch (IOException e) {       // Catch the input exception
            return;                     // and just return
        }

    }
}
