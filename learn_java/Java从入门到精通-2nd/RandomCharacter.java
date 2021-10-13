public class RandomCharacter {
    public static void main(String args[]) {
        char ch;
        ch = (char) (65 + (int)(Math.random() * 52));
        System.out.println("The Random Char is " + ch);
    }
}
