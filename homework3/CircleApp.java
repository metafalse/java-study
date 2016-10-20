package homework3;

import java.util.Scanner;

public class CircleApp
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Circle Tester\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform creating circle until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            double radius = Validator.getDouble(sc, "Enter radius:  ");

            // create a circle object
            Circle circle = new Circle(radius);

            // display the results
            System.out.println("Circumference: " + circle.getFormattedCircumference());
            System.out.println("Area:          " + circle.getFormattedArea());
            System.out.println(); // print a blank line

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println(); // print a blank line
        }

        System.out.println("Goodbye. You created " + Circle.getObjectCount() + " Circle object(s).");
    }
}
