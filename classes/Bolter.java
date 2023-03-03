package classes;

import java.util.ArrayList;

import Game.Hero;
import Game.Point;


public class Bolter extends Hero
{

    protected static int arrow;

    public Bolter(String name,int team, Point place) 
    {
        super(6, 3, 2, 3, 10, 4, name, team, place);
        this.arrow = 16;
        getData();
    }
    
    @Override
    public  void getData() {
        System.out.println(this.name + "\t" + this.team +"\t" + getClass().getSimpleName());
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


