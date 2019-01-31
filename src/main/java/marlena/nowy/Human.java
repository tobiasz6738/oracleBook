package marlena.nowy;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public Human()
    {

    }

    // alt + insert -> generate

    //age

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    //name

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

}
