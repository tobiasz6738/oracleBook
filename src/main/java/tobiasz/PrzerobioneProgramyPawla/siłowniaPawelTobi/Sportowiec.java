package tobiasz.PrzerobioneProgramyPawla.siłowniaPawelTobi;

public class Sportowiec {


    // pola sa w 99% prywatne! 2.0
    private PersonalData mojeDanePersonalne;
    private Records mojPoczatkowyRekord;


    public Sportowiec(String name, int age, double high, double weight)
    {
        this.mojeDanePersonalne = new PersonalData(name, age, high, weight);
    }

    public void ustawRekord(double squat, double chest, double back, double biceps, double triceps)
    {
        this.mojPoczatkowyRekord = new Records(squat, chest, back, biceps, triceps);
    }

    public PersonalData getMojeDanePersonalne()
    {
        return mojeDanePersonalne;
    }

    public void setMojeDanePersonalne(PersonalData mojeDanePersonalne)
    {
        this.mojeDanePersonalne = mojeDanePersonalne;
    }

    public Records getMojPoczatkowyRekord()
    {
        return mojPoczatkowyRekord;
    }

    public void setMojPoczatkowyRekord(Records mojPoczatkowyRekord)
    {
        this.mojPoczatkowyRekord = mojPoczatkowyRekord;
    }


}
