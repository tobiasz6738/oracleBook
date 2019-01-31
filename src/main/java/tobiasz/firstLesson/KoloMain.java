package tobiasz.firstLesson;

public class KoloMain {

    public static void main(String[] args) {

        Kolo czarne = new Kolo();
        Kolo zlote = new Kolo();

        czarne.setObwod(23.45);
        zlote.setObwod(43.789);


    //double wielkCzarne = Czarne.getObw();
    double wielkZlote = zlote.getObwod() ;

    System.out.println( czarne.getObwod()); //przykład
        System.out.println( wielkZlote);


    }
}
