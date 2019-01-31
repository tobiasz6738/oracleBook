package tobiasz.Ticket;

public class Conductor {


    // validateTicket to po polsku 'skasuj ilet'
    public void validateTicket(Ticket ticketToValidate)
    {

        //isValidate to to samoe co getValidte ale dla zmiennej typu boolean
        if(ticketToValidate.isValidate())
        {
            System.out.println("Twoj bilet jest juz skasowany!");
            System.out.println("Dostajesz mandat");
        }
        else
        {
            System.out.println("Ten bilet nie jest skasowany.");
            System.out.println("Juz go kasuje");

            ticketToValidate.validateTicket();
        }
    }
}
