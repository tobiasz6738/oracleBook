package firstLesson;

public class KoloMain {

    public static void main(String[] args) {

        Kolo Czarne = new Kolo();
        Kolo Zlote = new Kolo();

        Czarne.setObw(23.45);
        Zlote.setObw(43.789);


    double wielkCzarne = Czarne.getObw();
    double wielkZlote = Zlote.getObw();

    System.out.println( wielkCzarne);
        System.out.println( wielkZlote);


    }
}
