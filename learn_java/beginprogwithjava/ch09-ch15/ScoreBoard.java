import java.util.Scanner;
import static java.lang.System.out;

public class ScoreBoard {

    enum WhoWins {home, visitor, neither};
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int hankees, socks;
        WhoWins who;

        out.print("Hankees and Socks scores? ");
        hankees = keyboard.nextInt();
        socks = keyboard.nextInt();
        out.println();

        if (hankees > socks) {
            who = WhoWins.home;
            out.println("The Hankees wins ;-)");
            out.println("We beat 'em good. Didn't we?");
        } else if (hankees < socks) {
            who = WhoWins.visitor;
            out.println("The Socks wins ;-)");
            out.println("The umpire made an unfair call.");
        } else {
            who = WhoWins.neither;
            out.println("It's a tie :-|");
            out.println("The gave goes into overtime.");
        }

        keyboard.close();
    }
}
