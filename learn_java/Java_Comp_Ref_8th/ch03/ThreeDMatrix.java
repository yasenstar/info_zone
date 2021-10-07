public class ThreeDMatrix {
    public static void main(String args[]) {
        int threeD[][][] = new int[3][4][10];
        int i, j, k;

        for (i = 1; i<=3; i++) {
            for (j = 1; j<=4; j++) {
                for (k=1; k<=10; k++) {
                    threeD[i-1][j-1][k-1] = i*j*k;
                }
            }
        }

        for (i = 1; i<=3; i++) {
            for (j = 1; j<=4; j++) {
                for (k=1; k<=10; k++) {
                    System.out.print(threeD[i-1][j-1][k-1] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
