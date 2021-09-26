package initial;

public class FruitAverage {
    public static void main(String[] args) {
        // Declare and initialize three variables
        double numOranges = 50.0E-1;                    // Initial value is 5.0
        double numApples = 1.0E1;                           // Initial value is 10.0
        //double averageFruit = 0.0;

        double averageFruit = (numOranges + numApples) / 2.0;

        // Display the result
        System.out.println("A total fruity program");
        System.out.println("Average fruit is " + averageFruit);

        /*
        // Code to delay ending the program
        System.out.println("(Press Enter to exit)");
        try {
            System.in.read();           // Read some input from the keyboard
        } catch (IOException e) {       // Catch the input exception
            return;                     // and just return
        }
        */
    }
}
