public class Pounds2Dollar {
    public static void main(String args[]) {
        int pound;
        double dollar;

        System.out.println("Pounds\tDollars");

        for (pound = 1; pound <= 9; pound++) {
            dollar = pound * 1.25;
            System.out.println(pound + "\t" + dollar);
        }
    }
}
