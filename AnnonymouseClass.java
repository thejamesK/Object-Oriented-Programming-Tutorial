
package klasyanonimowe;

public class KlasyAnonimowe {

    public static void main(String[] args) 
    {
//        ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
//            @Override
//            public void akcja() {
//                System.out.println("Jestem z klasy anonimowej");
//            }
//        };
        
        Przycisk p = new Przycisk();
        
        p.dodajAkcje(new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        });
    }
    
}
interface ZachowaniePoWcisnieciu
{
    void akcja();
}

class Przycisk
{
    void dodajAkcje(ZachowaniePoWcisnieciu z)
    {
        z.akcja();
    }
    
}

