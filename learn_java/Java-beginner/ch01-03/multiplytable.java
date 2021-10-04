// 九九乘法表
public class multiplytable {
    public static void main(String args[]) {
        int x, y;
        for (x=1; x<=12; x++) {
            for (y=1; y<=12; y++) {
                System.out.print(x + " * " + y + " = " + x*y + "\t");
            }
            System.out.println();
        }
    }
}
