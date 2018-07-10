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
public abstract class Monster {
    
    protected double walkingSpeed;
    protected double hitPoints;
    
    public void attack()
    {
        /*
        BAZOWE INSTRUKCJE ATAKU
        */
     
        System.out.println("This is attack metod from Monster class");
    }
    abstract protected void description();

    
    public Monster()
    {
        System.out.println("Default constructor from Monster class");
    }
    
    public Monster(double walkingSpeed, double hitPoints)
    {
        this.walkingSpeed = walkingSpeed;
        this.hitPoints = hitPoints;
        System.out.println("Not default constructor from Monster class");
        
    }
    
    
}
