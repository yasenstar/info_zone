import java.text.NumberFormat;
import static java.lang.System.out;

public class NiceAccount {
    String lastName;
    int id;
    double balance;

    void addInterest(double rate) {
        out.println("Adding " + rate + " percent...");
        balance += balance * (rate / 100.0);
    }

    void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        out.println("The account with last name " + lastName + " and ID number " + id + " has balance " + currency.format(balance));
    }
}
