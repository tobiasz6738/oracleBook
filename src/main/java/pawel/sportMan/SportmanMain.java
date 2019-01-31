package pawel.sportMan;

import java.util.Scanner;

public class SportmanMain {

    public static void main(String[] args) {


        System.out.println("Witam Ciebie!");
        System.out.println("Jak masz na imie?");

        Scanner scanner = new Scanner(System.in);

        String imieKlienta = scanner.nextLine();

        System.out.println("");
        System.out.println("Witaj " + imieKlienta + "! Milo mi ze tu jestes");
        System.out.println("");
        System.out.println("Teraz poprosze Cie o podanie Twojego wzrostu oraz wagi. Te dane beda mi potrzebne do obliczenia Twojego BMI oraz innych ciekawych rzeczy :) ");
        System.out.println("Ile masz wzorstu? (w cm)");
        double wzrostKlienta = scanner.nextDouble(); //kdkd
        System.out.println("Ile wazysz? (W kg)");
        double wagaKlienta = scanner.nextDouble();
        System.out.println("");

        System.out.println("Wybronie! Teraz stworze obiekt Sportowiec. Ustawie mu wage i wzrost korzystajac z danych podanych przez Ciebie");

        Sportman sportman= new Sportman();
        sportman.setHight(wzrostKlienta);
        sportman.setWeight(wagaKlienta);

        System.out.println("");
        System.out.println("A teraz gwozdz programu!!! Korzystajac z METOD obiektu klasy Sportowiec oblicze Twoje BMI oraz obiciazenie sztangi na samym poczatku Twojego treningu");

        double bmiKlienta = sportman.calculateBmi();
        double poczatkoweObciazenie = sportman.obciazenieSztangiNaPoczatkuTreningu();

        System.out.println("");
        System.out.println("A wiec juz wszystko jasne! ");
        System.out.println("Twoje bmi wynosi: " + bmiKlienta);
        System.out.println("A trening zaczniesz od podniesienia sztangi o wadze " + poczatkoweObciazenie + "kg");
    }
}
