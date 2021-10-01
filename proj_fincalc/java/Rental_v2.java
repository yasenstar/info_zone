/**
 * author Yasen Zhao
 * Purpose: 等额本息月供还款计算器
 * Parameter: borrowed - 贷款总额, rate - 从输入的年利率折合为的月利率, term - 贷款总期数（月）, rental - 月供
 * Date: 2021-09-30
 */
import java.util.Scanner;
import java.lang.Math;

public class Rental_v2 {
    // Calculate monthly rental using java
    public static void main(String args[]){

        Double borrowed, rate, term, rental;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How much are you borrowing?");
        borrowed = keyboard.nextDouble();
        System.out.println("What is the interest rate?");
        rate = keyboard.nextDouble() / 100 / 12;
        System.out.println("How many months are you take to pay?");
        term = keyboard.nextDouble();

        keyboard.close();

        rental = borrowed * rate * Math.pow(1+rate, term) / (Math.pow(1+rate, term) - 1);

        System.out.println("Your monthly payment is " + rental);
    }
}
