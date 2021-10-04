import java.util.Random;

public class ProcessNiceAccounts {
    public static void main(String args[]) {
        Random myRandom = new Random();
        NiceAccount anAccount;
        double interestRate;

        for (int i = 0; i < 5; i++) {
            anAccount = new NiceAccount();

            anAccount.lastName = "" +
                (char)(myRandom.nextInt(26) + 'A') +
                (char)(myRandom.nextInt(26) + 'a') +
                (char)(myRandom.nextInt(26) + 'a');
            anAccount.id = myRandom.nextInt(10000);
            anAccount.balance = myRandom.nextInt(10000);

            anAccount.display();

            interestRate = myRandom.nextInt(13);
            anAccount.addInterest(interestRate);

            anAccount.display();
            System.out.println();
        }
    }
}
