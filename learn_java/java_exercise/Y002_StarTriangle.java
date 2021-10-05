import java.util.Scanner;

public class Y002_StarTriangle {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= (10-i); j++) {
                System.out.print("_");
            }
            for (int k = (10-i+1); k <= (10+i); k++) {
                System.out.print("*");
            }
            for (int m = (10+i); m < 20; m++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}
