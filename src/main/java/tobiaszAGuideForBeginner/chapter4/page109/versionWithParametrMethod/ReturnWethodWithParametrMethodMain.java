package tobiaszAGuideForBeginner.chapter4.page109.versionWithParametrMethod;

public class ReturnWethodWithParametrMethodMain
    {

        public static void main(String[] args)
            {

                ReturnWethodWithParametrMethod minivan = new ReturnWethodWithParametrMethod();
                ReturnWethodWithParametrMethod sportsCar = new ReturnWethodWithParametrMethod();


                int rage1 = minivan.rage(7, 65, 9.1);
                int rage2 = sportsCar.rage(2, 55, 12.5);


                System.out.println(minivan.getPassanger() + " pasazerow przejedzie minivanem " +rage1);
                System.out.println(sportsCar.getPassanger() + " pasazerow przejedzie sportsCarem " +rage2);

                System.out.println("");

                if(rage1 > rage2)
                    {
                        System.out.println("miniwan jest lepszy");
                    }
                else
                    {
                        System.out.println("sprotCar jest lepszy");
                    }
            }




    }
