package JavaGame.classes;

import JavaGame.Character.Character;

public class Peasant extends Character 
{
    
    public Peasant(String name, float hp, float at, float def, float defModeficator) {
        super(name, hp, at, def, defModeficator);
        //TODO Auto-generated constructor stub
    }

    private void bringarrows() 
    {
        
    }

    @Override
    public void ability() {
        // TODO Auto-generated method stub
        bringarrows();
    }

   
}   