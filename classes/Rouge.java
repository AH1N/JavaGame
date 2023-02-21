package JavaGame.classes;

import JavaGame.Character.Character;

public class Rouge extends Character 
{

    public Rouge(String name, String heroTip, float hp, float at, float def, float speed,float maxDamage, float minDamage) 
    {
        super("Robin", "rogue", 10, 8, 3, 6, 4, 2);
        getInfo();
    }

    private void dirtyKick() {}

    @Override
    public void getInfo() {
        System.out.println("hi I AM  " + this.heroTip); 
    }

    @Override
    public void ability() 
    {
        dirtyKick();
    }

    @Override
    public void step() {}

    
}
