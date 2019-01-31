package tobiasz.nocneNauki.dzien3;

public class MainLampa {

    public static void main(String[] args) {

        Lampa lampa = new Lampa();
        lampa.setRadioWLampie(new Radio());

        lampa.wlaczLampe();
        lampa.zaswiecSwiatlo();

        lampa.wylaczLampe();
        lampa.wlaczMuzyke();


//        Zarowka zarowka = new Zarowka();
//
//        zarowka.swiec();
    }


}
