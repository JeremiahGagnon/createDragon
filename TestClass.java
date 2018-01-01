import java.awt.*;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800); //800x800 drawing panel
       Graphics g = panel.getGraphics(); //graphics
       Scanner input = new Scanner(System.in); //new scanner
       System.out.println("Enter a Size");
       final int SIZE = input.nextInt(); //size used throughout the code
       /*System.out.println("Enter RGB Colors"); //colors depending on the user
       int R = input.nextInt();
       int G = input.nextInt();
       int B = input.nextInt();
       */
       Font fontType = new Font("Courier", Font.BOLD, SIZE * 5); //font used for text
       
       DragonScenery boop = new DragonScenery("Artic"); //draws scenery for panel
       boop.drawScenery(g, panel);
       
       /*Dragon sarah = new Dragon(300, 300, SIZE, R, G, B, "Fire", "Hello, World!", fontType); //makes a new dragon called sarah with parameters different from default
       sarah.drawDragon(g); //draws dragon
       sarah.dragonSpeak(g);//text box
       sarah.attackElement(g); //depending on the element, it will be that type of attack
       sarah.drawHealth(g);//draws a number in the top left
       */
      ArrayList <Dragon> numDragons = new ArrayList<Dragon>(); //makes a new arraylist called numDragons 
      System.out.println("How many dragons would you like to print?");
      Dragon beep = new Dragon(); //asks how many dragons user wants to create
      int num = 0;
      while(num <= 0) 
        num = input.nextInt();
      for(int i = 0; i <= num; i++){ //makes a new dragon and adds it to arraylist
          beep = new Dragon(250 * i + 250, 300 * i + 225, SIZE, 20 * i + 10, 5 * i + 10, 15 * i + 10, "Water", "Hello, World!", fontType);
          numDragons.add(beep);
      }
      for(int i = 0; i < numDragons.size() - 1; i++){
          numDragons.get(i).drawDragon(g);
          numDragons.get(i).dragonSpeak(g);
      }
    }
}
