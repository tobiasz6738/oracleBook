package firstLesson;

public class Human {


    //pols -> czyli cechy, ktore kazdy Human bedzie posiadac
    // kwalifikatorDostepu ___  typ ___ nazwaZmiennej
    private int age;



    //metody -> czyli czynnosci, ktore kazdy Human bedzie umial wykonac
    //kwalifikatorDostepu ___ typKtoryZwracaFunkcja ___ nazwa ___ (parametry)
    public int getAge()
    {
        return this.age;
    }


    public void setAge(int podanyWiek)
    {
        this.age = podanyWiek;
    }






}
