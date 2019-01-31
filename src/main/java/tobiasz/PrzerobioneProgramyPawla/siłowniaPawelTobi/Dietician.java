package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;

public class Dietician {

    public double calculateBMI(Sportowiec sportowiec)
    {
        double hight = sportowiec.getMojeDanePersonalne().getHigh() / 100;
        double weight = sportowiec.getMojeDanePersonalne().getWeight();
        return weight / (hight * hight);
    }

}
