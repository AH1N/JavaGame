package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Archer extends Hero
{
    protected int arrow;

    public Archer(String name,int team, Point place) 
    {
    
        super(12, 10, 8, 10, 15, 9, name, team, place);
        this.arrow = 32;  
        getInfo();
    }

    private void snipeShot(Hero unit) 
    {   
        if(rnd(100) <= 40)
        {
            unit.getDamage(15);
        }
        
    }

    @Override
    public void ability(Hero unit) 
    {
        snipeShot(unit);
    }

    @Override
    public void ability(ArrayList<Hero> enemyWarband) {}

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) 
    {
        if(isAlive() == true & this.arrow > 0)
        {
            Hero enemyUnit;
            enemyUnit = enemyWarband.get(nearestAim(enemyWarband));
            enemyUnit.getDamage(this.at);
            ability(enemyUnit);
        }
    }
}
