package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;

public class Records {

    private double squat;
    private double chest;
    private double back;
    private double biceps;
    private double triceps;

    public Records(double squat, double chest, double back, double biceps, double triceps)
    {
        this.squat = squat;
        this.chest = chest;
        this.back = back;
        this.biceps = biceps;
        this.triceps = triceps;
    }


    public double getSquat()
    {
        return squat;
    }

    public void setSquat(double squat)
    {
        this.squat = squat;
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
