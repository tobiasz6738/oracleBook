package tobiasz.newGymTobiaszPawel;  //folder w ktorym jest program

public class Athlete {  //klassa

    private PersonalDataAthlete daneOsoboweAtlety;  //Pola 99,9% PRIVATE!!
    private RecordWeightAthlete maksymalneCiezaryAtlety; //Pola 99,9% PRIVATE!!



    public Athlete(String name, int age, double high, double weigh)
    {
        this.daneOsoboweAtlety = new PersonalDataAthlete(name,age,high,weigh);
    }

    public void UstawMAX(double squad,double chest, double back, double biceps, double triceps)
    {
        this.maksymalneCiezaryAtlety = new RecordWeightAthlete(squad,chest,back,biceps,triceps);
    }



    public PersonalDataAthlete getDaneOsoboweAtlety()
    {
        return daneOsoboweAtlety;
    }
    public void setDaneOsoboweAtlety(PersonalDataAthlete daneOsoboweAtlety)
    {
        this.daneOsoboweAtlety = daneOsoboweAtlety;
    }

    public RecordWeightAthlete getMaksymalneCiezaryAtlety()
    {
        return  maksymalneCiezaryAtlety;
    }

    public void setMaksymalneCiezaryAtlety(RecordWeightAthlete maksymalneCiezaryAtlety)
    {
        this.maksymalneCiezaryAtlety = maksymalneCiezaryAtlety; //
    }

}
