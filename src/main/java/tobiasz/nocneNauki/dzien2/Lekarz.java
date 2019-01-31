package tobiasz.nocneNauki.dzien2;

public class Lekarz {


    public boolean czyMaszNadwage(Petent pacjentWGabinecie)
    {
        double bmi = pacjentWGabinecie.getWaga() / (pacjentWGabinecie.getWzrost() * pacjentWGabinecie.getWzrost());

        if(bmi < 20)
        {
            return false;
        }
        else
        {
            return true;
        }


    }
}
