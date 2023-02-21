package JavaGame.classes;

import JavaGame.Character.Character;


public class Bolter extends Character
{

    protected int arrow;

    public Bolter(String name, String heroTip, float hp, float at, float def,float speed, float minDamage,
            float maxDamage, int arrow) 
    {
        super("ЕгорСемёныч", "bolter", 10, 6, 3, 4, 2, 3);
        this.arrow = 16;
        getInfo();
    }


    @Override
    public void getInfo() 
    { 
        System.out.println("hi I AM  " + this.heroTip); 
    }
    

    @Override
    public void step() {}

    @Override
    public void ability() {}
    
}

