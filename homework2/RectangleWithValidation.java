package homework2;

import java.util.Scanner;

public class RectangleWithValidation
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println(); // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            double length = getDoubleWithinRange(sc, "Enter length: ", 0, 1000000);
            double width  = getDoubleWithinRange(sc, "Enter width:  ", 0, 1000000);

            // calculate the area and perimeter
            double area = width * length;
            double perimeter = 2 * width + 2 * length;

            // display the area and perimeter
            String message = "Area:         " + area + "\n"
                           + "Perimeter:    " + perimeter + "\n";
            System.out.println(message);

            // see if the user wants to continue
            //choice = getStringYOrN(sc, "Continue? (y/n): ");
            choice = getChoiceString(sc, "Continue? (y/n): ", "y", "n");
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

    private static String getChoiceString(Scanner sc, String prompt, String s1, String s2)
    {
        String s = "";
        boolean isValid = false;
        while (!isValid)
        {
            s = getRequiredString(sc, prompt);
            if (s.equalsIgnoreCase(s1) || s.equalsIgnoreCase(s2))
                isValid = true;
            else
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
        }
        return s;
    }

    private static String getRequiredString(Scanner sc, String prompt)
    {
        String s = "";
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals(""))
                System.out.println("Error! This entry is required. Try again.");
            else
                isValid = true;
        }
        return s;
    }
    /*private static String getStringYOrN(Scanner sc, String prompt)
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
    }*/
}
