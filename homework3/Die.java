package homework3;

import java.lang.Math;

public class Die
{
    private int sides;
    private int value;
    final int DEFAULT_SIDES = 6;

    public Die()
    {
        this.sides = DEFAULT_SIDES;
    }

    public Die(int sides)
    {
        this.sides = sides;
    }

    public void roll()
    {
        value = (int) Math.ceil(Math.random() * sides);
    }

    public int getValue()
    {
        return value;
    }
}
