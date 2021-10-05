import java.util.Scanner;

public class ProcesMoreData {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        Customer myCustomer = new Customer();

        System.out.print("Customer's full name: ");
        myCustomer.fullName = keyboard.nextLine();
        System.out.print("Amount: ");
        myCustomer.amount = keyboard.nextDouble();
        System.out.print("Taxable? (true/false) ");
        myCustomer.taxable = keyboard.nextBoolean();

        if (myCustomer.taxable) {
            myCustomer.total = myCustomer.amount * 1.05;
        } else {
            myCustomer.total = myCustomer.amount;
        }

        System.out.println("\nThe total for " + myCustomer.fullName + " is " + myCustomer.total + ".");

        keyboard.close();
    }
    
}
