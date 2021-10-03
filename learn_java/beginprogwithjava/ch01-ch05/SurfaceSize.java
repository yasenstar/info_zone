import java.util.Scanner;

public class SurfaceSize {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        double length, width, height, surfaceSize;

        System.out.print("Length(cm): ");
        length = keyboard.nextDouble();
        System.out.print("Width(cm): ");
        width = keyboard.nextDouble();
        System.out.print("Height(cm): ");
        height = keyboard.nextDouble();

        surfaceSize = 2 * (length * width + length * height + width * height);

        System.out.println("Surfact Size (cmxcm) is " + surfaceSize);
        
        keyboard.close();
    }
}
