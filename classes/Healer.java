package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Healer extends Hero
{
    protected int mana;
    
    public Healer(String name,int team, Point place) 
    {
        super(12, 7, -4, -4, 30, 5, name, team, place);
        this.mana = 1;
        getInfo();
    }
 
    private void massHeal(ArrayList<Hero> friendlyWarband) 
    {
        if(rnd(100) <= 30)
        {
            for (Hero hero : friendlyWarband) {
                if(hero.getHp() > 0)
                {
                    hero.getHeal(3);
                }
                
            }
        }
    }

 
    @Override
    public void ability(ArrayList<Hero> friendlyWarband) {
        massHeal(friendlyWarband);
    }

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) 
    {
        if(isAlive() == true & this.mana > 0)
        {
            Hero friendlyUnit;
            friendlyUnit = friendlyWarband.get(nearestAim(friendlyWarband));
            friendlyUnit.getDamage(this.at);
            ability(friendlyWarband);
        }
    }

    @Override
    public void ability(Hero unit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ability'");
    }
    
}
