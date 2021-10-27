public class LogicDemo {
    public static void main(String[] args){
        int a = 1, b = 2, c = 3;
        boolean u = false;
        u = (a>=--b || b++<c--) && b==c;  // && and || are short-route symbol
        System.out.println("u = " + u);
        b = 2;
        u = (a>=--b | b++<c--) & b==c;  // & and | are non-short-rout symbol
        System.out.println("u = " + u);
    }
}
