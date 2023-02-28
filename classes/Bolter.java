package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;


public class Bolter extends Hero
{

    protected int arrow;

    public Bolter(String name,int team, Point place) 
    {
        super(6, 3, 2, 3, 10, 4, name, team, place);
        this.arrow = 16;
        getInfo();
    }
    
    private void chainShoot(ArrayList<Hero> enemyWarband) 
    {  
        if(rnd(100)<= 40)
        {
            for (int i = 0; i < 2; i++) 
            {   
                Hero tmpHero = enemyWarband.get(rnd(enemyWarband.size()));
                
                if((tmpHero).getHp() > 0)
                {
                    tmpHero.getDamage(this.maxDamage);
                }
                
            }
        }
    }

    @Override
    public void ability(ArrayList<Hero> enemyWarband) {
        chainShoot(enemyWarband);
    }

        @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) 
    {
        if(isAlive() == true & this.arrow > 0)
        {
            Hero enemyUnit;
            enemyUnit = enemyWarband.get(nearestAim(enemyWarband));
            enemyUnit.getDamage(this.at);
            ability(enemyWarband);
        }
    }

        @Override
        public void ability(Hero unit) {}
}
 


