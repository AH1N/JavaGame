package JavaGame.classes;

import JavaGame.Character.Character;

public class Healer extends Character
{
    float heal;
    
    public Healer(String name, float hp, float at, float def, float defModeficator, float heal) 
    {
        super(name, hp, at, def, 10);
        this.heal = heal;
        //TODO Auto-generated constructor stub
    }
 
    static void Heal() 
    {
       
    }

    @Override
    public void ability() {
        // TODO Auto-generated method stub
        Heal(); 
        
    }
}
