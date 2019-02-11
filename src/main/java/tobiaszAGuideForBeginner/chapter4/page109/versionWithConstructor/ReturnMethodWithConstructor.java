package tobiaszAGuideForBeginner.chapter4.page109.versionWithConstructor;

public class ReturnMethodWithConstructor
    {

        private int fuelcap;
        private int passenger;
        private double lkm;

        public ReturnMethodWithConstructor(int fuelcap, int passenger, double lkm)
            {
                this.fuelcap = fuelcap;
                this.passenger = passenger;
                this.lkm = lkm;
            }

        public int rage()
            {
                return (int) (fuelcap / lkm * 100);
            }
    }
