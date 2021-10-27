public class CharBoolDemo {
    public static void main(String args[]){
        boolean b;
        char ch1 = 'Y', ch2 = 65;
        System.out.println("ch1 = " + ch1 + ", ch2 = " + ch2);
        b = ch1==ch2;
        System.out.println(b);
        ch2 ++;
        System.out.println("new ch2 = " + ch2);
    }
}
