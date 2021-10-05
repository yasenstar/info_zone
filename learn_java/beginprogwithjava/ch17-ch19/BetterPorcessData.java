import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BetterPorcessData {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useLocale(Locale.CHINA);

        double unitPrice;
        int quantity;
        boolean taxable;

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.print("Unit price: ");
        unitPrice = keyboard.nextDouble();
        System.out.print("Quantity: ");
        quantity = keyboard.nextInt();
        System.out.print("Taxable? (true/false) ");
        taxable = keyboard.nextBoolean();

        double total = unitPrice * quantity;
        if (taxable) {
            total = total * 1.05;
        }

        String niceTotal = currency.format(total);
        System.out.println("Total: " + niceTotal);

        keyboard.close();
    }
}
