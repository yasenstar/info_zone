public class IFSample {
    public static void main(String args[]) {
        int x = 10, y = 20;

        if (x < y) System.out.println("x is less than y");

        x *= 2;
        if (x == y) System.out.println("x now equals to y");

        x *= 2;
        if (x > y) System.out.println("x now greater than y");
    }
}
