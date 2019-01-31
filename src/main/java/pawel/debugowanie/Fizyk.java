package pawel.debugowanie;

public class Fizyk {


    public void wyswietlNapisaXRazy(String napisaDoWyswietlenia, int iloscWyswietlen)
    {
        for(int i =0; i < iloscWyswietlen; i++)
        {
            System.out.println(i + ", " + napisaDoWyswietlenia);
        }
    }


    public void wyswietlNapisXRazyZNiespodzianka(String napis, int ilosc)
    {

        for(int i = 0; i < ilosc; i++)
        {
            if(i == 1)
            {
                System.out.println("AKUKU!");
            }
            else
            {
                System.out.println(napis);
            }
        }

    }

}
