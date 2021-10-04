import java.text.NumberFormat;

class Account {
    String lastName;
    int id;
    double balance;

    void display() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("The account with last name ");
        System.out.print(lastName);
        System.out.print(" and ID number ");
        System.out.print(id);
        System.out.print(" has balance ");
        System.out.println(currency.format(balance));
    }
}
