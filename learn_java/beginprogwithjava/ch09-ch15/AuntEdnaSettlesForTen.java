import static java.lang.System.out;

class AuntEdnaSettlesForTen {

    public static void main(String args[]) {

        for (int count = 0; count < 100; count++) {
            out.print("I've chewed " + count + " time(s).\t");
        }

        out.println("100 times! Hooray!");
        out.println("I can swallow!");
    }
}