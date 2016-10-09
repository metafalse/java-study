package homework1;

import java.util.Scanner;

public class ChangeCalculator
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Change Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter number of cents (0-99): ");
            int cents = sc.nextInt();

            // calculate the minimum number of coins
            int quarters = cents / 25;
            int dimes    = cents % 25 / 10;
            int nickels  = cents % 25 % 10 / 5;
            int pennies  = cents % 25 % 10 % 5;

            // display the minimum number of the coins
            String message = "Quarters: " + quarters + "\n"
                           + "Dimes:    " + dimes + "\n"
                           + "Nickels:  " + nickels + "\n"
                           + "Pennies:  " + pennies + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}