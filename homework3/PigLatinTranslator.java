package homework3;

import java.util.Scanner;

public class PigLatinTranslator
{
    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Pig Latin Translator");

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform creating circle until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Enter a line to be translated to Pig Latin:");
            String line = sc.nextLine().toLowerCase();
            System.out.println(); // print a blank line

            // iterates over every words
            String[] words = line.split(" ");
            String result = "";
            for (int i = 0; i < words.length; i++)
            {
                if (words[i].charAt(0) == 'a'
                 || words[i].charAt(0) == 'e'
                 || words[i].charAt(0) == 'i'
                 || words[i].charAt(0) == 'o'
                 || words[i].charAt(0) == 'u')
                    result += words[i] + "way";
                else
                {
                    // accumulate consonants before the first vowel
                    String consonants = String.valueOf(words[i].charAt(0));
                    // iterates over every letters
                    int j = 1;
                    while (words[i].charAt(j) != 'a'
                        && words[i].charAt(j) != 'e'
                        && words[i].charAt(j) != 'i'
                        && words[i].charAt(j) != 'o'
                        && words[i].charAt(j) != 'u'
                        && words[i].charAt(j) != 'y')
                    {
                        consonants += words[i].charAt(j);
                        j++;
                    }
                    result += words[i].substring(j) + consonants + "ay";
                }
                if (i != words.length) result += " ";
            }
            // display the results
            System.out.println(result);
            System.out.println();

            // see if the user wants to continue
            System.out.print("Translate another line? (y/n): ");
            choice = sc.next();
            sc.nextLine(); // discard any other data entered on the line
            System.out.println(); // print a blank line
        }
    }
}
