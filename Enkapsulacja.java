package enkapsulacja;

/**
 *
 * @author Shabbadoo
 */
public class Enkapsulacja {

    public static void main(String[] args) {
        
        kontoBankowe oszczednosciowe = new kontoBankowe();
        oszczednosciowe.wplac(5000);
        
        if(oszczednosciowe.wyplac(4244))
        {
            System.out.println("wyplacono");
        }
        else
            System.out.println("za malo kasy");

        System.out.println(oszczednosciowe.getSaldo());

    }
    
}

class kontoBankowe
{
    public kontoBankowe()
    {
        saldo = 1000;
    }
    
    private int saldo;
    
    int getSaldo()
    {
        return saldo;
    }
    
    private boolean setSaldo(int saldo)
    {
        /*
        WARUNKI!!
        */
        this.saldo = saldo;
        
        return true;
    }
    
    
    boolean wyplac(int ile)
    {
        if(saldo < ile)
            return false;
        else
            setSaldo(saldo - ile);
        
        return true;
    }
    
    boolean wplac(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}
