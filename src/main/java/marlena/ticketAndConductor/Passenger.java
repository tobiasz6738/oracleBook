package marlena.ticketAndConductor;

public class Passenger {

    private String name;
    private int iloscKar;
    //private Mandat mandat;

    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int addIKara() {
        return iloscKar++;
    }

    public void setIloscKar(int iloscKar) {
        this.iloscKar = iloscKar;
    }

    public int getIloscKar() {
        return iloscKar;
    }
}
