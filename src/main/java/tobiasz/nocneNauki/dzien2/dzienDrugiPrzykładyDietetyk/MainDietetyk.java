package tobiasz.nocneNauki.dzien2.dzienDrugiPrzykładyDietetyk;

public class MainDietetyk {
    public static void main(String[] args) {


        OsobaCwiczaca nowaosobaCwiczaca = new OsobaCwiczaca(93,193);
        Dietetyk dietetykRafał = new Dietetyk();

        boolean czMaszNadwage = dietetykRafał.obliczanieBMI(nowaosobaCwiczaca);

        System.out.println(czMaszNadwage);



    }
}
























