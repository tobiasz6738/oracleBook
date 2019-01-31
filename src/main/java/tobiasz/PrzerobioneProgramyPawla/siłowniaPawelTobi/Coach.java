package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;

public class Coach {


    public void obliczTrenignPierwszegoDnia(Sportowiec hipotetycznySportowiec)
    {
        System.out.println("Przysiad = " + hipotetycznySportowiec.getMojPoczatkowyRekord().getSquat() * 0.75 );
        System.out.println("Klatka = " + hipotetycznySportowiec.getMojPoczatkowyRekord().getChest() * 0.75 );
        //TODO: write sout for aother properties
    }

//        public double firstday1(Coach squadp)
//            {
//                return squat * 0.75;
//            }
//        public double firstday2(Coach chestp)
//            {
//                return chest * 0.75;
//            }
//        public double firstday3(Coach backp)
//            {
//                return back * 0.75;
//            }
//        public double firstday4(Coach bicepsp)
//            {
//                return biceps * 0.75;
//            }
//        public double firstday5(Coach tricepsp)
//            {
//                return triceps * 0.75;
//            }



}
