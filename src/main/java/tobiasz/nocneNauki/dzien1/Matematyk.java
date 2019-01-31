package tobiasz.nocneNauki.dzien1;

public class Matematyk {

    public double obliczObwodTrojkat(double a, double b, double c)
    {
        return a + b + c;
    }

    public int obliczSume (int a, int b)
    {
        return a + b;
    }

    public double obliczOdejmowanie (double a, double b)
    {
        return a - b;
    }

    public double obliczMnozenie (double a, double b)
    {
        return a * b;
    }

    public double obliczDzielenie (double a, double b)
    {

        if(b != 0)
        {
            return a/b;
        }
        else
        {
            return 0;
        }

    }

    public double dupa(double a, boolean t)
    {
        if(t)
        {
            return a;
        }
        else
        {
            return -a;
        }
    }


}
