package tobiaszAGuideForBeginner.chapter4.page109.versionWithConstructor;

public class ReturnMethodWithConstructorMain
    {
        public static void main(String[] args)
            {

                ReturnMethodWithConstructor minivan = new ReturnMethodWithConstructor(65, 7, 9.1);
                ReturnMethodWithConstructor sportsCar = new ReturnMethodWithConstructor(55, 2, 12.5);

                System.out.println("zasieg miniwana " + minivan.rage());
                System.out.println("zasieg sportsCar " + sportsCar.rage());
            }
    }
