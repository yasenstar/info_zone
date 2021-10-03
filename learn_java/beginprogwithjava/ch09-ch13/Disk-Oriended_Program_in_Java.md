# Writing a Disk-Oriented Program in Java

## Add the following `import` declarations to the beginning of the code:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream
```

## Add `throws` clause to the method header:

```java
throws FileNotFoundException
```

## In the call to `new Scanner`, replace `System.in` with a call to `new File` as follows:

```java
Scanner aVariableName = new Scanner(new File("inputFileName"));
```

## Create a `PrintStream` for writing output to a disk file:

```java
PrintStream anotherVariableName = new PrintStream("outputFileName");
```

## Use the `Scanner` variable name in calls to `nextInt, nextLine`, and so on from disk file:

```java
unitPrice = aVariableName.nextDouble();
quantity = aVariableName.nextInt();
```

## Use the `PrintStream` variable name in calls to `print` and `println` to disk file:

```java
anotherVariableName.println(total);
```

## Use the `Scanner` variable name in the call to `close`:

```java
aVariableName.close();
```

## Use the `PrintStream` variable name in a call to `close`:

```java
anotherVariableName.close();
```
