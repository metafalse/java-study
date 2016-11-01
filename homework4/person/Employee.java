package homework4.person;

public class Employee extends Person
{
    private String ssn;

    public Employee()
    {

    }

    public String getSSN()
    {
        return ssn;
    }

    public void setSSN(String ssn)
    {
        this.ssn = ssn;
    }

    @Override
    public String getDisplayText()
    {
        return super.toString() + "Social security number: " + ssn + "\n";
    }
}