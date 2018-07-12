package finalkeyword;

import java.util.Date;

/**
 *
 * @author Shabbadoo
 */
public class FinalKeyword {

    public static void main(String[] args) 
    {
        final double PI;
        
        PI = 3.14;
        
        Worker w = new Worker();
        
        System.out.println(w.dataZatrudnienia);
    }
    
}

abstract class Person
{
    
}

class Worker extends Person
{
    Worker()
    {
        this.dataZatrudnienia = new Date();
    }
    Worker(Date data)
    {
        this.dataZatrudnienia = data;
    }
    
    final Date getDataZatrudnienia()
    {
        return this.dataZatrudnienia;
    }
    final Date dataZatrudnienia;
}

class Programist extends Worker
{
    
}
