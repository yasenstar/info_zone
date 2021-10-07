public class Continue {
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
            if (i%7!=0) continue;
            System.out.println();
        }
    }
}
