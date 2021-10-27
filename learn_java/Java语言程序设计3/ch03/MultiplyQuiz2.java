import java.util.Scanner;

public class MultiplyQuiz2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int number1 = (int)(Math.random()*12);
        int number2 = (int)(Math.random()*12);

        boolean cont = true;

        int count = 0, correct = 0;
        char choose;
        double corrRate;

        while (cont) {
            System.out.print(number1 + " * " + number2 + " = ");

            int answer = keyboard.nextInt();

            if (answer==(number1*number2)) {
                System.out.println("恭喜你，答对了！");
                correct++;
            } else {
                System.out.println("很遗憾，答错了。正确答案是：" + (number1*number2));
            }
            count++;

            System.out.print("continue? (Press 'y' to continue and 'n' if want to exit): ");
            choose = keyboard.findWithinHorizon(".", 0).charAt(0);
            if (choose=='n') {
                cont = false;
            } else if (choose=='y') {
                number1 = (int)(Math.random()*12);
                number2 = (int)(Math.random()*12);
            }
        }
        
        System.out.println("Total: " + count + ", Correct: " + correct + "!");

        keyboard.close();
    }
}
