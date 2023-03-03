package Game;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Tests {
    private static int step = 1;
    public static void main(String[] args) {
        
        ArrayList<Hero> holyTeam = Game.Combat.createWarBand(0);
        ArrayList<Hero> darkTeam =Game.Combat.createWarBand(5);
        Hero a = holyTeam.get(0);
        System.out.println(holyTeam.get(0).isAlive());
        // isEnemy(a, wb2, 0);
        

    }

    

    // public static void isEnemy(Hero unit, ArrayList<Hero> Warband, int n) 
    // {
    //     if (unit.equals(Warband.get(n)))
    //     {
    //         System.out.print("КУДА СТРЕЛЯЕШЬ ГАД!!!");
              
    //     } 
    //     else
    //     {
    //         System.out.println(unit.name + unit.team + "  ВРАГ  " + Warband.get(0).name + Warband.get(0).team);
    //         System.out.println(unit.getClass().getSimpleName());
    //     }
    // }



  
    

}

