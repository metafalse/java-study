package homework4.validatortest;

import homework4.validatortest.MyValidator;

import java.util.*;

public class ValidatorTestApp
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // create MyValidator object
        MyValidator mv = new MyValidator(sc);
        // display a welcome message
        System.out.println("Welcome to Validation Tester application.");

        // get integer from user
        System.out.println("\nInt Test");
        mv.getIntWithinRange("Enter an integer between -100 and 100: ", -101, 101);

        // get double from user
        System.out.println("\nDouble Test");
        mv.getDoubleWithinRange("Enter any number between -100 and 100: ", -101, 101);

        // get email address from user
        System.out.println("\nRequired String Test");
        mv.getRequiredString("Enter your email address: ");

        // get string from user
        System.out.println("\nString Choice Test");
        mv.getChoiceString("Select one (x/y): ", "x", "y");
    }
}