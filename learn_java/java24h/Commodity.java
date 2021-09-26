public class Commodity {
    public static void main(String[] args) {
        String command = "BUY";
        int balance = 550;
        int quantity = 42;
        System.out.println("Beginning balance: $" + balance + "\tBeginning Quantity: " + quantity);

        switch (command) {
            case "BUY": {
                quantity += 5;
                balance -= 20;
                break;
            }
            case "SELL": {
                quantity -= 5;
                balance += 20;
            }
        }
        System.out.println("Balance: $" + balance + "\tQuantity: " + quantity);
    }
}
