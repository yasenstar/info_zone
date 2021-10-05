public class ImplicitConversion {
    public static void main(String args[]) {
        // 声明byte型变量mybyte，并把byte型变量允许的最大值赋给mybyte
        byte mybyte = 127;
        int myint = 150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble = 45.46546;

        System.out.println("byte型与float型数据进行运算结果为： " + (mybyte + myfloat));
        System.out.println("byte型与int型数据进行运算结果为： " + (mybyte * myint));
        System.out.println("byte型与char型数据进行运算结果为： " + (mybyte / mychar));
        System.out.println("double型与char型数据进行运算结果为： " + (mydouble + mychar));
    }
}
