package tobiasz.Matematyka;

public class BMI {

    public static void main(String[] args) {

        double wzrost = 193;
        double waga = 95;

        double wzrostt = wzrost / 100;

        double bmi = waga / (wzrostt*wzrostt) ;

        System.out.println(bmi);

    }

}
