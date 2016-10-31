package homework5.stackcalculator;

import java.util.LinkedList;

public class StackCalculator
{
    private LinkedList<Double> stack;

    public StackCalculator()
    {
        clear();
    }

    void push(double x)
    {
        stack.addFirst(x);
    }

    double pop()
    {
        return stack.removeFirst();
    }

    double add()
    {
        double first = stack.pop();
        double second = stack.pop();
        return first + second;
    }

    double subtract()
    {
        double first = stack.pop();
        double second = stack.pop();
        return second - first;
    }

    double multiply()
    {
        double first = stack.pop();
        double second = stack.pop();
        return first * second;
    }

    double divide()
    {
        double first = stack.pop();
        double second = stack.pop();
        return second / first;
    }

    void clear()
    {
        stack = new LinkedList<>();
    }

    double[] getValue()
    {
        // convert the linked list of Double into array of double
        Double[] tmp = stack.toArray(new Double[stack.size()]);
        double[] result = new double[tmp.length];
        for (int i = 0; i < tmp.length; i++)
        {
            result[i] = tmp[i];
        }
        return result;
    }

    int size()
    {
        return stack.size();
    }
}