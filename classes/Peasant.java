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
        getData();
    }

    @Override
    public  void getData() {
        System.out.println(this.name + "\t" + this.team +"\t" + getClass().getSimpleName());
    }

    private void bringArrows() 
    {
        if((hero.getClass().getSimpleName()) == "Archer")
        {
            Archer.arrow++;
        }
        if((hero.getClass().getSimpleName()) == "Bolter")
        {
            Bolter.arrow++;
        }
        
    }

    @Override
    public void ability(Hero unit) {bringArrows();}
    
    @Override
    public void ability(ArrayList<Hero> Warband) {}

    @Override
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband) {

        if(isAlive() == true){
            for (Hero hero : friendlyWarband) {
                if(hero.getHp() > 0)
                {
                    ability(hero);
                }
            }
        }
        
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