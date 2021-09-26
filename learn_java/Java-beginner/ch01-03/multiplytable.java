// 九九乘法表
public class multiplytable {
    public static void main(String args[]) {
        int x, y;
        for (x=1; x<=9; x++) {
            for (y=x; y<=9; y++) {
                System.out.print(x + " * " + y + " = " + x*y + "\t");
            }
            System.out.println();
        }
    }
}
