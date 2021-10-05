import java.util.Scanner;

public class GetSum {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int x = 1, sum = 0, max;
        System.out.print("请问要加总到多少? ");
        max = keyboard.nextInt();

        while (x<=max) {
            sum += x;
            x++;
        }

        System.out.println("Sum = " + sum);
        
        keyboard.close();
    }
}
