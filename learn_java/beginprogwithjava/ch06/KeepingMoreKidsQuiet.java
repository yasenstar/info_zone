import java.util.Scanner;

public class KeepingMoreKidsQuiet {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int gumballs, kids, gumballsPerKid;

        System.out.println("How many gumballs? And how many kids?");
        gumballs = keyboard.nextInt();
        kids = keyboard.nextInt();
        gumballsPerKid = gumballs / kids;
        System.out.println("Each kid get " + gumballsPerKid + " gumballs.");

        keyboard.close();
    }
}
