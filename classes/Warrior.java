package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Warrior extends Hero 
{   
  
    public Warrior(String name, int team, Point place) 
    {
       super(4, 5, 1, 3, 10, 4,name, team, place);
       getInfo();
    }

    private static void powerstrike() {}
    

    @Override
    public void ability(ArrayList<Hero> Warband) {
        powerstrike();
    }

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) {
       
    }

    @Override
    public void ability(Hero unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ability'");
    }
    
}
