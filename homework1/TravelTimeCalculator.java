package homework1;

import java.util.Scanner;

public class TravelTimeCalculator
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Travel Time Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter miles:          ");
            double miles = sc.nextDouble();
            System.out.print("Enter miles per hour: ");
            double milesPerHour = sc.nextDouble();

            // calculate the hours and minutes
            int hours = (int) (miles / milesPerHour);
            int minutes = (int) (miles % milesPerHour / milesPerHour * 60);

            // display the hours and minutes
            String message = "Estimated travel time" + "\n"
                           + "Hours:   " + hours + "\n"
                           + "Minutes: " + minutes + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
