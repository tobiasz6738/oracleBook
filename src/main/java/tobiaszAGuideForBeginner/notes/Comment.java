package tobiaszAGuideForBeginner.notes;

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
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [Page 103]

    co to jest Klasa

        - jest szeblonem definjujacym klase
        - okresla dane obiektu jak i kod ktory dziala na tych danych
        - Java uzywa specyfikacji klasy podczas tworzenia obiektu
        - obiekty sa instancjami klasy ( innymi slowy klasa jest zestawem planow okreslajacych sposob konstrukcji obiekyu.
        - fizyczna reprezetacja klasy w pamieci komputera powstanie dopiero na skutek utworzenie obiektu tej klasy.
            -zmienne i metody tworzace klase nazywamy skladowymi klasy.

   pamiętaj!

        Klasa stanowi jedynie opis typu i nie tworzy zadnego obiektu. Aby utworzyc obiekt trzeba uzyc nastepujacej instrukcji
            - Vehicle minivan = new Vehicle(); // tworzymy obiekt typu Vehicle o nazwie minivan
                (po wykonaniu tej instrukcji minivan bedzie instancja klasy Vehicle, i bedzie posiadal fizyczna reprezentacje w pamieci komputera.

        Za kazdym razem gdy tworzymy instancje klasy, powstaje obiekt zawierajacy wlasna kopie kazdej zmiennej skladowej zdefiniowanej przez klase.
            zatem kazdy obiekt typu vehicle bedzie zawierac wlasna kopie zmiennych skladowych. Dostep do tych zmiennych mamy poprzez
            operator zapisny za pomoca kropki (.). Operator ten laczy nazwe obiektu z nazwą zmiennej skladowej.
                np: obiekt.skladowa

 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*[Page 105]

      Objekt ( tworzenie obiektow )

      Vehicle minivan = new Vehicle();

        - deklaruje zmienna typu Vehicle
        - sama zmienna jeszcze nie definiuje obiektu a jedynie moze zawierac refencje
        - tworzy instancje obiektu i przypisuje zmiennej minivan referencje do tego obiektu.
            (odobywa sie to poprzez operator new)
        - operator new dynamiczne (czyli w trakcie działania ) przydziele pamiec dla obiektu i zwraca jego referencje ta jest de facto
                adresem obiektu utworzonego w pamieci za pomoca instrukcji new. Zostaje ona prypisana zmiennej.
                W języku Java wszystkie obiekty tworzone sa dynamicznie.


 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*[Page 106]

        Metoda

        - metody sa podprogramami dzialajacymi na danych zdefinowanych w klasie oraz w wielu przypadkach udostepniajacymi
            te dane.
        - W wiekszosci przypadkow pozostale czesci programu komunikuja sie z klasa za posrednictwemjej Metod.
        - metoda zawiera jedna lum wiele instrukcji
        - metoda powinna wykonywac jedno zadanie
        - kazda metoda ma nazwe za pomoca ktorej ja wywolasz

        Parametry Metody( metoda moze miec parametry lum ich nie posiadc)

        - parametry metody sa wlasciwie zmiennymi, ktore otrzymuja wartosc argumentow przekazanych metodzie podczas jej wywolania.

        Stosowanie parametrow

        - mozna przekazac metodzie jedna lub wiecej wartosci
        - wartosc przekazywane metodzie nazywamy argumentami
        - zmienne ktore otrzymuja wartosci nazywamy parametrami
            - parametry metody deklarujemy wewnatrz nawiasow okraglych
            - skladnia parametrow jest taka sama jak zwyklych zmiennych
            - parametry naleza do zasiegu metody i pomijajac fakt ze otrzymuje wartosc argumentu wywolania metody, poza tym zachowuje sie jak karzda inna metoda.

        Pod wzgledem zwracania metod
        - metody dzielimy na dwa rodzaje (void) i (zwracajace cos + na koncu return [zawsze to jaki jest typ metody)
               - void (czyli nic nie zwraca ) konczy sie na ostatnim nawiasie metody lub jak damy return; [czyli return kture nic nie zwraca]
               - takie co zwracaja jakas wartosc np ( int,double,String i itd).



 *///
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [page 117] Konstruktor

        - zadania konstruktora jest inicjalizacja obiektu podczas jego tworzenia.
        - konstruktor ma taka sama nazwe jak klasa
        - jest podobny do metody
        - konstruktory nie maja typu zwracanego
        - zwykle nadaja poczatkowe wartosci zmiennym
        - zawsze jest tworzony konstruktor domyslny chyba ze zdefiniujemy wlasny to domyslny sie nie utworzy

 *////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [page 120] Operator new

        - typ zmiennej  zmienna referencyjna =  new nazwa-klasy(argumenty jsli jest konstruktor)

        - typ musi byc typ tworzonego obiektu
        - nazwa klasy po kturej nastepuje lista argumentow umieszczona w nawiasach(moze byc pusta)okresla to konstruktor.
        - jesli klasa nie okresla wlasnego konstruktora new dostanie domyslnego konstruktora
        - new moze byc uzywany do tworzenia obiektow kazdej klasy.

 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* [page 121] slowo kluczowe this

        - słowo this powoduje ze mamy dostep do zmiennych (na samej gurze a nie lokalnych )

 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*

 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*



 */


