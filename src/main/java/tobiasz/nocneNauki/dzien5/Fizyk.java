package tobiasz.nocneNauki.dzien5;

public class Fizyk {

   public int ocenaZadania(Kartka kartkowkaDoSprawdzenia)
   {
       if(kartkowkaDoSprawdzenia.isOdpowiedz())
       {
           return 6;
       }
       else
       {
           return 1;
       }

   }

    public void wypisywanieXRazyNapisu(String imie, int iloscIteracji)
    {
        //int i;
        for (int i = 1; i <= iloscIteracji; i ++)
            {
                System.out.println(i + imie );
            }
    }

    public void wyswietlanieNapisu(String napis, int iloscIteracji)
    {
        for(int i = 1; i < iloscIteracji; i++)
        {
            if(i == 2)
            {
                System.out.println("Akuku");
            }
            else
            {
                System.out.println(napis);
            }
        }
    }




}
