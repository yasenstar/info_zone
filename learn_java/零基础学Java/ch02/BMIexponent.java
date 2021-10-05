import java.util.Scanner;

public class BMIexponent {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double height, weight, bmi;
        
        System.out.print("Height (m): ");
        height = keyboard.nextDouble();
        System.out.print("Weight (kg): ");
        weight = keyboard.nextDouble();

        bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("体重过轻");
        } else if (bmi < 24.9) {
            System.out.println("正常范围");
        } else if (bmi < 29.9) {
            System.out.println("体重过重");
        } else {
            System.out.println("肥胖");
        }

        keyboard.close();
    }    
}
