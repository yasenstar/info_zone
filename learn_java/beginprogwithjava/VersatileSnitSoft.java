import java.util.Scanner;

class VersatileSnitSoft {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount;
		
		System.out.print("What is the price of a flash drive? ");
		amount = keyboard.nextDouble();
		amount = amount + 25.00;
		
		System.out.print("We will bill $");
		System.out.print(amount);
		System.out.println(" to your credit card!");
		
		keyboard.close();
	}

}
