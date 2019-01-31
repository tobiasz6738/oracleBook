package tobiasz.nocneNauki.dzien3;

public class Lampa {

    private Zarowka zarowkaWLampie;
    private Radio radioWLampie;

    private boolean jestWlaczona;


    public Lampa() {
        this.zarowkaWLampie = new Zarowka();
    }


    public void wlaczLampe()
    {
        this.jestWlaczona = true;
    }

    public void wylaczLampe()
    {
        this.jestWlaczona = false;
    }


    public void zaswiecSwiatlo()
    {
        if(jestWlaczona)
        {
            this.zarowkaWLampie.swiec();
        }
        else
        {
            System.out.println("Lampa jest wylaczona! Wlacz lampe!");
        }
    }

    public void wlaczMuzyke()
    {
        if(jestWlaczona)
        {
            this.radioWLampie.graj();
        }
        else
        {
            System.out.println("Lampa jest wylaczona! Wlacz lampe!");
        }
    }

    public void setRadioWLampie(Radio radioWLampie) {
        this.radioWLampie = radioWLampie;
    }
}
