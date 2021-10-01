import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(keyboard.next());
		System.out.println(keyboard.next());
		System.out.println(keyboard.nextLine());
		
		keyboard.close();

	}

}
