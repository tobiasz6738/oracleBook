package tobiaszAGuideForBeginner.chapter1.page36.object;

public class DivisionXYByFour
{

    private int x;
    private double y;

    public int divisionXBYFour(int x)
    {
        this.x = x;
        return x /= 4;
    }

    public double divisionYBYFour(double y)
    {
        this.y = y;
        return y /= 4;
    }

    public int getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }
}
