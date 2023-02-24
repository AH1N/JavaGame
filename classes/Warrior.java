package classes;

import Game.Hero;

public class Warrior extends Hero 
{   
  
    public Warrior(String name,int x, int y,int team) 
    {
       super(4, 5, 1, 3, 10, 4,name, team);
       getInfo();
    }

    private static void powerstrike() {}
    
    @Override
    public void step() {}

    @Override
    public void ability() {
        powerstrike();
    }
    
}
