package marlena.nowy;

public class HumanMain {

    //psvm
    public static void main(String[] args) {

        // x = 7 -9
        // Human marlena = newHuman( "Marlena", 20);
        Human marlena = new Human();

        //sout

        System.out.println("Czesc, mam na imie " + marlena.getName() + ". Mam lat" + marlena.getAge() );

        marlena.setAge(20);

        System.out.println("wiek mojego humaba to :" + marlena.getAge() );
    }
}
