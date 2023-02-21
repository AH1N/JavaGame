package JavaGame.classes;

import JavaGame.Character.Character;

public class Warrior extends Character 
{   
  
    public Warrior(String name, String heroTip, float hp, float at, float def, float speed,float minDamage, float maxDamage) 
    {
       super("Spike", "warrior", 10, 4, 5, 4, 1, 3);
       getInfo();
    }

    private static void powerstrike() {}

    @Override
    public void getInfo() 
    {
        System.out.println("hi I AM  " + this.heroTip); 
    }
    @Override
    public void ability() {
        powerstrike(); 
    }

    @Override
    public void step() {}
    
}
