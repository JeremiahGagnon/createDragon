import java.awt.*;
import java.awt.Color;

/**
 * use shapes to draw trees or clouds
 * use drawpolygon to do whatever shape i want
 * maybe arc to draw tree?
 */
public class DragonScenery
{
    // instance variables - replace the example below with your own
    private String scene;

    /**
     * Constructor for objects of class DragonScenery
     */
    public DragonScenery()
    {
        scene = "Sidewalk";
    }
    
    public DragonScenery(String scene){
        this.scene = scene;
    }
    
    public void drawScenery(Graphics g, DrawingPanel panel){
        if(scene.equals("Sidewalk"))
            sidewalkScene(g, panel);
        if(scene.equals("Home"))
            homeScene(g, panel);
        if(scene.equals("Christmas"))
            christmasScene(g, panel);
        if(scene.equals("Artic"))
            articScene(g, panel);
    }
    private void sidewalkScene(Graphics g, DrawingPanel panel){
       Color customColor = new Color (90, 165, 255); //blue for sky
       panel.setBackground(customColor);//sky
       g.setColor(Color.BLACK);
       g.fillRect(0, 700, 800, 200); //road
       g.setColor(Color.LIGHT_GRAY);
       g.fillRect(0, 600, 800, 100);//sidewalk
       customColor = new Color(139,69, 19);//brown color
       g.setColor(customColor);
       for(int i = 1; i <= 5; i++) //trunk
            g.fillRect(100 + i * 100, 400, 50, 200);
       g.setColor(Color.GREEN); 
       for(int i = 1; i <= 5; i++) //leaves
            g.fillOval(50 + i * 100, 320, 150, 150); 
    }
    private void homeScene(Graphics g, DrawingPanel panel){
        Color customColor = new Color (90, 165, 255);
        panel.setBackground(customColor);
        customColor = new Color(75, 255, 100);
        g.setColor(customColor);
        g.fillRect(0, 560, 800, 800); //draws grass
        g.setColor(Color.YELLOW);
        g.fillOval(625, 50, 125, 125); //draws sun
        customColor = new Color(232, 184, 112);
        g.setColor(customColor);
        g.fillRect(200, 280, 400, 290); //draws base of house
        customColor = new Color(161, 75, 53);
        g.setColor(customColor);
        g.fillRect(250, 425, 80, 145); //draws door for house
        g.setColor(Color.RED);
        g.fillRect(510, 110, 50, 130);
        g.setColor(customColor);
        int[] xRoof = {150, 650, 400}; //x for roof
        int[] yRoof = {280, 280, 140}; //y for roof
        g.fillPolygon(xRoof, yRoof, 3); //draw roof
        /*int[] xChimney = {525, }; 
        int[] yChimney = {210, };
        
        g.fillPolygon(xChimney, yChimney, 3);
        */
    }
    private static void articScene(Graphics g, DrawingPanel panel){
        Color customColor = new Color(135,255,243);
        panel.setBackground(customColor);
        customColor = new Color(92, 173, 165);
        //mountains in back
        g.setColor(customColor);
        int[] xMountain = {0,33,98,119,155,244,259,331,437,496,519,626,706,799,799};
        int[] yMountain = {600,321,490,448,562,293,347,260,573,486,545,307,538,419,600};
        g.fillPolygon(xMountain, yMountain, 15);
        
        //igloo
        customColor = new Color(125,235,224);
        g.setColor(customColor);
        g.fillOval(115,550,100,100);
        g.fillRect(210,590,10,10);
        
        //ground
        customColor = new Color(87,163,156);
        g.setColor(customColor);
        g.fillRect(0,600,800,200);
        
    }
    private static void christmasScene(Graphics g, DrawingPanel panel){
        Color customColor = new Color(146, 242, 229); //new caller, light baby sky blue?
        panel.setBackground(customColor); //sets color to the panel
        g.setColor(Color.BLACK);
        g.fillRect(0, 700, 800, 100);
        g.setColor(Color.GRAY); //sidewalk color
        g.fillRect(0, 600, 800, 100); //sidewalk on ground
        g.setColor(Color.BLACK);
        
        //side of the sidewalk
        g.drawLine(0, 670, 800, 670);
        g.drawLine(0, 600, 50, 670);

        //draws lines on sidewalk
        g.drawLine(150, 600, 200, 670); 
        g.drawLine(300, 600, 350, 670);
        g.drawLine(450, 600, 500, 670);
        g.drawLine(600, 600, 650, 670);
        g.drawLine(750, 600, 800, 670);
        
        //snow in background
        g.setColor(Color.WHITE);
        g.fillRect(0, 460, 800, 140);
        
        //snowman body
        g.setColor(Color.GRAY);
        for(int i = 0; i < 3; i++)
            g.fillOval(600 - i * 5, 380 + i * 40, 50 + i * 30, 50 + i * 30);
            
        //carrot nose
        g.setColor(Color.ORANGE);
        int[] carrotX = {605, 605, 585};
        int[] carrotY = {400, 410, 405};
        g.fillPolygon(carrotX, carrotY, 3);
        
        //eye
        g.setColor(Color.BLACK);
        g.fillOval(615, 390, 5, 10);
        
        //hat
        g.drawLine(623, 378, 645, 388);
        int[] xHat = {629, 638, 649, 640};
        int[] yHat = {381, 366, 371, 386};
        g.fillPolygon(xHat, yHat, 4);
        
        //smile
        g.fillOval(607, 415, 5, 5);
        g.fillOval(612, 413, 5, 5);
        g.fillOval(617, 410, 5, 5);
        
        //arm sticks
        customColor = new Color(122, 84, 40);
        g.setColor(customColor);
        g.drawLine(640, 445, 625, 467); //one in front
        g.drawLine(625, 467, 595, 475);
        g.drawLine(599, 474, 591, 480);
        
        g.drawLine(595, 450, 585, 456); //one in back
        g.drawLine(585, 456, 574, 439);
        g.drawLine(576, 442, 576, 435);
        
        //christmas tree
        g.fillRect(125, 490, 25, 25); //stump
        g.setColor(Color.GREEN);
        int[] xTree = {100, 125, 106, 125, 112, 125, 118, 137, 157, 150, 163, 150, 169, 150, 175};
        int[] yTree = {490, 470, 470, 450, 450, 430, 430, 400, 430, 430, 450, 450, 470, 470, 490};
        g.fillPolygon(xTree, yTree, 15);
        
        //ornaments
        g.setColor(Color.YELLOW);
        int[] xStar = {137, 131, 134, 128, 133, 137, 141, 145, 140, 143};
        int[] yStar = {400, 405, 395, 390, 390, 380, 390, 390, 395, 405};
        g.fillPolygon(xStar, yStar, 10);
    }

    public String sampleMethod(int y)
    {
        // put your code here
        return scene;
    }
}
