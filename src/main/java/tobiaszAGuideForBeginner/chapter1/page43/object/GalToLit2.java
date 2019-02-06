package tobiaszAGuideForBeginner.chapter1.page43.object;

public class GalToLit2 {

    public int displayingSubtitles()
    {
        int i = 0;
        double liters;
        double gallons;


        for(gallons = 1; gallons <= 100; gallons++)
        {
            i++;
            liters = gallons * 3.7854;
            System.out.println(gallons +"   "+ liters);

            if(i == 10)
            {
                System.out.println();

                i = 0;
            }

        }

        return 0;
    }

}
