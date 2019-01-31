package tobiasz.nocneNauki.dzien3.auto;

public class UkladNapedowy {

    private Silnik silnikWSamochodzie;
    private Wal walWSamochodzie;

    public UkladNapedowy()
    {
        this.silnikWSamochodzie = new Silnik();
        this.walWSamochodzie = new Wal();
    }




    public void jedz()
    {
        this.silnikWSamochodzie.silnik();
        this.walWSamochodzie.wal();

    }




}
