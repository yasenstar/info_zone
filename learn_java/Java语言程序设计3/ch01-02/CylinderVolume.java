import java.util.Scanner;

public class CylinderVolume {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double r, h, v;
        System.out.print("Please input the r of bottom side of cylinder: ");
        r = keyboard.nextDouble();
        System.out.print("Please input the height of cylinder: ");
        h = keyboard.nextDouble();
        v = Math.PI * r * r * h;
        System.out.println("The volumn of cylinder is " + v);
        keyboard.close();
    }    
}
