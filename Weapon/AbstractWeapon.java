package JavaGame.Weapon;

public abstract class AbstractWeapon 
{
    protected int range;
    protected int power;

    public AbstractWeapon(int power, int range) 
    {
        this.power = power;
        this.range = range;
    }

    public int getRange()
    {
        return this.range;
    }

    public int getPower()
    {
        return this.power;
    }
}
