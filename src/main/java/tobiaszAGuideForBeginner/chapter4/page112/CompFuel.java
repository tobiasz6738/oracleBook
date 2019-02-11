package tobiaszAGuideForBeginner.chapter4.page112;

public class CompFuel
    {

        private int passenger;
        private int fulecap;
        private double lkm;

        public CompFuel(int passenger, int fulecap, double lkm)
            {
                this.passenger = passenger;
                this.fulecap = fulecap;
                this.lkm = lkm;
            }

        public int range()
            {
                return (int) (fulecap / lkm * 100);
            }

        public double fuelneeded(int km)
            {
                return (double) km / 100 * lkm;
            }
        public int getPassenger()
            {
                return passenger;
            }

        public void setPassenger(int passenger)
            {
                this.passenger = passenger;
            }

        public int getFulecap()
            {
                return fulecap;
            }

        public void setFulecap(int fulecap)
            {
                this.fulecap = fulecap;
            }

        public double getLkm()
            {
                return lkm;
            }
    public void setLkm(double lkm)
        {
            this.lkm = lkm;

        }
    }
