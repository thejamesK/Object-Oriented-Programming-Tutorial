package programowanieobiektowe;

/**
 *
 * @author Shabbadoo
 */
public class ProgramowanieObiektowe {
    

    int blabla;
    void test()
    {
        this.blabla = 5;
    }
    public static void main(String[] args) {
//        
//        Matematyka test = new Matematyka();
//        
//        double wynik = Matematyka.dodaj(10, 15);
//        
//        System.out.println(wynik);
//        
//        System.out.println(Matematyka.PI);
        
        Klient a = new Klient("Jakub");
        Klient b = new Klient("Agnieszka");
        Klient c = new Klient("Łukasz");
        
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        
        System.out.println(Klient.nastepnyId);
        
               

    }
    
}

class Matematyka
{
    static final double PI = 3.14;
    static double dodaj(double a, double b)
    {
        return a + b;
    }
}

class Klient
{
    Klient(String imie)
    {
        this.imie = imie;
        
        id = nastepnyId;
        
        nastepnyId++;
    }
    String imie;
    int id = 0;
    static int nastepnyId = 1;
}

