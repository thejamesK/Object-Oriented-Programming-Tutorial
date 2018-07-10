/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.potwory;

/**
 *
 * @author Shabbadoo
 */
public class Skeleton extends Monster
{
    @Override
    public void attack()
    {
        super.attack();
        /*
        
        Additional attacks
        */
        System.out.println("This is attack metod from Skeleton class");
    }
    
    String Weapon;
    public Skeleton()
    {
        System.out.println("Default constructor from Skeleton class");
    }
    
    
        public Skeleton(double walkingSpeed, double hitPoints)
    {
        super(walkingSpeed, hitPoints);
        System.out.println("Not default constructor from Skeleton class with two arguments");
    }
    
    public Skeleton(double walkingSpeed, double hitPoints, String Weapon)
    {
        super(walkingSpeed, hitPoints);
        this.Weapon = Weapon;
        System.out.println("Not default constructor from Skeleton class");
    }

    @Override
    protected void description() 
    {
        
    }
}
