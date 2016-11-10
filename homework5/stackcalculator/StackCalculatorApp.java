package homework5.stackcalculator;

import java.util.Scanner;

public class StackCalculatorApp
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Stack Calculator.\n");
        System.out.println("Commands: push n, add, sub, mult, div, clear, or quit.\n");

        // create StackCalculator object
        StackCalculator stack = new StackCalculator();

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // get command from user
        String command = Validator.getRequiredString(sc, "? ");

        // continue until user enter quit
        while (!command.equalsIgnoreCase("quit"))
        {
            if (command.length() > 5 && command.substring(0, 4).equalsIgnoreCase("push"))
            {
                stack.push(Double.parseDouble(command.substring(5))); // push the number user entered
            }
            else if (command.equalsIgnoreCase("add"))
            {
                if (stack.size() >= 2)
                {
                    double result = stack.add();
                    stack.push(result);
                }
                else // if the stack does not have 2 values
                {
                    System.out.println("Stack must have at least 2 values to add!");
                }
            }
            else if (command.equalsIgnoreCase("sub"))
            {
                if (stack.size() >= 2)
                {
                    double result = stack.subtract();
                    stack.push(result);
                }
                else // if the stack does not have 2 values
                {
                    System.out.println("Stack must have at least 2 values to subtract!");
                }
            }
            else if (command.equalsIgnoreCase("mult"))
            {
                if (stack.size() >= 2)
                {
                    double result = stack.multiply();
                    stack.push(result);
                }
                else // if the stack does not have 2 values
                {
                    System.out.println("Stack must have at least 2 values to multiply!");
                }
            }
            else if (command.equalsIgnoreCase("div"))
            {
                if (stack.size() >= 2)
                {
                    double result = stack.divide();
                    stack.push(result);
                }
                else // if the stack does not have 2 values
                {
                    System.out.println("Stack must have at least 2 values to divide!");
                }
            }
            else if (command.equalsIgnoreCase("clear"))
            {
                stack.clear();
            }

            // display contents of the stack
            double[] values = stack.getValue();
            if (values.length > 0)
            {
                for (double value : values)
                {
                    System.out.println(value);
                }
            }
            else // if the stack is empty
            {
                System.out.println("empty");
            }

            System.out.println();

            // get command from user
            command = Validator.getRequiredString(sc, "? ");
        }
    }
}