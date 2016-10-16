package homework2;

import java.util.Scanner;
import java.text.NumberFormat;

public class LoanWithValidation
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Loan Calculator");
        System.out.println(); // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("DATA ENTRY");
            double loanAmount = getDoubleWithinRange(sc,
                "Enter loan amount:          ", 0, 1000000);
            double interestRate = getDoubleWithinRange(sc,
                "Enter yearly interest rate: ", 0, 20);
            int years = getIntWithinRange(sc,
                "Enter number of years:      ", 0, 100);

            // calculate the monthly payment
            double monthlyInterestRate = interestRate / 12 / 100;
            double monthlyPayment =
                loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));

            // get the currency and percent formatters
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            percent.setMinimumFractionDigits(1);

            // print the results
            System.out.println();
            System.out.println("FORMATTED RESULTS");
            System.out.println("Loan amount:          " + currency.format(loanAmount));
            System.out.println("Yearly interest rate: " + percent.format(interestRate / 100));
            System.out.println("Number of years:      " + years);
            System.out.println("Monthly payment:      " + currency.format(monthlyPayment));
            System.out.println(); // print a blank line

            // see if the user wants to continue
            choice = getStringYOrN(sc, "Continue? (y/n): ");
            sc.nextLine(); // discard any other data entered on the line
            System.out.println(); // print a blank line
        }
    }

    private static double getDoubleWithinRange(Scanner sc, String prompt,
    double min, double max)
    {
        double d = 0.0;
        boolean isValid = false;
        while (!isValid)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println("Error! Number must be greater than " + min);
            else if (d >= max)
                System.out.println("Error! Number must be less than " + max);
            else
                isValid = true;
        }
        return d;
    }

    private static double getDouble(Scanner sc, String prompt)
    {
        double d = 0.0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
                System.out.println("Error! Invalid decimal value. Try again.");
            sc.nextLine(); // discard any other data entered on the line
        }
        return d;
    }

    private static int getIntWithinRange(Scanner sc, String prompt,
    int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println("Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println("Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }

    private static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
                System.out.println("Error! Invalid integer value. Try again.");
            sc.nextLine(); // discard any other data entered on the line
        }
        return i;
    }

    private static String getStringYOrN(Scanner sc, String prompt)
    {
        String s = "";
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            s = sc.next();
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n"))
                isValid = true;
            else
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
        }
        return s;
    }
}
