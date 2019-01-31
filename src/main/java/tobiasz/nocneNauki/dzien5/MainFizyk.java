package tobiasz.nocneNauki.dzien5;

public class MainFizyk {

    public static void main(String[] args) {

        Fizyk fizyk = new Fizyk();
        new Kartka();


        fizyk.wypisywanieXRazyNapisu("Tobiasz",10);

        fizyk.wyswietlanieNapisu("Ryba", 5);

        fizyk.ocenaZadania(new Kartka());

        int ocenaZadania = fizyk.ocenaZadania(new Kartka());

        System.out.println(ocenaZadania);



    }

}
