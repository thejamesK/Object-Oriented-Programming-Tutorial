package programowanieobiektowe;

/**
 *
 * @author Shabbadoo
 */
public class ProgramowanieObiektowe {

    public static void main(String[] args) {

        
        Test a = new Test();
        
        a.wypiszGodnosc("Jakub", "Krawczyk");
        
        Test a2 = new Test();
        
        a2.wypiszGodnosc("Agnieszka", "Sagan");
        
        
        double wynik = a.dodaj(4.15, 24.165);
        
        System.out.println(wynik);
                
    }
    
}

class Test
{
    void wypiszGodnosc(String imie, String nazwisko)
    {
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println();
    }
    
    int dodaj(int a, int b)
    {
        
        return a + b;
    }
    double dodaj(double a, double b)
    {
        
        return a + b;
    }
        
    double dzielenie(double a, double b)
    {
        if (b == 0)
            return 0;
        
        System.out.println("lalalal");
        return a / b;
    }
}

