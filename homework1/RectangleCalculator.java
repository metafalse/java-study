package homework1;

import java.util.Scanner;

public class RectangleCalculator
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width:  ");
            double width = sc.nextDouble();

            // calculate the area and perimeter
            double area = width * length;
            double perimeter = 2 * width + 2 * length;

            // display the area and perimeter
            String message = "Area:         " + area + "\n"
                           + "Perimeter:    " + perimeter + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
