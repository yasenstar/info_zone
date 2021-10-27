import java.util.Scanner;
public class CheckNumber {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input one integer, 谢谢: ");
        int num = keyboard.nextInt();
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println(num + " 能被5和6同时整除。");
        }
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println(num + " 能被5或6整除。");
        }
        if (num % 5 == 0 ^ num % 6 == 0) {
            System.out.println(num + " 只能被5或只能被6整除。");
        }
        keyboard.close();
    }
}
