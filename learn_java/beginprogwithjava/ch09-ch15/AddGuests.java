import java.util.Scanner;

public class AddGuests {
    
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int whichRoom, numGuests;
        int guestIn[];
        guestIn = new int[10];

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guestIn[roomNum] = 0;
        }

        do {
            System.out.print("Room number: ");
            whichRoom = keyboard.nextInt();
            System.out.print("How many guests? ");
            numGuests = keyboard.nextInt();
            guestIn[whichRoom] = numGuests;
            System.out.println();
            System.out.print("Do another? ");
        } while (keyboard.findWithinHorizon(".", 0).charAt(0) == 'y');
        System.out.println();

        System.out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.println(roomNum + "\t" + guestIn[roomNum]);
        }

        keyboard.close();
    }
}
