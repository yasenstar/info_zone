public class MultiplyTable {
    public static void main(String args[]) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i*j + "   ");
            }
            System.out.println();
        }
    }
}
