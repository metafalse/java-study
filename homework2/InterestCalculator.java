package homework2;

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class InterestCalculator
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Interest Calculator");
        System.out.println(); // print a blank line

        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter loan amount:   ");
            double loanAmount = sc.nextDouble();
            System.out.print("Enter interest rate: ");
            double interestRate = sc.nextDouble();
            System.out.println(); // print a blank line

            // convert loan amount and interest rate to BigDecimal
            BigDecimal decimalLoanAmount = new BigDecimal(Double.toString(loanAmount));
            decimalLoanAmount = decimalLoanAmount.setScale(2, RoundingMode.HALF_UP);
            BigDecimal decimalInterestRate = new BigDecimal(Double.toString(interestRate));

            // calculate interest
            BigDecimal decimalInterest = decimalLoanAmount.multiply(decimalInterestRate);
            decimalInterest = decimalInterest.setScale(2, RoundingMode.HALF_UP);

            // get the currency and percent formatter objects
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMaximumFractionDigits(3);

            // display the result
            System.out.println("Loan amount:         " + currency.format(decimalLoanAmount));
            System.out.println("Interest rate:       " + percent.format(decimalInterestRate));
            System.out.println("Interest:            " + currency.format(decimalInterest));
            System.out.println(); // print a blank line

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println(); // print a blank line
        }
    }
}