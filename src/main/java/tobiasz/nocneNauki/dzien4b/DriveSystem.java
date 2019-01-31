package tobiasz.nocneNauki.dzien4b;

public class DriveSystem {

    private Engine EnginDiesel;
    private Shaft DriveShaft; //wał napędowy


    public DriveSystem()
    {
        this.EnginDiesel = new Engine();
        this.DriveShaft = new Shaft();

    }

    public void driveDrive()
    {

        this.DriveShaft.shaft();
        this.EnginDiesel.engine();
    }






}
