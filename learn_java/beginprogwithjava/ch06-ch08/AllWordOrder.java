import java.util.Scanner;

public class AllWordOrder {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        char c1, c2, c3;

        // refer to findWithinHorizon.md
        c1 = keyboard.findWithinHorizon(".", 0).charAt(0);
        c2 = keyboard.findWithinHorizon(".", 0).charAt(0);
        c3 = keyboard.findWithinHorizon(".", 0).charAt(0);

        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c3);

        System.out.print(c1);
        System.out.print(c3);
        System.out.println(c2);

        System.out.print(c2);
        System.out.print(c1);
        System.out.println(c3);

        System.out.print(c2);
        System.out.print(c3);
        System.out.println(c1);

        System.out.print(c3);
        System.out.print(c1);
        System.out.println(c2);

        System.out.print(c3);
        System.out.print(c2);
        System.out.println(c1);

        keyboard.close();
    }
}
