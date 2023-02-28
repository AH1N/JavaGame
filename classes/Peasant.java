package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Peasant extends Hero 
{
    int bringArrow;
    public Peasant(String name,int team, Point place) 
    {
        super(1,1, 1, 1, 1, 1, name, team, place);
        this.bringArrow = 1; 
        getInfo();
    }

    private void bringArrows() {}

    

 
    @Override
    public void ability(ArrayList<Hero> Warband) {
        bringArrows(); 
  
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