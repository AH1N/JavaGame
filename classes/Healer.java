package classes;

import Game.Hero;

public class Healer extends Hero
{
    protected int mana;
    
    public Healer(String name, int x, int y,int team) 
    {
        super(12, 7, -4, -4, 30, 5,name,team);
        this.mana = 1;
        getInfo();
    }
 
    private void massHeal() {}

    @Override
    public void step() {}

    @Override
    public void ability() {
        massHeal();
    }
    
}
