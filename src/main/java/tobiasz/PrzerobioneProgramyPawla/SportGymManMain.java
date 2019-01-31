package tobiasz.PrzerobioneProgramyPawla;

public class SportGymManMain
    {

    public static void main(String[] args)
        {

        SportGymMan pawel = new SportGymMan("Pawel", true, 84.5, 189, 29, 38);
        SportGymMan tobi = new SportGymMan("Tobiasz", true, 96, 193, 31, 51);
        SportGymMan asia = new SportGymMan("Asia", false, 52, 164, 28, 20);

        PersonalTrener kazimierz = new PersonalTrener();
        Util util = new Util();

//        double tobiBMI = kazimierz.calculateBMI(tobi);
//        tobi.setBmi(tobiBMI);
//
//        pawel.setBmi(kazimierz.calculateBMI(pawel));
//        asia.setBmi(kazimierz.calculateBMI(asia));
//        double calculateBMI = tobi.calculateBMI();
//
//         sout
//        System.out.printf("%f",calculateBMI);
//        System.out.println("BMI sportmana o imieniu " + tobi.getName() + " wynosi " + calculateBMI);
//        System.out.println("BMI sportmana o imieniu " + pawel.getName() + " wynosi " + calculateBMI());

        util.wyswietlInfo(tobi);
        util.wyswietlInfo(pawel);
        util.wyswietlInfo(asia);

        }
    }
