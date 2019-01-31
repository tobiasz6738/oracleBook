package tobiasz.PrzerobioneProgramyPawla;

public class PersonalTrener
    {


    public double calculateBMI(SportGymMan sportowiecDoObliczenia)
        {
        double dupa = sportowiecDoObliczenia.getHight() / 100;
        double weight = sportowiecDoObliczenia.getWeight();
        return weight / (dupa * dupa);
        }

    public double squatWeight(SportGymMan obliczaniePrzysadow)
        {
        int ilosc = obliczaniePrzysadow.getAmount();
        double waga = obliczaniePrzysadow.getWeight();

        if (ilosc > 15)
            {
            return waga * 1.2;
            } else
            {
            return waga;
            }

        }
    }
