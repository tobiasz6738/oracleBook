package tobiasz.nocneNauki.dzien4a;

public class Zapadka {

    private boolean otwarta;


    public void zamknijZapadke()
    {
        this.otwarta = false;
    }


    public void otworzZapadke()
    {
        this.otwarta = true;
    }

    public boolean czyJestOtwarta()
    {
        return this.otwarta;
    }

}
