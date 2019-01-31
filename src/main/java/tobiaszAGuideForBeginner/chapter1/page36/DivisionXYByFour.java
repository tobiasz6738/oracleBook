package tobiaszAGuideForBeginner.chapter1.page36;

/*

Program demonstrate difference between int and double

 */

public class DivisionXYByFour
{
    public static void main(String[] args)
    {


        int x;
        double y;

        x = 10;
        y = 10.0;

        System.out.println(" int x = " + x + "\n double y = " + y);
        System.out.println("");

        x /= 4;
        y /= 4;

        System.out.println(" int x = " + x + " ('x' is type 'int' that's why when we divide 'x' we got two)" + "\n double y = " + y);

    }
}
