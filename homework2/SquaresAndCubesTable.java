package homework2;

import java.util.Scanner;

public class SquaresAndCubesTable
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Squares and Cubes table");
        System.out.println(); // print a blank line

        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter an integer: ");
            int numberOfRows = sc.nextInt();
            System.out.println(); // print a blank line

            // fill the first row of the table
            System.out.println("Number Squared Cubed");
            System.out.println("====== ======= =====");

            // loop through each row
            for (int rows = 1; rows <= numberOfRows; rows++)
            {
                System.out.println(
                    String.format("%-7s", rows)                 // number
                  + String.format("%-8s", rows * rows)          // squared
                  + String.format("%-5s", rows * rows * rows)); // cubed
            }
            System.out.println(); // print a blank line

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println(); // print a blank line
        }
    }
}
