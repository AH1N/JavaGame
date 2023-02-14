package JavaGame.classes;

import JavaGame.Character.Character;

public class Rouge extends Character 
{

    public Rouge(String name, float hp, float at, float def, float defModeficator) 
    {
        super(name, hp, at, def, 5);
        //TODO Auto-generated constructor stub
    }

    private void dirtykick() 
    {
        
    }

    @Override
    public void ability() 
    {
        // TODO Auto-generated method stub
        dirtykick();
    }

    
}
