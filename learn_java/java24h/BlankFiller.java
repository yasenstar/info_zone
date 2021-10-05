public class BlankFiller {
    public static void main(String[] args) {
        System.out.println("The " + args[0]
            + " " + args[1] + " fox "
            + "jumed over the "
            + args[2] + " dog."
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