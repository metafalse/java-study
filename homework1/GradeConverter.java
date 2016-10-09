package homework1;

import java.util.Scanner;

public class GradeConverter
{
    public static void main(String[] args)
    {
        // welcome the user to the program
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();  // print a blank line

        // create a Scanner object and start a while loop
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.print("Enter numerical grade: ");
            int numericalGrade = sc.nextInt();

            // convert number grade to letter grade
            String letterGrade;
            if (numericalGrade >= 88)
                letterGrade = "A";
            else if (numericalGrade >= 80)
                letterGrade = "B";
            else if (numericalGrade >= 67)
                letterGrade = "C";
            else if (numericalGrade >= 60)
                letterGrade = "D";
            else
                letterGrade = "F";

            // display the letter grade
            System.out.println("Letter grade: " + letterGrade + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
