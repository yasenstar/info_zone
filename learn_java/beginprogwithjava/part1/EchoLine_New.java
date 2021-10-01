import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EchoLine_New {

	public static void main(String[] args) throws IOException {
		System.out.println("Write down anything, I'll repeat:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		System.out.println(input);
	}

}
