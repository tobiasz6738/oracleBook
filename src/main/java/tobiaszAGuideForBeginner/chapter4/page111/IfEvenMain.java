package tobiaszAGuideForBeginner.chapter4.page111;

public class IfEvenMain
    {
        public static void main(String[] args)
            {

                IfEven even = new IfEven();


                if(even.isEvan(9))
                    {
                        System.out.println("nie jest parzysta");
                    }

                if(even.isEvan(10))
                    {
                        System.out.println("jest parzysta");
                    }


            }
    }
