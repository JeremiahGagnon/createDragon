import java.awt.*;
import java.util.Scanner;

public class DragonSnack extends dragonAction{
    public int chooseSnack(){
        System.out.println("What snack do you want?");
        System.out.println("Taco   Churros   Cashews");
        Scanner userInput = new Scanner(System.in);
        String food = userInput.nextLine();
        if(food.equals("Taco")){
            return 2;
        }
        if(food.equals("Churros")){
            return 3;
        }
        if(food.equals("Cashews"))
            return 4;
        else
            return 2;
     }
}