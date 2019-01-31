package marlena.firstLesson;

public class HumanMain {

    //psvm
    public static void main(String[] args) {

        Human pawel = new Human(30,"Pawel",true);
        Human marlena = new Human(25,"Marlena", false);

        //sout
        System.out.println("Wartosc pol dla zmiennej 'pawel' to:");
        System.out.println("age = " + pawel.getAge());
        System.out.println("name = " + pawel.getName());
        System.out.println("isAdult = " + pawel.isAdult());

        pawel.setAge(29);
        pawel.setName("Pawel");

        System.out.println("");
        System.out.println("Wartosc pol dla zmiennej pawel po zmnanie to: ");
        System.out.println("Age = " +pawel.getAge());
        System.out.println("Name = " +pawel.getName());

    }
}
