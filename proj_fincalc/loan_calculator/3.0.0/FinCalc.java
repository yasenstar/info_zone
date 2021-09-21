import java.io.*;
import java.util.*;

public class FinCalc {
    public static void main(String[] arguments) {
        String line = "*".repeat(95);
        System.out.println(line);
        System.out.println("Welcome, this is the financial calculator!");
        System.out.println(line);

        // Declare the parameters
        double assetPrice, downPaymentPercentage, financingAmount, annualRate;
        double installment;
        int terms;

        // Read inputs from user
        System.out.println("Please input Asset Selling Price: ");
        Scanner input = new Scanner(System.in);
        assetPrice = input.nextDouble();
        System.out.println("Please input % of down payment: ");
        downPaymentPercentage = input.nextDouble()/100;

        financingAmount = assetPrice * (1 - downPaymentPercentage);

        System.out.println("Please input the annual interest rate in %: ");
        annualRate = input.nextDouble()/100;
        System.out.println("Please input how many months of the financing: ");
        terms = input.nextInt();

        System.out.println(line);
        System.out.println("Your inputs are here:");
        System.out.println("Asset Selling Price: " + assetPrice);
        System.out.println("Downpayment: " + downPaymentPercentage*100 + "%");
        System.out.println("Financing Amount: " + financingAmount);

        // formula of monthly installment:
        // installment = finance_amount * monthly_rate * (1 + monthly_rate)^term / [(1 + monthly_rate)^n - 1]
        installment = financingAmount * (annualRate/12) * Math.pow(1+annualRate/12, terms) / (Math.pow(1+annualRate/12, terms) - 1);

        System.out.printf("Annual Rate: %10.2f\tTerms: %d months\n", annualRate*100, terms);
        System.out.printf("Monthly Installment Amount: %10.2f\n", installment);

        System.out.println("\n======Here is the Payment Plan======");
        System.out.println(line);
        System.out.println("Term\tBeginning Balance\tInstallment\tInterest\tPrincipal\tEnding Balance");    
        System.out.println(line);

        // Monthly Payment Detail
        double beginningBalance = financingAmount;
        for (int i = 1; i <= terms; i++) {
            double interest = beginningBalance * (annualRate / 12);
            double principal = installment - interest;
            double endingBalance = beginningBalance - principal;
            //System.out.println(i + "\t" + beginningBalance + "\t" + installment 
            //    + "\t" + interest + "\t" + principal + "\t" + endingBalance);
            System.out.printf("%d\t%10.2f\t\t%10.2f\t%10.2f\t%10.2f\t%10.2f\n", i, beginningBalance, installment, interest, principal, endingBalance);
            beginningBalance = endingBalance;
        }

        System.out.println(line);
    }
}