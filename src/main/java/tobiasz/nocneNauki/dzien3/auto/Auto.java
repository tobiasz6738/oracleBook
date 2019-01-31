package tobiasz.nocneNauki.dzien3.auto;

public class Auto {

    private UkladNapedowy ukladNapedowyWSamochodzie;

    private boolean jestWlaczony;


    public Auto(){

        this.ukladNapedowyWSamochodzie = new UkladNapedowy();
    }

    public void wlaczNapedJezdny()
    {
        this.jestWlaczony = true;
    }

    public void wylaczNapedJezdny()
    {
        this.jestWlaczony = false;
    }


    public void autoJedz()
    {
        if(jestWlaczony)
        {

            this.ukladNapedowyWSamochodzie.jedz();

        }
        else
            {
                System.out.println("");
                System.out.println(" nie jedzie");
        }
    }

}
