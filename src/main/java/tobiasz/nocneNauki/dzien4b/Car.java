package tobiasz.nocneNauki.dzien4b;

public class Car {

    private DriveSystem OpelDriveSystem;
    private Radio OpelAudioSystem;
    private boolean StartingEngine;



    public Car()
    {
        this.OpelAudioSystem = new Radio();
        this.OpelDriveSystem = new DriveSystem();
    }

    public void radioPlay()
    {

        this.OpelAudioSystem.radio();

    }



    public void startingEngine()
    {
        this.StartingEngine = true;
    }

    public void notStartingEngine()
    {
        this.StartingEngine = false;
    }

public void carDriveDrive()
    {
        if(StartingEngine)
        {
            this.OpelDriveSystem.driveDrive();
        }
        else
        {
            System.out.println("");
            System.out.println("Samochod zepsuty");
        }
    }

}
