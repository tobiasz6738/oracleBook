package tobiaszAGuideForBeginner.chapter1.page39;

/*
Demonstrate conditional statement if
 */

public class IfDemo
{
    public static void main(String[] args)
    {
        int a,b,c;

        a = 2;
        b = 3;

        if(a < b)
        {
            System.out.println(" ");
            System.out.println("A is's smaller then B");
        }

        if(a == b)
        {
            System.out.println("it will not display");
        }

        c = a - b;

        System.out.println(" ");

        if(c <= 0)
        {
            System.out.println("C it's smaller then 0");
        }

        c = b - a;

        System.out.println(" ");

        if(c >= 0)
        {
            System.out.println("C it's bigger then 0");
        }

    }

}
