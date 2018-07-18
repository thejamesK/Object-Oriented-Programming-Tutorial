
package wyrazenie.lambda;

 
public class WyrazenieLambda {

    public static void main(String[] args) 
    {
        ZachowaniePoWcisnieciu z = () -> {
            System.out.println("Jestem z klasy anonimowej");
        };
        
        ZachowaniePoWcisnieciu2 z2 = (a, b) -> a + b;
        
        
        Przycisk p = new Przycisk();
        
        
        p.dodajAkcje(() -> {
            System.out.println("Jestem z klasy anonimowej");
        });
        
        int wynik = p.dodajAkcje2(5, 10, z2);
        System.out.println(wynik);
    }
    
}

interface ZachowaniePoWcisnieciu
{
    void akcja();
}

interface ZachowaniePoWcisnieciu2
{
    int akcja2(int a, int b);
}

class Przycisk
{
    void dodajAkcje(ZachowaniePoWcisnieciu z)
    {
        z.akcja();
    }
    
    int dodajAkcje2(int a, int b, ZachowaniePoWcisnieciu2 z)
    {
        return z.akcja2(a, b);
    }
    
}

