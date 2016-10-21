package homework3;

import java.util.Scanner;

public class DiceRollerApp
{
    private static int rollCount = 0;

    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Paradise Roller application\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // see if the user roll the dice
        System.out.print("Roll the dice? (y/n): ");
        String choice = sc.next();
        System.out.println(); // print a blank line

        // roll the dice until choice isn't equal to "y" or "Y"
        while (choice.equalsIgnoreCase("y"))
        {
            // create and roll a pair of dice object
            PairOfDice pairOfDice = new PairOfDice();
            pairOfDice.roll();
            rollCount++;

            // display the results
            System.out.println("Roll " + rollCount + ":");
            System.out.println(pairOfDice.getValue1());
            System.out.println(pairOfDice.getValue2());
            if (pairOfDice.getSum() == 7)
                System.out.println("Craps!");
            else if (pairOfDice.getValue1() == 1 && pairOfDice.getValue2() == 1)
                System.out.println("Snake eyes!");
            else if (pairOfDice.getValue1() == 6 && pairOfDice.getValue2() == 6)
                System.out.println("Box cars!");
            System.out.println(); // print a blank line

            // see if the user wants to continue
            System.out.print("Roll again? (y/n): ");
            choice = sc.next();
            System.out.println(); // print a blank line
        }
    }
}
