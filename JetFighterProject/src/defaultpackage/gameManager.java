package defaultpackage;

 
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 

public class gameManager extends JPanel implements ActionListener
{
    Image jet;
    Timer timer;
    player p = new player(0 , 0, 0);
    JLabel label;
    
    gameManager()
    {
        this.setPreferredSize(new Dimension(600,600));
        this.setBackground(Color.BLACK); 
        //for vs code
//        jet = new ImageIcon("plane.jpg").getImage();
//        for eclipse
        jet = new ImageIcon(this.getClass().getResource("/plane.jpg")).getImage();
        timer = new Timer(1, this);
        timer.start();
        addKeyListener(p);
        setFocusable(true);


    }

    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        goingTheSameWay();  
        g2D.rotate(Math.toRadians(p.getDeg()),(jet.getWidth(label) / 2) + p.getX() ,(jet.getHeight(label) / 2) + p.getY());
        g2D.drawImage(jet,(int)p.getX(), (int)p.getY(),null); 
    }

    public void goingTheSameWay()
    {
        p.setX(p.getX() + 3*Math.cos(Math.toRadians(p.getDeg())));
        p.setY(p.getY() + 3*Math.sin(Math.toRadians(p.getDeg())));

    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       
        repaint();
    }

    
    

    
}
