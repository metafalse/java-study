package homework3;

public class PairOfDice
{
    private Die die1;
    private Die die2;
    private int sum;

    public PairOfDice()
    {
        die1 = new Die();
        die2 = new Die();
    }

    public PairOfDice(int sides)
    {
        die1 = new Die(sides);
        die2 = new Die(sides);
    }

    public void roll()
    {
        die1.roll();
        die2.roll();
    }

    public int getValue1()
    {
        return die1.getValue();
    }

    public int getValue2()
    {
        return die2.getValue();
    }

    public int getSum()
    {
        return getValue1() + getValue2();
    }
}
