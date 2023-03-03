package Game;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero implements HeroInterface {
    protected String hero;
    protected String name;
    protected float hp;
    protected float speed;
    protected float Damage, maxDamage;
    protected float at;
    protected float def;
    protected int team;
    public Point place;

    
    public Hero(int at, int def, int Damage, int maxDamage, int hp, int speed,String name, int team, Point place) 
    {
        
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.maxDamage = maxDamage;
        this.Damage = Damage;
        this.at = at;
        this.def = def;
        this.team = team;
        this.place = place; 
    }
    
    public void getData () 
    {
        
    }

    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

    public int[] getCoords() {return new int[]{place.x, place.y};}

   


    public int rnd(int n) 
    { 
        Random rand = new Random();
        int diceRandom = rand.nextInt(n);
        return diceRandom;
    }

    public float getDamage(float at) {
        return this.hp -= at;
    }

    public float getHeal(float at)
    {
        return this.hp += at;
    }

    public float getHp() {
        return hp;
    }

    public float getSpeed()
    {
        return this.speed;
    }

    public boolean isAlive()
    {
        if(this.hp > 0)
        {
            System.out.println(this.name+ "  " + this.team +  "   Живой");
            return true;
        }
        else
        {
            return false;
        }       
    }
    
    public boolean isEnemyDead(Hero unit) 
    {   
        if(unit.hp < 0){
            return false;
        }
        else{
            return true;
        }
        
    }

    @Override
        public boolean equals(Object obj) 
        {
            Hero t = (Hero) obj;
            return this.team == t.team;
        }
    
    public double rangeToAim(Point PointA,Point pointB) {
        return Game.Point.range(PointA, pointB);
    }
    
    public static Boolean isEnemy(Hero unit, ArrayList<Hero> Warband) 
    {
        for (Hero hero : Warband) 
        {
            if (unit.equals(hero))
            {
                System.out.println("КУДА СТРЕЛЯЕШЬ ГАД!!!");
                return false;
            } 
            else
            {
                System.out.println(unit.name + unit.team + "  ВРАГ  " + hero.name + hero.team);
                return true;
            }
        }
        return null;
        
    }

    public int nearestAim(ArrayList<Hero> enemyWarband){
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < enemyWarband.size(); i++) {
            if(min > rangeToAim(place, enemyWarband.get(i).place) & isEnemyDead(enemyWarband.get(i)) == false)
            {
                index = i;
                min = rangeToAim(place, enemyWarband.get(i).place);
            }
        }
        return index;
    }

    
}

