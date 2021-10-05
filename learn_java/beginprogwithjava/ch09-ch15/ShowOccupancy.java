import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ShowOccupancy {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("occupancy.txt"));

        System.out.println("Room\tGuests");

        for (int roomNum = 1; roomNum <=10; roomNum++) {
            System.out.println(roomNum + "\t" + diskScanner.nextInt());
        }

        diskScanner.close();
    }    
}
