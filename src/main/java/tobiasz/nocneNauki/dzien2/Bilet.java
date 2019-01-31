package tobiasz.nocneNauki.dzien2;

public class Bilet {

    private double cena;
    private boolean jestSkasowany;


    public boolean isJestSkasowany()
    {
        return jestSkasowany;
    }

    public void setJestSkasowany(boolean jestSkasowany)
    {
        this.jestSkasowany = jestSkasowany;
    }

    public Bilet(double cena)
    {
        this.cena = cena;
    }

    public double getCena()
    {
        return this.cena;
    }
}
//