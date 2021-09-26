public class BlankFiller {
    public static void main(String[] arguments) {
        System.out.println("The " + arguments[0]
            + " " + arguments[1] + " fox "
            + "jumed over the "
            + arguments[2] + " dog."
        );
    }
}

/*
If you try this with the command only, without arguments, following error will appear:

Exception in thread "main" java.lang.ArraryIndexOutOfBoundsException: 0
    at BlankFiller.main(BlankFiller.java:5)
About error from book.

My actual error message is like:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at BlankFiller.main(BlankFiller.java:3)
*/