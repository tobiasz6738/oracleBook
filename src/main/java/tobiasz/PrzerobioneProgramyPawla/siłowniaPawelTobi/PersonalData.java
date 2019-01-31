package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;

public class PersonalData {

    private String name;
    private int age;
    private double high;
    private double weight;
    private double bmi;

    public PersonalData(String name, int age, double high, double weight)
    {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public double getHigh()
    {
        return high;
    }

    public void setHigh(double high)
    {
        this.high = high;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getBmi()
    {
        return bmi;
    }

    public void setBmi(double bmi)
    {
        this.bmi = bmi;
    }
}
