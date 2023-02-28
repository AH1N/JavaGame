package classes;

import java.util.ArrayList;
import java.util.Random;

import Game.Hero;
import Game.Point;

public class Warlock extends Hero 
{
    protected int mana;

    public Warlock(String name, int team, Point place) 
    {
        super(17, 12, -5, -5, 30, 9, name, team, place);
        this.mana = 1;
        getInfo();
    }

    private void corRupt(ArrayList<Hero> enemyWarband) 
    {
        if(rnd(100) <= 30)
        {
            for (Hero hero : enemyWarband) {
                if(hero.getHp() >0 )
                {
                    hero.getDamage(3);
                }
            }
        }
    }

 

    @Override
    public void ability(ArrayList<Hero> enemyWarband) {
        corRupt(enemyWarband);
    }

    
    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) 
    {
        if(isAlive() == true & this.mana > 0)
        {
            Hero friendlyUnit;
            friendlyUnit = friendlyWarband.get(nearestAim(friendlyWarband));
            friendlyUnit.getDamage(this.at);
            ability(enemyWarband);
        }
        
    }

    @Override
    public void ability(Hero unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ability'");
    }
} 




