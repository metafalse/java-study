package homework5.movielist;

import java.util.Scanner;
import java.util.ArrayList;

public class MovieListApp
{
    // create the Scanner object
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Movie List Application.\n");

        // create an array list of Movie objects
        ArrayList<Movie> movies = new ArrayList<>();
        // adds all movies into the array list
        for (int i = 1; i <= 100; i++)
        {
            Movie movie = MovieIO.getMovie(i);
            movies.add(movie);
        }
        System.out.println("There are 100 movies in the list.\n");

        // the main loop
        do
        {
            // get category from user
            String category = Validator.getRequiredString(sc, "What category are you interested in? ");

            // display a line for any movie whose category matches the category entered by the user
            for (Movie movie : movies)
            {
                if (movie.category.equalsIgnoreCase(category))
                {
                    System.out.println(movie.title);
                }
            }
            System.out.println();
        } while (getAnother()); // asks if the user wants to enter another transaction
    }

    private static boolean getAnother()
    {
        // get string y or n from user
        String choice = Validator.getChoiceString(sc, "Continue? (y/n): ", "y", "n");
        System.out.println();
        // return if choice is y or not
        return choice.equalsIgnoreCase("Y");
    }
}