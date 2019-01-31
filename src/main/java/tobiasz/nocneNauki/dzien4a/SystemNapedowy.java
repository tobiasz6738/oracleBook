package tobiasz.nocneNauki.dzien4a;

public class SystemNapedowy {

    private SilnikMajacyLogike silnikMajacyLogikeSeata;
    private WalKorbowy walKorbowySeata;

    private boolean pracaSilnika;

    public SystemNapedowy() {

        this.silnikMajacyLogikeSeata = new SilnikMajacyLogike();
        this.walKorbowySeata = new WalKorbowy();

    }

    public void napedzajAuto()
    {
        for(int i = 0; i < 5; i++)
        {
            this.silnikMajacyLogikeSeata.pracuj();
        }

//        this.walKorbowySeata.walKorbowy();
    }






}
