import java.util.Scanner;

public class ProcessPurchase2 {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Purchase myPurchase1 = new Purchase();

        System.out.print("Unit price: ");
        myPurchase1.unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        myPurchase1.quantity = keyboard.nextInt();
        System.out.print("Taxable? (true or false) ");
        myPurchase1.taxable = keyboard.nextBoolean();

        Purchase myPurchase2 = new Purchase();

        System.out.print("Unit price: ");
        myPurchase2.unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        myPurchase2.quantity = keyboard.nextInt();
        System.out.print("Taxable? (true or false) ");
        myPurchase2.taxable = keyboard.nextBoolean();

        double total1 = myPurchase1.unitPrice * myPurchase1.quantity;
        
        if (myPurchase1.taxable) {
            total1 = total1 * 1.05;
        }

        System.out.println("Total: " + total1);

        double total2 = myPurchase2.unitPrice * myPurchase2.quantity;
        
        if (myPurchase2.taxable) {
            total2 = total2 * 1.05;
        }

        System.out.println("Total: " + total2);

        keyboard.close();
    }
}
