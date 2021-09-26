import java.util.Scanner;

class EchoLine {
	
	public static void main(String[] args) {
		//System.out.println("start output");
		Scanner keyboard = new Scanner(System.in);
		System.out.println(keyboard.nextLine());
		keyboard.close();
	}

}
