package tobiasz.newGymTobiaszPawel;

public class RecordWeightAthlete {

    private double squad;
    private double chest;
    private double back;
    private double biceps;
    private double triceps;


    public RecordWeightAthlete( double squad,double chest,double back,double biceps,double triceps)
    {
        this.squad = squad;
        this.chest = chest;
        this.back = back;
        this.biceps = biceps;
        this.triceps = triceps;
    }



    public double getSquad()
    {
        return squad;
    }

    public void setSquad(double squad)
    {
        this.squad = squad;
    }

    public double getChest()
    {
        return chest;
    }
    public void setChest(double chest)
    {
        this.chest = chest;
    }

    public double getBack()
    {
        return back;
    }
    public void setBack(double back)
    {
        this.back = back;
    }

    public double getBiceps()
    {
        return biceps;
    }
    public void setBiceps(double biceps)
    {
        this.biceps = biceps;
    }

    public double getTriceps()
    {
        return triceps;
    }
    public void setTriceps(double triceps)
    {
        this.triceps = triceps;
    }
}
