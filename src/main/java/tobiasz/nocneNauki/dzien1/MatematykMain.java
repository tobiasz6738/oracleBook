package tobiasz.nocneNauki.dzien1;

public class MatematykMain {


    public static void main(String[] args)
    {

        Matematyk pitagoras = new Matematyk();
        Kwadrat kwa = new Kwadrat(19);


        int suma = pitagoras.obliczSume(2, 6);
        double odejmowanie = pitagoras.obliczOdejmowanie(4, 9.8);
        double mnozenie = pitagoras.obliczMnozenie(10, 4.6);
        double dzielenie = pitagoras.obliczDzielenie(32, 0);
        double obliczObwodTrojkat = pitagoras.obliczObwodTrojkat(3, 4, 6);

        System.out.println(suma);
        System.out.println(odejmowanie);
        System.out.println(mnozenie);
        System.out.println(dzielenie);
        System.out.println(obliczObwodTrojkat);
        System.out.println(kwa);
    }



}
