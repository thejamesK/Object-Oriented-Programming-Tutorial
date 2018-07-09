package programowanieobiektowe;

/**
 *
 * @author Shabbadoo
 */
public class ProgramowanieObiektowe {
    int a;
    static void test()
    {
        System.out.println("aaaaaaaaaa");        
    }

    public static void main(String[] args) {
        
        
        test();
        Monitor abc = new Monitor();
        abc.szerokosc = 124;
        Monitor abc2 = new Monitor();
        abc2.szerokosc = 215;
        
        System.out.println(abc2.szerokosc);
        System.out.println(abc.szerokosc);
        
        String imie = "Jakub";
        
    }
    
}

class Monitor
{
    int szerokosc;
    int wysokosc;
    
    void wlacz()
    {
      /*
        
        */  
    }
    
    void wylacz()
    {
        /*
        
        */
        
    }
   
    
}
