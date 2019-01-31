package tobiasz.nocneProgramowanieJavaTobiszAlone.dzienPierwszy;

public class MatematykaTobiaszMain {


    public static void main(String[] args)
    {
        MatematykaTobiasz matematykaTobiasz = new MatematykaTobiasz();

        Kwadrat kwadrat = new Kwadrat(14.7);

        double poleKw = matematykaTobiasz.pole(kwadrat);
        double poleKw2 = matematykaTobiasz.pole(new Kwadrat(8.8));


//        double bok = kwadrat.bok();

        // wstep do obiektow

        double poleKwadratu = matematykaTobiasz.poleKwadratu(4.4);
        System.out.println("");
        System.out.println(poleKwadratu);
        System.out.println("");
        System.out.println(poleKw);
        System.out.println(poleKw2);
        System.out.println("");

//
        // operacje na prymitywnych wartosciach

        int dodawanie = matematykaTobiasz.dodawanie(3,7);
        double odejmowanie = matematykaTobiasz.odejmowanie(6, 3);
        int mnozenie = matematykaTobiasz.mnozenie(3, 7);
        double dzielenie = matematykaTobiasz.dzielenie(4, 2);
        int wiekszaMniejsza = matematykaTobiasz.wiekszaMniejsza(6, 2);
        double procent = matematykaTobiasz.procent(50,95);
        double bezwzgledna = matematykaTobiasz.wartoscBezwzgledna(3, false);

        System.out.println("dodawanie " + dodawanie);
        System.out.println("odejmowanie " + odejmowanie);
        System.out.println("mnozenie " + mnozenie);
        System.out.println("divisionForTwo " + dzielenie);
        System.out.println("wiekszaMniejsza " + wiekszaMniejsza);
        System.out.println("procent " + procent +"%");
        System.out.println("booblan " + bezwzgledna);



    }

}
