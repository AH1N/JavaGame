package JavaGame.classes;

import JavaGame.Character.Character;

public class Warrior extends Character 
{   
  
    public Warrior(String name, float hp, float at, float def, float defModeficator) 
    {
        super(name, hp, at, def, 10);
        //TODO Auto-generated constructor stub
    }

    private static void powerstrike() 
    {
        
    }

    @Override
    public void ability() {
        // TODO Auto-generated method stub
        powerstrike(); 
    }
    
}
