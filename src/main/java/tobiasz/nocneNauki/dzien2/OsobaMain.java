package tobiasz.nocneNauki.dzien2;

public class OsobaMain {
    public static void main(String[] args)
    {

        Osoba osoba = new Osoba();
        Bilet biletWProgramie = new Bilet(12.3);

        double cenaBiletu = osoba.obliczCeneBiletu(biletWProgramie);

        System.out.println(cenaBiletu);


        osoba.skasujBilet(biletWProgramie);
        osoba.skasujBilet(biletWProgramie);


    }
}
