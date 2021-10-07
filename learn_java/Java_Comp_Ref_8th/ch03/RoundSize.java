import java.util.Scanner;

public class RoundSize {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double PI = 3.14, r, size;
        
        System.out.print("Please indicate radius: ");
        r = keyboard.nextDouble();
        
        size = PI * r * r;
        
        System.out.println("Size of round is " + size); 
        
        keyboard.close();
    }

}
