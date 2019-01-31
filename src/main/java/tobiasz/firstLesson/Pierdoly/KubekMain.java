package tobiasz.firstLesson.Pierdoly;

public class KubekMain {
    public static void main(String[] args) {

        Kubek boss = new Kubek();

        boss.setPojemnosc(203.3);

        double pojemnoscBossa = boss.getPojemnosc();


        System.out.println("Pojemnosc Kubka Bossa");

        System.out.println(pojemnoscBossa * 2 + "ml");


    }
}
