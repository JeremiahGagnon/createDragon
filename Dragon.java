import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class Dragon here. So guys we did it
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private int R;
    private int G;
    private int B;
    private String dragonText;
    private Font fontType;
    
    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 2;
        R = 0; // Lines 27-29 are default RGB colors.
        G = 0;
        B = 0;
        fontType = new Font("TimesRoman", Font.PLAIN, 18);
    }    
    public Dragon(int x,int y, int size, int R, int G, int B, String dragonText, Font fontType){
        this.x = x;
        this.y = y;
        this.size = size;
        this.R = R; // You saw nothing.
        this.G = G;
        this.B = B;
        //this.dragonText = dragonTest;
        this.fontType = fontType;
    }
        
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        Color customColor = new Color(R, G, B); //make a new color depending on user input
        g.setColor(customColor); // Custom Color
        g.fillRect(x + size * 3, y + size * 5, size * 30, size * 30); //draw Head
        g.fillRect(x+size * 25, y + size*25, size *60, size * 50); //Draw Body
        int[] wingArrayX = {x + size * 40, x + size * 40, x + size * 90}; //x coord for wing
        int[] wingArrayY = {y + size * 40, y - size * 3, y - size * 3}; //y coord for wing
        g.fillPolygon(wingArrayX, wingArrayY, 3); //make wing
        int[] tailArrayX = {x + size * 80, x + size * 120, x + size * 120, x + size * 105, x + size * 80}; //x coord for tail
        int[] tailArrayY = {y + size * 25, y + size * 25, y + size * 60, y + size * 35, y + size * 35}; //y coord for tail
        g.fillPolygon(tailArrayX, tailArrayY, 5); //make tail
        g.fillRect(x+size * 25, (y + size*25) + size * 25, size * 10, size * 50); //Draw Leg #1
        g.fillRect((x+size * 25) + size * 50, (y + size*25) + size * 25, size * 10, size * 50); //Draw leg #2
    }
    public void dragonSpeak(Graphics g){ //textbox with font
        g.drawRect(x - size * 15, y - size * 21, size * 40, size * 8);
        g.setFont(fontType);
        Color customColor = new Color(R, G, B);
        g.setColor(customColor);

        g.drawString("Hello, World!", x - size * 10, y - size * 15);
    }
    
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coord: " + x + " y coord: " + y + " size: " + size;
    }
}
