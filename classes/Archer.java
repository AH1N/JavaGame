package JavaGame.classes;

import JavaGame.Character.Character;
// import JavaOOP.Weapon.Bow;

public class Archer extends Character 
{
    // private Bow bow;

    public Archer(String name, float hp, float at, float def, float defModeficator) 
    {
        super(name, hp, at, def, 0);
        //TODO Auto-generated constructor stub
    }


    public float defence()
    {
        return 5;
    }

    public float shoot(float distanse)
    {
        if (distanse > 10) {
            return sniperShoot();
        }

        return simpleShoot();
    }

    private float simpleShoot()
    {
        return 7;
    }

    private float sniperShoot()
    {
        return 15;
    }


    @Override
    public void ability() {
        // TODO Auto-generated method stub
        
    }

    
    
}
