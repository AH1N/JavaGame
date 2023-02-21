package JavaGame.classes;

import JavaGame.Character.Character;


public class Archer extends Character 
{
    protected int arrow;

    public Archer(String name, String heroTip, float hp, float at, float def, float speed, float minDamage, float maxDamage, int arrow) 
    {
        super("Hawk", "Archer", 15, 12, 10, 9, 10, 8);
        this.arrow = 32;  
        getInfo();
    }

    @Override
    public void getInfo() 
    {
        System.out.println("hi I AM  " + this.heroTip);  
    }
    
    @Override
    public void ability() {}

    @Override
    public void step() {}
   
}
