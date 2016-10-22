package homework3;

import java.util.Scanner;

public class NumberToWordConverter
{
    private static String[] units = {"one", "two", "three", "four", "five",
                                     "six", "seven", "eight", "nine"};
    private static String[] teens = {"ten", "eleven", "twelve", "thirteen",
                                     "fourteen", "fifteen", "sixteen",
                                     "seventeen", "eighteen", "nineteen"};
    private static String[] tens  = {"twenty", "thirty", "forty", "fifty",
                                     "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Number to Word Converter");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform creating circle until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            int number = Validator.getIntWithinRange(sc,
                "Enter the number you want to convert to words: ", -1, 10000);

            // conversion from number to word
            String result = "";
            if ((number / 1000) > 0)
            {
                result += units[number / 1000 - 1] + " thousand ";
            }

            if (((number % 1000) / 100) > 0)
            {
                result += units[(number % 1000) / 100 - 1] + " hundred ";
            }

            if (((number % 100) / 20) > 0)
            {
                result += tens[(number % 100) / 10 - 2] + " ";
                if (number % 10 > 0)
                    result += units[number % 10 - 1] + " ";
            }
            else if (((number % 100) / 10) > 0)
            {
                result += teens[number % 10] + " ";
            }
            else
            {
                if (number % 10 > 0)
                    result += units[number % 10 - 1] + " ";
            }

            if (number == 0)
                result += "zero";

            // display the results
            System.out.println(result);
            System.out.println();

            // see if the user wants to continue
            System.out.print("Translate another line? (y/n): ");
            choice = sc.next();
            System.out.println(); // print a blank line
        }
    }
}
