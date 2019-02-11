package tobiaszAGuideForBeginner.chapter4.page103;

public class VehicleDemoMain
{
    public static void main(String[] args)
    {

        VehicleDemo minivan = new VehicleDemo();
        int range;

        minivan.setFuelcap(65);
        minivan.setPassanger(7);
        minivan.setLkm(9.1);


        range = (int) (minivan.getFuelcap() / minivan.getLkm() * 100);

        System.out.println(minivan.getPassanger() + " pazazerow na   " + range);

    }
}
