package tobiasz.PrzerobioneProgramyPawla;

public class SportGymMan
    {

    private String name;
    private boolean isMan;
    private double weight;
    private double hight;
    private int age;
    private double squadweight;
    private int amount;
    private double bmi;


    public SportGymMan(String name, boolean isMan, double weight, double hight, int age, double squadweight)
        {
        this.name = name;
        this.isMan = isMan;
        this.weight = weight;
        this.hight = hight;
        this.age = age;
        this.squadweight = squadweight;
        }

    public double getBmi()
        {
        return bmi;
        }

    public void setBmi(double bmi)
        {
        this.bmi = bmi;
        }


    public double calculateWeightSquads()
        {
        if (this.amount >= 15)
            {
            return 1.16 * squadweight;
            } else
            {
            return squadweight;
            }
        }


    public double startWeightbar()
        {

        if (this.weight < 63)
            {
            return 0.3 * weight;
            } else
            {
            return 0.6 * weight;
            }
        }

    public double weightage()
        {

        if (this.age < 25)
            {
            return 0.6 * weight;
            }
        if (this.age > 90)
            {
            return 0.1 * weight;
            } else
            {
            return 0.4 * weight;
            }
        }

    public int getAmount()
        {
        return amount;
        }

    public void setAmount(int amount)
        {
        this.amount = amount;
        }

    public double getSquadweight()
        {
        return squadweight;
        }

    public void setSquadweight(double squadweight)
        {
        this.squadweight = squadweight;
        }

    public String getName()
        {
        return name;
        }

    public void setName(String name)
        {
        this.name = name;
        }

    public double getWeight()
        {
        return weight;
        }

    public void setWeight(double weight)
        {
        this.weight = weight;
        }

    public double getHight()
        {
        return hight;
        }

    public void setHight(double hight)
        {
        this.hight = hight;
        }

    public int getAge()
        {
        return age;
        }

    public void setAge(int age)
        {
        this.age = age;
        }

    public boolean isMan()
        {
        return isMan;
        }

    public void setMan(boolean man)
        {
        isMan = man;
        }
    }
//