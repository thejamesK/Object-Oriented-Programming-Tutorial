
package bottle;

/**
 *
 * @author Shabbadoo
 */
public class Bottle {

    private double howManyLiters;
    private double capacity;
    
    Bottle()
    {
        
    }
    
    Bottle(double howManyLiters)
    {
        this.howManyLiters = howManyLiters;
    }
        
    double getHowManyLiters()
    {
        return howManyLiters;
    }
    
    boolean pour(double howMany)
    {
        if((this.howManyLiters + howMany) <= capacity)
            this.howManyLiters += howMany;
        else if (this.howManyLiters + howMany > capacity)
        {
            this.howManyLiters = capacity;          
        }
        else
            return false;
        
        
        return true;
        
    }
    
    boolean pourOut(double howMany)
    {
        if(howMany < howManyLiters)
            this.howManyLiters -= howMany;
        else
            return false;
        
        return true;
    }
    
    void decant(double howMany, Bottle where)
    {
        if(this.pourOut(howMany))
        {
            where.pour(howMany);
        }
        else
            System.out.println("Too little");
        
     
    }
    
    
    
    public static void main(String[] args) {

        Bottle[] bottle = new Bottle[50]; //NULL
        
        for(int i = 0; i < 10; i++)
        {
            bottle[i] = new Bottle(7);
            bottle[i].capacity = 10;
        }
        
        bottle[0].pour(2);
        
        System.out.println(bottle[0].getHowManyLiters());
        System.out.println("");
        
        bottle[0].decant(4, bottle[5]);
        
        for(int i = 0; i < 10; i++)
        {
           System.out.println(bottle[i].getHowManyLiters()); 
        }
        
    }
    
}


