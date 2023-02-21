package JavaGame.classes;

import java.security.GeneralSecurityException;
import java.util.Random;

import JavaGame.Character.Character;

public class Warlock extends Character 
{
    protected int mana;

    public Warlock(String name, String heroTip, float hp, float at, float def, float speed, float minDamage, float maxDamage, int mana) 
    {
        super("EdgarPoe", "Warlock", 30, 17, 12, 9, -5, -5);
        this.mana = 1;
        getInfo();
    }

    private void corRupt() {}

    @Override
    public void getInfo() 
    { 
        System.out.println("hi I AM  " + this.heroTip);    
    }

    @Override
    public void ability() 
    {
        corRupt();
    }

    @Override
    public void step() {} 


}
