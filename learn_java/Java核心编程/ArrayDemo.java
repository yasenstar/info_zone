class ArrayDemo {
    public static void main(String[] args) {
        int[] anArray;
        anArray = new int[10];

        for (int i = 0; i<10; i++) {
            anArray[i] = (i+1) * 100;
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }
    }
}