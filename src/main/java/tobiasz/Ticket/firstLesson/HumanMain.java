package firstLesson;

import java.util.Scanner;

public class HumanMain {


    //psvm
    public static void main(String[] args) {

        Human pawel = new Human();

        System.out.println("Podaj Twoj wiek");
        Scanner sc = new Scanner(System.in);
        int wiekPobrarnyZKonsoli = sc.nextInt();


        pawel.setAge(wiekPobrarnyZKonsoli);

        int wiekPawla = pawel.getAge();


        //sout
        System.out.println("Twoj wiek, ktory podales w konsoli to:");
        System.out.println(wiekPawla);


    }


}
