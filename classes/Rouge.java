package classes;

import Game.Hero;

public class Rouge extends Hero 
{

    public Rouge(String name,int x, int y, int team) 
    {
        super(8, 3, 2, 4, 10, 6,name,team);
        
        getInfo();
    }

    private void dirtyKick() {}


    @Override
    public void step() {}

    @Override
    public void ability() {
        dirtyKick();
    }

    
}
