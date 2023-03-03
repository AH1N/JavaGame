package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;

public class Archer extends Hero
{
    protected static int arrow;

    public Archer(String name,int team, Point place) 
    {
    
        super(12, 10, 8, 10, 15, 9, name, team, place);
        this.arrow = 32;  
        getData();
    }
    @Override
    public  void getData() {
        System.out.println(this.name + "\t" + this.team +"\t" + getClass().getSimpleName());
    }
    
    public static void getArrow(){
        arrow++;
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
    
    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append(getClass().getSimpleName()+"\t").append(this.name)
                .append("\t| ATK:\t").append(this.at)
                .append("\t| HP:\t").append(this.hp)
                .append(" \t| СТРЕЛ:\t").append(this.arrow)
                .append("\t|").append("\t| (X.Y) : ").append(this.place.getX()).append(".").append(this.place.getY());
    }

}