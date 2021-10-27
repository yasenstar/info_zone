import java.util.Scanner;

public class MultiplyQuiz {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int number1 = (int)(Math.random()*12);
        int number2 = (int)(Math.random()*12);
        
        System.out.print(number1 + " * " + number2 + " = ");

        int answer = keyboard.nextInt();

        if (answer==(number1*number2)) {
            System.out.println("恭喜你，答对了！");
        } else {
            System.out.println("很遗憾，答错了。正确答案是：" + (number1*number2));
        }

        keyboard.close();
    }
}
