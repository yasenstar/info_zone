public class ForConcept {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to 1000 is " + sum);

        for (int i = 0, j = 20; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
