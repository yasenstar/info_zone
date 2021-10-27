public class IncrementTest {
    public static void main(String args[]){
        int i = 3;
        int s = (i++) + (i++) + (i++);
        System.out.println("s = " + s + ", i = " + i);
        i = 3;
        s = (++i) + (++i) + (++i);
        System.out.println("s = " + s + ", i = " + i);
    }
}
