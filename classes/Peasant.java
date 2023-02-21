package JavaGame.classes;

import JavaGame.Character.Character;

public class Peasant extends Character 
{
    int bringArrow;
    public Peasant(String name, String heroTip, float hp, float at, float def,
                     float speed,float maxDamage, float minDamage, int bringArrow) 
    {
        super("Foma", "Peasant", 1, 1, 1, 3, 1, 1);
        this.bringArrow = 1; 
        getInfo();
    }

    private void bringarrows() {}

    @Override
    public void getInfo() 
    {
        System.out.println("hi I AM  " + this.heroTip);        
    }

    @Override
    public void ability() {  
        bringarrows();
    }

    @Override
    public void step() {}

   
}   