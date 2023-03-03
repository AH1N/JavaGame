package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Warrior extends Hero 
{   
  
    public Warrior(String name, int team, Point place) 
    {
       super(4, 5, 1, 3, 10, 4,name, team, place);
       getData();
    }

    @Override
    public  void getData() {
        System.out.println(this.name + "\t" + this.team +"\t" + getClass().getSimpleName());
    }

    private void powerstrike(Hero unit) {
        
        if(rnd(100) <= 50)
        {
            unit.getDamage(unit.getHp()/2);
        }
    }
    

    @Override
    public void ability(ArrayList<Hero> Warband) {
        
    }

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) 
    {
        if(isAlive() == true)
        {
            Hero enemyUnit;
            enemyUnit = enemyWarband.get(nearestAim(enemyWarband));
            if((enemyUnit.place.getX() - this.place.getX()) > 0)
            {
                this.place.moveR();
            }
            if((enemyUnit.place.getX() - this.place.getX()) < 0)
            {
                this.place.moveL();
            }
            if((enemyUnit.place.getX() - this.place.getX()) == 1)
            {
                enemyUnit.getDamage(this.at);
                ability(enemyUnit);
            }   
        }    
    }

    @Override
    public void ability(Hero unit) {
        powerstrike(unit);
    }
    
}
