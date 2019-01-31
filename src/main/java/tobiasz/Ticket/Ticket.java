package tobiasz.Ticket;

public class Ticket {

    // isValidate to po polsku znaczy "czy jest skasowany"
    private boolean isValidate;

    public boolean isValidate() {
        return isValidate;
    }

    public void validateTicket()
    {
        this.isValidate = true;
    }
}
