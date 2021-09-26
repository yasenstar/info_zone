public class IfElse {
    public static void main(String[] arguments) {
        int score = 50;
        int answer = 17;
        int correctAnswer = 13;

        if (answer == correctAnswer) {
            score += 10;
            System.out.println("That's the rigth answer. You get 10 points");
        }
        else {
            score -= 5;
            System.out.println("Sorry, wrong answer. You lose 5 points");
        }
    }
}
