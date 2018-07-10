
package inheritance;

import inheritance.potwory.Monster;
import inheritance.potwory.Skeleton;
import inheritance.potwory.Zombie;

/**
 *
 * @author Shabbadoo
 */
public class Inheritance {


    public static void main(String[] args) 
    {
        
        Monster m = new Skeleton(10, 100);
        Monster m2 = new Zombie();
        
        m.attack();
                       
    }
    
    void metod(Monster monster)
    {
        
    }
    
}
