package tobiaszAGuideForBeginner.chapter1.notes;

public class Comment {

}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 34/35]

    - Zmienna(variable) ~ stanowi reprezentacje lokalizacji w pamieci, w ktorej mozna umiesci pewna wartosc.

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 35]

    - Instrukcja ~ np int var1; ( zawiera deklaracje zmiennej var1 typu całkowitego )
    - W jezyku Java musisz zadeklarowac kazda zmienna zanim zaczniesz ja uzywac. Co wiecej musisz okreslic typ wartosci,
        ktore moze ona przechowywac, czyli typ zmiennej.

    - W jezyku Java operatorem przypisania jest ' = '. Wartosc z prawej strony jest przypisana do zmiennej z lewej strony.

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 36]

    - Jedna instrukcja deklaracji mozna zawierac deklaracje dwu lub wiecej zmiennych.
        np: int x,y,z;

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 38]

    - Instruction if ~ okresla tok realizacji programu zaleznie od tego czy podany warunek zostanie spelniony czy nie.
        - if(wyrazenie logiczne dajacy wynik true or false).

if(condition)
    {
        instruction;
    }

if(3 > x)
    {
        System.out.println("text");
    }



 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 40]

for loop:

    for(initialization; condition; iteration)
    {
        instruction
    }
    for(i = 0; i < 5; i++)
    {
        return i;
    }

   - Najczesciej inicjalizacja sprowadza sie do nadania wartosci poczatkowej petli.
   - Warunek jest wyrazeniem logicznym sprawdzajacym wartosc zmiennej sterujacej.
        - Jesli wyrazenie jest spelnione (prawdziwe), zostaje wykonana instrukcja, a petla for kontynuuje itaracje.

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 41]

    Blok Kodu

    -Blok kodu ~ przez blok kodu rozumiemy grupe dwu lub wiecej instrukcji.
    np:
        if(i<4)
        {
            v = w * h;
            w = 0;
        }

 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
