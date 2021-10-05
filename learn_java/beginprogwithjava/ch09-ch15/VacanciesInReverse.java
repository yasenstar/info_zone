import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class VacanciesInReverse {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner diskScanner = new Scanner(new File("occupancy.txt"));
        int guestIn[] = new int[15];

        for (int roomNum = 0; roomNum < 15; roomNum++) {
            guestIn[roomNum] = diskScanner.nextInt();
        }

        for (int roomNum = 14; roomNum >= 0; roomNum--) {
            if (guestIn[roomNum] == 0) {
                System.out.println("Room " + roomNum + " is vacant.");
            }
        }

        diskScanner.close();
    }
}
