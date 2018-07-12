
package classobject;

/**
 *
 * @author Shabbadoo
 */
public class ClassObject {

    public static void main(String[] args) 
    {
        Object[] points = new Point[4];
        points[0] = new Point(2, 8);
        points[1] = new Point(4, 8);
        points[2] = new Point(7, 8);
        points[3] = new Point(2, 88);
        
        for (Object point : points) {
            System.out.println(point);
        }

    }
    
}

class Point 
{
    private int x;
    private int y;
    
    Point()
    {
        
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    int getX()
    {
        return x;
    }
    
    int getY()
    {
        return y;
    }
    
    @Override
    public boolean equals(Object o) 
    {
        if(this == o)
            return true;
        if(o == null)
            return false;
        if(this.getClass() != o.getClass())
            return false;
        
        Point send = (Point)o;
               
        return this.x == send.x && this.y == send.y;  
    }
    
    
    @Override
    public String toString() 
    {
        return getX() + " " + getY();
        
    }
}
