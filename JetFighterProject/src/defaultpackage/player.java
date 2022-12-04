package defaultpackage;

 
import java.awt.event.*; 

public class player implements Runnable, KeyListener{
    private double x,y;
    private int id;
    private double Deg = 0;
    private double DegVel = 3;
    private double velX, velY = 3; 

    public player(double x, double y, int id)
    {
        this.x = x;
        this.y = y;
        this.id = id;
        

    }       
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public int getID()
    {
        return id;
    }
    public double getDeg()
    {
        return Deg;
    }
    public double getVelY()
    {
        return velY;
    }
    public double getVelX()
    {
        return velX;
    }

    @Override
    public void run() {
        
    }

 

    //ok
    @Override
    public void keyPressed(KeyEvent e) 
    {
        int key = e.getKeyCode();
        

        if(key == KeyEvent.VK_RIGHT)
        {
            Deg += DegVel;
            
           
 
        }
        if(key == KeyEvent.VK_LEFT)
        {
            Deg -= DegVel;
            
        }
    }

    
    @Override
    public void keyReleased(KeyEvent e) 
    {
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    
}
