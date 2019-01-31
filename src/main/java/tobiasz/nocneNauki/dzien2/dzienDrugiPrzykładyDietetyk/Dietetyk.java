package tobiasz.nocneNauki.dzien2.dzienDrugiPrzykładyDietetyk;

public class Dietetyk {

    public boolean obliczanieBMI(OsobaCwiczaca liczenieBMI)
    {

        double bmi = (liczenieBMI.getWaga() / ( liczenieBMI.getWzrost()*liczenieBMI.getWzrost()));

        if(bmi > 40)
        {
            return false;
        }
        else
        {
            return true;
        }


    }


}
