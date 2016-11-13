package homework5.studentscores;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScoresApp
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Student Scores Application.\n");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // get number of students from user (a positive integer required)
        int number = Validator.getIntWithinRange(sc, "Enter number of students to enter: ", 0, 101);
        System.out.println();

        // create an array of Student objects
        Student[] students = new Student[number];

        // get information about students
        for (int i = 0; i < number; i++)
        {
            String lastName = Validator.getRequiredString(sc, "Student " + (i + 1) + " last name: ");
            String firstName = Validator.getRequiredString(sc, "Student " + (i + 1) + " first name: ");
            int score = Validator.getIntWithinRange(sc, "Student " + (i + 1) + " score: ", -1, 101);
            System.out.println();

            students[i] = new Student(lastName, firstName, score); // create Student objet
        }

        Arrays.sort(students); // sort the array of students

        // prints the students and their scores in alphabetical order
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}