package tobiasz.nocneNauki.dzien2;

public class LekarzMain {

    public static void main(String[] args)
    {

        Lekarz drKowalkis = new Lekarz();
        Petent pacjent = new Petent(45, 1.9);


        boolean czyMaszNadwage = drKowalkis.czyMaszNadwage(pacjent);


        System.out.println(czyMaszNadwage);


    }
}
