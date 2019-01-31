package pawel.sportMan;

public class Sportman {

    private double hight;

    private double weight;




    public double calculateBmi()
    {
        double hightInMetr = this.hight / 100;
        return this.weight/(hightInMetr*hightInMetr);
    }

    public double obciazenieSztangiNaPoczatkuTreningu()
    {
        if(this.weight < 50)
        {
            return 0.2 * this.weight;
        }
        else
        {
            return 0.4 * this.weight;
        }
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
