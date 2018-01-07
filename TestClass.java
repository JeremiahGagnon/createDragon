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
       System.out.println("Enter RGB Colors"); //colors depending on the user
       int R = input.nextInt();
       int G = input.nextInt();
       int B = input.nextInt();
       int x = 300;
       int y = 300;
       
       Font fontType = new Font("Courier", Font.BOLD, SIZE * 5); //font used for text
       String scenery = "Home";
       DragonScenery boop = new DragonScenery(scenery); //draws scenery for panel
       boop.drawScenery(g, panel);
       Color sceneryColor = new Color(0,0,0);
       if(scenery.equals("Home"))
            sceneryColor = new Color(90, 165, 255);
       if(scenery.equals("Sidewalk"))
            sceneryColor = new Color(90,165,255);
       if(scenery.equals("Christmas"))
            sceneryColor = new Color(146, 242, 229);
       if(scenery.equals("Artic"))
            sceneryColor = new Color(135,255,243);
       
       Dragon sarah = new Dragon(x, y, SIZE, R, G, B, "Hello, World!", fontType); //makes a new dragon called sarah with parameters different from default
       sarah.drawDragon(g); //draws dragon
       //sarah.dragonSpeak(g);//text box
       //sarah.attackElement(g); //depending on the element, it will be that type of attack
       dragonAction userInput = new dragonAction("Fire", 1, SIZE, x, y, fontType, sceneryColor);
       System.out.println("Please enter what you want to do.");
       System.out.println("'A' for Attack\n'E' for eating\n'Q' to quit");
       char userAction = input.next().charAt(0);
       while(userAction != ('Q')){
           if(userAction == ('A'))
                userInput.attackElement(g);
           if(userAction == ('E'))
                userInput.drawHealth(g);
           if(userAction == ('Q')){
               System.out.println("Quitting.");
               for(int i = 0; i < 5; i++){
                   try{
                       Thread.sleep(1000);
                       System.out.print(".");
                    }
                    catch (InterruptedException ie){
                       ie.printStackTrace();
                    }
               }
               System.out.println("Quitting successful."); 
           }
           userAction = input.next().charAt(0);
       }
      /*ArrayList <Dragon> numDragons = new ArrayList<Dragon>(); //makes a new arraylist called numDragons 
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
      }*/
    }
}
