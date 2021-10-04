# Template of Dealing with Disk in Java

## Read Data from a Disk File

```java
/*
 * Before compiling this code, the blanks must be filled.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class __________ {
    public static void main(String args[]) throws FileNotFoundException {
        
        Scanner diskScanner = new Scanner(new File("__________"));

        __________ = diskScanner.nextInt();
        __________ = diskScanner.nextDoubls();
        __________ = diskScanner.nextLine();
        __________ = diskScanner.findWithinHorizon(".", 0).charAT(0);

        // etc..

        diskScanner.close();
    }
}
```

## Write Data to a Disk File

```java
/*
 * Before compiling this code, the blanks must be filled.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class __________ {
    public static void main(String args[]) throws FileNotFoundException {
        
        PrintStream diskWriter = new PrintStream("__________");

        diskWriter.print(__________);
        diskWriter.println(__________);

        // etc..

        diskWriter.close();
    }
}
```

## Some Notes

A `PrintStream` is able to write output, which is lik a `Scanner`. The big difference is that a `Scanner` is for reading input and a `PrintStream` is for writing output.