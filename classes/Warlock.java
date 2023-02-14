package JavaGame.classes;

import JavaGame.Character.Character;

public class Warlock extends Character 
{

    public Warlock(String name, float hp, float at, float def, float defModeficator) 
    {
        super(name, hp, at, def, 0);
        //TODO Auto-generated constructor stub
    }

    private void corrupt() 
    {
        
    }
    
    @Override
    public void ability() 
    {
        // TODO Auto-generated method stub
        corrupt();
    }

    
}
