package homework1;

import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverter
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();  // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter degrees in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            // calculate the degrees in celsius
            double celsius = (fahrenheit - 32) * 5 / 9;

            // display the degrees in celsius
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            System.out.println("Degrees in Celsius: " + number.format(celsius) + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
