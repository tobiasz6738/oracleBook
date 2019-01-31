package marlena.firstLesson;

public class Human {

    //pola - czyli miejsca gdzie trzymany jest STAN obiektu
    // pola sa w 100% PRYWATNE - to znaczy, ze NIE sa dostepne z zewnatrz

    //dodaje komentarz.

    private int age;
    private String name;
    private boolean isAdult;

    // metody - czyli CZASOWNIKI (czynnosci), ktore kazdy obiekt potrafi zrobic

    // getter
    public int getAge()
    {
        return this.age;
    }

    //setter
    public void setAge(int newHumanAge)
    {
        this.age = newHumanAge;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public Human(int age, String name, boolean isAdult){
        this.age = age;
        this.name = name;
        this.isAdult = isAdult;

    }

    //



}
