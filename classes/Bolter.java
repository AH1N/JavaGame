package JavaGame.classes;

import JavaGame.Character.Character;

public class Bolter extends Character 
{
    
    public Bolter(String name, float hp, float at, float def, float defModeficator) 
    {
        super(name, hp, at, def, 7);
        //TODO Auto-generated constructor stub
    }

    private void ignoreDef() 
    {
        
    }

    @Override
    public void ability() {
        // TODO Auto-generated method stub
        ignoreDef();
    }    
}
