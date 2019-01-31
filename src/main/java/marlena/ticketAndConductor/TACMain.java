package marlena.ticketAndConductor;

public class TACMain {

    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Conductor conductor = new Conductor();
        Passenger tobiasz = new Passenger("Tobiasz");

        tobiasz.setTicket(ticket);


        System.out.println("Dzien dobry! Kontrola biletow!");
        System.out.println("");

        conductor.controlPassenger(tobiasz);

        System.out.println("");
        System.out.println("Ilosc kart pasazera to: " + tobiasz.getIloscKar());

        System.out.println("");

        System.out.println("Kolejna kontorla! Tych samych!! biletow");
        System.out.println("");

        conductor.controlPassenger(tobiasz);
        System.out.println("");
        System.out.println("Ilosc kart pasazera to: " + tobiasz.getIloscKar());


    }
}
