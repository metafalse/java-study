package homework4.person;

public class Customer extends Person
{
    private String customerNumber;

    public Customer()
    {

    }

    public String getCustomerNumber()
    {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber)
    {
        this.customerNumber = customerNumber;
    }

    @Override
    public String getDisplayText()
    {
        return super.toString() + "Customer number: " + customerNumber + "\n";
    }
}