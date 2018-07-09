package programowanieobiektowe;

/**
 *
 * @author Shabbadoo
 */
public class ProgramowanieObiektowe {

    public static void main(String[] args) {
        
        Monitor abc = new Monitor();
        abc.szerokosc = 124;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 215;
        
        System.out.println(abc2.szerokosc);
        System.out.println(abc.szerokosc);
    }
    
}

class Monitor
{
    int szerokosc;
    int wysokosc;
    
}
