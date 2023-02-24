package classes;

import Game.Hero;

public class Peasant extends Hero 
{
    int bringArrow;
    public Peasant(String name,int x, int y,int team) 
    {
        super(1,1, 1, 1, 1, 1,name,team);
        this.bringArrow = 1; 
        getInfo();
    }

    private void bringArrows() {}

    

    @Override
    public void step() {}

    @Override
    public void ability() {
        bringArrows(); 
  
    }

   
}   