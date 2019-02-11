package tobiaszAGuideForBeginner.chapter4.page109.versionWithParametrMethod;

public class ReturnWethodWithParametrMethod
    {

        private int passanger;
        private int fuelcap;
        private double lkm;

        public int rage(int passanger,int fuelcap, double lkm)
            {

                this.passanger = passanger;
                return (int) (fuelcap / lkm * 100);

            }



        public int getPassanger()
            {
                return passanger;
            }


    }
