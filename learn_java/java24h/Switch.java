public class Switch {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("You got an A. Awesome!");
                break;
            case 'B':
                System.out.println("You got an B. Beautiful!");
                break;
            case 'C':
                System.out.println("You got an C. Concerning!");
                break;
            default:
                System.out.println("You got an F. You'll do well in Congress!");
        }
    }
}