package tobiaszAGuideForBeginner.chapter4.page109;

public class ReturnMethodMain
    {
        public static void main(String[] args)
            {

                ReturnMethod minivan = new ReturnMethod();
                ReturnMethod sportsCar = new ReturnMethod();

                minivan.lkm = 12.5;
                minivan.fuelcap = 55;
                minivan.passanger = 2;

                sportsCar.lkm = 9.1;
                sportsCar.fuelcap = 65;
                sportsCar.passanger = 7;

                int rage = minivan.rage();
                int rage2 = sportsCar.rage();

                System.out.println("spprtsCar " + rage + " minivan " + rage2);

            }
    }
