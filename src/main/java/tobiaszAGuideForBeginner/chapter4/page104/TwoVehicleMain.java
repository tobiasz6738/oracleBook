package tobiaszAGuideForBeginner.chapter4.page104;

public class TwoVehicleMain
{


    public static void main(String[] args)
    {

        TwoVehicle minivan = new TwoVehicle();
        TwoVehicle sportsCar = new TwoVehicle();

        int rage1, rage2;

        minivan.setFuelcap(65);
        minivan.setPassanger(7);
        minivan.setLkm(9.1);

        sportsCar.setFuelcap(55);
        sportsCar.setPassanger(2);
        sportsCar.setLkm(12.5);

        rage1 = (int) (minivan.getFuelcap() / minivan.getLkm() * 100);
        rage2 = (int) (sportsCar.getFuelcap() / sportsCar.getLkm() * 100);

        System.out.println("zasieg minivana to" + rage1);
        System.out.println("zasieg sportowego auta to" + rage2);

    }
}
