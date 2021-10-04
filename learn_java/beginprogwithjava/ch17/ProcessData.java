import java.util.Scanner;

public class ProcessData {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double unitPrice;
        int quantity;
        boolean taxable;

        System.out.print("Unit price: ");
        unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        quantity = keyboard.nextInt();
        System.out.print("Taxable? (true or false) ");
        taxable = keyboard.nextBoolean();

        double total = unitPrice * quantity;
        
        if (taxable) {
            total = total * 1.05;
        }

        System.out.println("Total: " + total);

        keyboard.close();
    }
}
