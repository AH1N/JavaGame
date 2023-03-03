package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Rouge extends Hero 
{

    public Rouge(String name, int team, Point place) 
    {
        super(8, 3, 2, 4, 10, 6, name, team, place);
        
        getData();
    }

    @Override
    public  void getData() {
        System.out.println(this.name + "\t" + this.team +"\t" + getClass().getSimpleName());
    }

    private void dirtyKick() {

    }


    @Override
    public void ability(ArrayList<Hero> Warband) {
        
    }

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) {
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
        dirtyKick();
    }
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(getClass().getSimpleName()+"\t").append(this.name)
                .append("\t| ATK:\t").append(this.at)
                .append("\t| HP:\t").append(this.hp)
                .append("\t|").append("\t| (X.Y) : ").append(this.place.getX()).append(".").append(this.place.getY());
    
    
    }
}