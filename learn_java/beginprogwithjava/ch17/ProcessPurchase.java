import java.util.Scanner;

public class ProcessPurchase {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Purchase myPurchase = new Purchase();

        System.out.print("Unit price: ");
        myPurchase.unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        myPurchase.quantity = keyboard.nextInt();
        System.out.print("Taxable? (true or false) ");
        myPurchase.taxable = keyboard.nextBoolean();

        double total = myPurchase.unitPrice * myPurchase.quantity;
        
        if (myPurchase.taxable) {
            total = total * 1.05;
        }

        System.out.println("Total: " + total);

        keyboard.close();
    }
}
