package classes;

import Game.Hero;


public class Bolter extends Hero
{

    protected int arrow;

    public Bolter(String name, int x, int y, int team) 
    {
        super(6, 3, 2, 3, 10, 4, name,team);
        this.arrow = 16;
        getInfo();
    }
    
    private void chainShoot() {
        
    }

    @Override
    public void step() {}

    @Override
    public void ability() {
        chainShoot();
    }

  
}

