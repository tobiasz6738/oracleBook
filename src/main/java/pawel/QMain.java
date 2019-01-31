package pawel;

public class QMain {

    public static void main(String[] args) {
        Questionnaire questionnaire = new Questionnaire();

        questionnaire.setName("Paweł");

        questionnaire.setWoman(false);


        System.out.println("Masz na imie " + questionnaire.getName());
        System.out.println("Czy jestes kobieta? " + " Moja odpowiedz to: " + questionnaire.isWoman());


    }
}
