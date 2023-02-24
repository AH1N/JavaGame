package classes;

import Game.Hero;

public class Warlock extends Hero 
{
    protected int mana;

    public Warlock(String name, int x, int y,int team) 
    {
        super(17, 12, -5, -5, 30, 9,name,team);
        this.mana = 1;
        getInfo();
    }

    private void corRupt() {}

 
    @Override
    public void step() {}

    @Override
    public void ability() {
        corRupt();
    } 


}

