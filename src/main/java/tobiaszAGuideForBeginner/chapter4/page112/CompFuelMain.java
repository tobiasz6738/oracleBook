package tobiaszAGuideForBeginner.chapter4.page112;

public class CompFuelMain
    {

        public static void main(String[] args)
            {

                CompFuel minivan = new CompFuel(7,65,9.1);
                CompFuel sportsCar = new CompFuel(2,55,12.5);


                double liters = minivan.fuelneeded(252);
                double litrs2 = sportsCar.fuelneeded(345);

                System.out.println(liters);
                System.out.println(litrs2);
            }

    }
