package marlena.ticketAndConductor;

public class Conductor {

    public void controlPassenger(Passenger passengerToControl)
    {

        if(passengerToControl.getTicket().isValidate())
        {
            System.out.println("Panie " + passengerToControl.getName() + "! Ten bilet jest skasowany!");
            System.out.println("Dostajesz mandat");
            passengerToControl.addIKara();
        }
        else
        {
            System.out.println("Dziekuje - wlasnie kasuje bilet");
            passengerToControl.getTicket().setValidate(true);
        }

    }
}
