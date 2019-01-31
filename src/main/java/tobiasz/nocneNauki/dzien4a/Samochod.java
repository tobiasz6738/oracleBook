package tobiasz.nocneNauki.dzien4a;

public class Samochod
{
    private Radio radioOpla;
    private SystemNapedowy napedSeata;

    private boolean dzialaSilnik;


    public Samochod() {

        this.radioOpla = new Radio();
        this.napedSeata = new SystemNapedowy();

    }

    public void radiogra()
    {

        this.radioOpla.graj();

    }


    public void SilnikDziala()
    {
        this.dzialaSilnik = true;


    }

    public void SilnikNiedziala()
    {
        this.dzialaSilnik = false;
    }

    public void brykaJedzie()
    {
        if(dzialaSilnik)
        {
            this.napedSeata.napedzajAuto();
        }
        else
        {
            System.out.println("");
            System.out.println("Samochod zepsuty");
        }
    }



}
