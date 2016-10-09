package homework3;

import java.lang.Math;
import java.text.NumberFormat;

public class Circle
{
    private double radius;
    private double circumference;
    private double area;
    private static int objectCount = 0;

    public Circle(double radius)
    {
        this.radius = radius;
        objectCount++;
    }

    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }

    public String getFormattedCircumference()
    {
        return formatNumber(getCircumference());
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String getFormattedArea()
    {
        return formatNumber(getArea());
    }

    private String formatNumber(double x)
    {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        return number.format(x);
    }

    public static int getObjectCount()
    {
        return objectCount;
    }
}