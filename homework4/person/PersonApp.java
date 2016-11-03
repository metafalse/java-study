package homework4.person;

import java.util.*;

public class PersonApp
{
    static Scanner sc = new Scanner(System.in); // get the scanner

    public static void main(String[] args)
    {
        // display a welcome message
        System.out.println("Welcome to the Person Tester application.\n");
        do
        {
            // get person type from user
            String personType = Validator.getChoiceString(sc, "Create customer or employee? (c/e): ", "c", "e");
            System.out.println();

            // get person's information from user
            String firstName = Validator.getRequiredString(sc, "Enter first name: ");
            String lastName = Validator.getRequiredString(sc, "Enter last name: ");
            String email = Validator.getRequiredString(sc, "Enter email address: ");

            // if person is customer
            if (personType.equalsIgnoreCase("c"))
            {
                // create customer object
                Customer customer = new Customer();
                // set customer to its information
                customer.setFirstName(firstName);
                customer.setLastName(lastName);
                customer.setEmail(email);
                // get customer number from user
                String customerNumber = Validator.getRequiredString(sc, "Customer number: ");
                customer.setCustomerNumber(customerNumber);
                // display customer's information to user
                print(customer);
            }
            // if person is employee
            else if (personType.equalsIgnoreCase("e"))
            {
                // create employee object
                Employee employee = new Employee();
                // set employee to its information
                employee.setFirstName(firstName);
                employee.setLastName(lastName);
                employee.setEmail(email);
                // get ssn from user
                String ssn = Validator.getRequiredString(sc, "Social security number: ");
                employee.setSSN(ssn);
                // display employee's information to user
                print(employee);
            }
        } while (getAnother()); // asks if the user wants to enter another person
    }

    public static boolean getAnother()
    {
        // get string y or n from user
        String choice = Validator.getChoiceString(sc, "Continue? (y/n): ", "y", "n");
        System.out.println();
        // return if choice is y or not
        return choice.equalsIgnoreCase("Y");
    }

    public static void print(Person person)
    {
        // display person's information
        System.out.println("\nYou entered:");

        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        System.out.println("Name: " + firstName + " " + lastName);

        String email = person.getEmail();
        System.out.println("Email: " + email);

        // if person is customer
        if (person instanceof Customer)
        {
            // display customer number
            String customerNumber = ((Customer) person).getCustomerNumber();
            System.out.println("Customer number: " + customerNumber);
        }
        // if person is employee
        else if (person instanceof Employee)
        {
            // display ssn
            String ssn = ((Employee) person).getSSN();
            System.out.println("Social security number: " + ssn);
        }

        System.out.println();
    }
}