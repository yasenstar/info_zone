import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SnitSoft_Interactive {

	public static void main(String[] args) throws IOException {
		Double disk_cost, shipping_cost, total_cost;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Please set the price(in $) of Flash Drive:");
		disk_cost = Double.parseDouble(br.readLine().trim());
		// above statement can be written in one complete line as below:
		// disk_cost = Double.parseDouble((new BufferedReader(new InputStreamReader(System.in)).readLine().trim()));
		System.out.print("You set the Flash Drive's price as $");
		System.out.println(disk_cost);
		
		System.out.println();
		
		System.out.println("Please input the shipping cost:");
		shipping_cost = Double.parseDouble(br.readLine().trim());
		System.out.print("Shipping Cost is set as $");
		System.out.println(shipping_cost);
		
		System.out.println();
		
		total_cost = disk_cost + shipping_cost;
		
		System.out.print("Total cost is $");
		System.out.print(total_cost);
		System.out.println(" , thanks for your purchasing!");

	}

}
