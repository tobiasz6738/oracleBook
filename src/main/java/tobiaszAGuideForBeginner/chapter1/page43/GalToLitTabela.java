package tobiaszAGuideForBeginner.chapter1.page43;

public class GalToLitTabela {

    public static void main(String[] args) {


        int counter;
        double gallons, liters;


        counter = 0;
        for (gallons = 1; gallons <= 100; gallons++)
        {
            liters = gallons * 3.7854;

            System.out.println(gallons + " galon to " + liters + " litrow ");


            counter++;
            if (counter == 10)
            {
                System.out.println();
                counter = 0;
            }

        }


    }

}
