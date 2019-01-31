package tobiasz.nocneNauki.dzien2;

public class Osoba {

    public double obliczCeneBiletu(Bilet biletNazwaZmiennej)
    {
        return biletNazwaZmiennej.getCena();
    }


    // to jest ZLE PODEJSCIE!!! Jestesmy wszak w swiecei OBIEKTOWYM

    public double biletty(double cena, boolean jestSkasowany)
    {
        return 0;
    }

    public void skasujBilet(Bilet biletDoSkasowania)
    {
        if(biletDoSkasowania.isJestSkasowany())
        {
            System.out.println("ten bilet jest ok");
        }
        else
        {
            System.out.println("kasuje bilet");
            biletDoSkasowania.setJestSkasowany(true);
        }
    }

}

