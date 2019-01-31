package tobiasz.nocneProgramowanieJavaTobiszAlone.dzienPierwszy;

public class MatematykaTobiasz {

    public double pole(Kwadrat kwadrat)
    {
        return kwadrat.bok() * kwadrat.bok();
    }

    public double poleKwadratu(double bokKwadratu)
    {
        return bokKwadratu*bokKwadratu;
    }


    public int dodawanie(int a,int b)
    {
        return a+b;
    }

    public double odejmowanie(double a, double b)
    {
        return a-b;
    }

    public int mnozenie (int a, int b)
    {
        return a*b;
    }
    public double dzielenie(double a, double b)
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
    public int wiekszaMniejsza(int a, int b)
    {
        if(a>b)
        {
            return a;
        }
        else
            {
            return b;
        }


    }

    public double procent(double a, double b)
    {
        return a * (b * 0.01);
    }

    public double wartoscBezwzgledna(double a,boolean b )
    {
        if(b)
        {
            return a;
        }
        else
        {
            return -a;
        }
    }

}
