package tobiasz.newGymTobiaszPawel;

public class PersonalDataAthlete {

    private String name;
    private int age;
    private double high;
    private double weight;
    private double x ;
    private double y ;


    public PersonalDataAthlete(String name,int age,double high,double weight)
    {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
    }



    public String getNeme()
    {
        return name;
    }

    public void setNeme(String neme)
    {
        this.name = neme;
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
































}
