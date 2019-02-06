package tobiaszAGuideForBeginner.chapter1.HomeWork;

public class CalToMeter
{

    public static void main(String[] args)
    {
        int meters;
        double cal;

        int count = 0;

        for(meters = 1; meters <=144; meters++)
        {

            cal = meters * 39.37;
            System.out.println( meters + " metrow to " + cal + "cali");

            count++;
            if(count == 12)
            {

                System.out.println();
                count = 0;
            }

        }

    }
}
