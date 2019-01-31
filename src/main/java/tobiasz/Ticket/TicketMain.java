package tobiasz.Ticket;

public class TicketMain {

    public static void main(String[] args) {

        Ticket myTicket = new Ticket();

        Conductor conductor = new Conductor();

        System.out.println("Kontrola! Poprosze o bilety");
        System.out.println("");

        conductor.validateTicket(myTicket);

        System.out.println("");

        System.out.println("Ponowna kontrola! Bilety do kontroli poprosze!");
        System.out.println("");
        conductor.validateTicket(myTicket);
    }
}
