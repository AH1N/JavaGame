package JavaGame.classes;

import JavaGame.Character.Character;

public class Healer extends Character
{
    protected int mana;
    
    public Healer(String name, String heroTip, float hp, float at, float def, float health, 
                    float speed,float minDamage, float maxDamage, int mana) 
    {
        super(name, heroTip, 30, 12, 7, 5, -4, -4);
        this.mana = 1;
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
