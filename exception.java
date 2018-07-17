
package wyjatek;

/**
 *
 * @author Shabbadoo
 */
public class Wyjatek {

    public static void main(String[] args) 
    {
        int a = 10;
        try
        {

            
            System.out.println(5/0);
            
            if(a == 10)
                throw new NaszWyjatek("a jest rowne 10, grzeszysz");
        }
        catch(NaszWyjatek ex)
        {
            System.out.println(ex.getMessage());
        }
        
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            System.out.println(5/1);
        }
        catch(Exception ex)
                {
                    System.out.println("Powstal wyjatek: " + ex.getMessage());
                }
        finally
        {
            System.out.println("COS CO ZAWSZE ZOSTANIE WYWOŁANE`");
        }
        
        System.out.println("cokolwiek");
        
        
    }

    
}

class NaszWyjatek extends Exception
{

    public NaszWyjatek(String string) 
    {
        super(string);
        
    }
    
}
