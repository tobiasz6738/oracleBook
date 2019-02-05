package tobiaszAGuideForBeginner.chapter1.page39.object;

public class DemonstrationOfTheIfFunction
{
    private int c = 0;



    public boolean instructionIf(int a, int b)
        {

            if(a < b)
            {
                System.out.println("a is smaller then b");

            }
            else
            {
                return false;
            }

            c = a - b;

            if(c > 0)
            {
                System.out.println("c is biggest then 0 because is equal to " + c);

                if(c == 0)
                {
                    System.out.println("c is equal to 0 because c = " + c);
                }
            }

            return true;
        }

    public int getC() {
        return c;
    }
}
