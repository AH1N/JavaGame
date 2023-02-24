package classes;

import Game.Hero;


public class Archer extends Hero
{
    protected int arrow;

    public Archer(String name, int x, int y,int team) 
    {
        super(12, 10, 8, 10, 15, 9,name,team);
        this.arrow = 32;  
        getInfo();
    }

    private void snipeShot() {}

    @Override
    public void ability() {
        snipeShot();
    }

 
}
