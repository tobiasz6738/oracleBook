package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;


public class TrainingPawelTobiaszMain {
    public static void main(String[] args)
    {
        Coach superTrener = new Coach();
        Dietician superDietician = new Dietician();

        Sportowiec tobiasz = new Sportowiec("Tobiasz", 30, 193, 96);
        tobiasz.ustawRekord(61, 56, 52, 32, 40);


        superTrener.obliczTrenignPierwszegoDnia(tobiasz);


    }


}
