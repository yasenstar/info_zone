import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ShowOneRoomOccupancy {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        Scanner diskScanner = new Scanner(new File("occupancy.txt"));
        int whichRoom;

        System.out.print("Which Room? (1 ~ 15) ");
        whichRoom = keyboard.nextInt();

        for (int roomNum = 1; roomNum < whichRoom && diskScanner.hasNext(); roomNum++) {
            diskScanner.nextInt();
        }

        if (diskScanner.hasNext()) {
            System.out.println("Room " + whichRoom + " has " + diskScanner.nextInt() + " guests.");
        } else {
            System.out.println("We only have 15 rooms, you chose a bigger number!");
        }
        
        keyboard.close();
        diskScanner.close();
    }    
}
