import java.awt.*;

/**
 * Write a description of class dragonAction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dragonAction extends TestClass
{
    // instance variables - replace the example below with your own
    private String attackType;
    private int totalHealth;
    private int size;
    private int x;
    private int y;
    private Font fontType;
    private Color sceneryColor;

    /**
     * Constructor for objects of class dragonAction
     */
    public dragonAction()
    {
        // initialise instance variables
        attackType = "Fire";
        totalHealth = 0;
        size = 2;
        x = 300;
        y = 300;
        fontType = new Font("TimesRoman", Font.PLAIN, 18);
        sceneryColor = new Color(0,0,0);
    }
    public dragonAction(String attackType, int totalHealth, int size, int x, int y, Font fontType, Color sceneryColor){
        this.attackType = attackType;
        this.totalHealth = totalHealth;
        this.size = size;
        this.x = x;
        this.y = y;
        this.fontType = fontType;
        this.sceneryColor = sceneryColor;
    }
    
    public void attackElement(Graphics g){
        if(attackType.equals("Fire")) //calls method to draw fire
            drawFire(g);
        if(attackType.equals("Water")) //calls method to draw water
            drawWater(g);
    }
    private void drawFire(Graphics g){
        g.setColor(Color.RED);
        for(int i = 1; i < size * 4; i++){ //fire breath
            g.fillOval(x + i * -16, y + size * 20, i * 10, i * 10);
            try{
                Thread.sleep(500); //wait half a second
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        return;
    }
        
    private void drawWater(Graphics g){
        g.setColor(Color.BLUE);
        g.setFont(fontType);
        for(int i = 1; i < size * 4; i++){ //water breath
            g.fillOval(x + i * -16, y + size * 20, size * i * 2, size * i * 2);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        return;
    }
    public void drawHealth(Graphics g){ //displays health on top left
        g.setColor(sceneryColor); //sets color to background color
        g.fillRect(50, 5, 100, 100); //covers the old drawstring
        g.setFont(fontType);
        g.setColor(Color.BLACK);
        DragonSnack poob = new DragonSnack(); //make a new variable for our subclass
        totalHealth += poob.chooseSnack(); //whatever choosesnack returns adds onto totalHealth
        g.drawString("Health: " + totalHealth, 50, 30); //prints out health
        return;
    }                               

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
