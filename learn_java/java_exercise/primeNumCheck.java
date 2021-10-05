public class primeNumCheck {
    public static void main(String args[]) {
        long i, j;
        for (i = 200000; i < 201111; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j >= i) {
                System.out.print(i + "\t");
            }
        }
    }
}
