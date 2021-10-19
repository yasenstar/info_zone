public class math_array {
    public static void main(String args[]) {
        int[] numArray = { 1, 1 };
        numArray.add(2);
        for (int element=0; element < numArray.length; element++) {
            System.out.print(numArray[element] + "\t");
        }
    }
}
