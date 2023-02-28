package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Rouge extends Hero 
{

    public Rouge(String name, int team, Point place) 
    {
        super(8, 3, 2, 4, 10, 6, name, team, place);
        
        getInfo();
    }

    private void dirtyKick() {}


    @Override
    public void ability(ArrayList<Hero> Warband) {
        dirtyKick();
    }

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ability(Hero unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ability'");
    }

    
}
