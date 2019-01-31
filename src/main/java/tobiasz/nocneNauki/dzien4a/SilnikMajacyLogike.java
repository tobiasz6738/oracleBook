package tobiasz.nocneNauki.dzien4a;

public class SilnikMajacyLogike {

    private Zapadka zapadkaWtrysku;
    private PompaWtryskuPaliwa pompaWtryskuPaliwa;
    private KomoraSpalania komoraSpalania;

    public SilnikMajacyLogike() {
        this.zapadkaWtrysku = new Zapadka();
        this.pompaWtryskuPaliwa = new PompaWtryskuPaliwa();
        this.komoraSpalania = new KomoraSpalania();
    }

    public void pracuj()
    {
        if(this.zapadkaWtrysku.czyJestOtwarta())
        {
            this.pompaWtryskuPaliwa.podajPaliwo();
            this.zapadkaWtrysku.zamknijZapadke();
            this.komoraSpalania.spalPaliwo();
        }
        else
        {
            this.zapadkaWtrysku.otworzZapadke();
        }

    }

}
