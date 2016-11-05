package homework4.validatortest;

import homework4.validatortest.OOValidator;

import java.util.Scanner;

public class MyValidator extends OOValidator
{
    public MyValidator(Scanner sc)
    {
        super(sc);
    }

    public String getRequiredString(String prompt)
    {
        String s = "";
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s == null || s.equals(""))
            {
                System.out.println("Error: This entry is required. Try again.");
            }
            else
            {
                isValid = true;
            }
        }
        return s;
    }

    public String getChoiceString(String prompt, String s1, String s2)
    {
        String s = "";
        boolean isValid = false;
        while (isValid == false)
        {
            s = getRequiredString(prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2))
            {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "' Try again.");
            }
            else
            {
                isValid = true;
            }
        }
        return s;
    }
}