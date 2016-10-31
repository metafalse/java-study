package homework5.studentscores;

public class Student implements Comparable
{
    private String lastName;
    private String firstName;
    private int score;

    public Student(String lastName, String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = 0;
    }

    public Student(String lastName, String firstName, int score)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String toString()
    {
        return getLastName() + ", " + getFirstName() + ": " + getScore();
    }

    @Override
    public int compareTo(Object o)
    {
        if (o instanceof Student)
        {
            // If two students have the same last name,
            // the first name should be used to determine the final sort order.
            Student student = (Student) o;
            int resultOfLastName = lastName.compareTo(student.getLastName());
            return (resultOfLastName == 0) ? firstName.compareTo(student.getFirstName()) : resultOfLastName;
        }
        return 0;
    }
}