public class factorial {
    public static void main(String args[]) {
        long i, j, factorial;
        for (i = 1; i <= 70; i++) {
            factorial = 1;
            for (j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("i = " + i + ",\t" + "factorial = " + factorial);
        }
    }
}
