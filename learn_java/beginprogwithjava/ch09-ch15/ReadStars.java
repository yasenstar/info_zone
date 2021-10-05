import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStars {
    public static void main(String args[]) throws FileNotFoundException {

        Scanner diskScanner = new Scanner(new File("starinput.txt"));
        char symbol;

        while (diskScanner.hasNext()) {
            symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);

            while (symbol == '*') {
                System.out.print(symbol);
                symbol = diskScanner.findWithinHorizon(".", 0).charAt(0);
            }

            System.out.println();
        }

        diskScanner.close();
    }
}

// if the last char is '*', then following error:
// Exception in thread "main" java.lang.NullPointerException
// at ReadStars.main(ReadStars.java:16)