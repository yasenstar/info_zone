public class ExplicitConversion {
    public static void main(String args[]) {

        int a = (int) 45.23;
        long b = (long) 456.6F;
        char c = (char) 107.14;

        System.out.println("45.23强制转换为int的结果为: " + a);
        System.out.println("456.6F强制转换为long的结果为: " + b);
        System.out.println("107.14强制转换为char的结果为: " + c);

        for (int i = 1; i <= 127; i++) {
            System.out.print(i + "=>" + (char)i + "\t");
        }
    }
}
