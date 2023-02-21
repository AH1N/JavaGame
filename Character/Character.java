package JavaGame.Character;

// import java_project.program;

public abstract class Character implements CharacterInterface
{
    protected String heroTip;
    protected String name;
    protected float hp;
    protected float at;
    protected float def;
    protected float health;
    protected float speed;
    protected float maxDamage, minDamage;

    public Character(String name, String heroTip, float hp, float at, float def,float speed,float maxDamage, float minDamage) 
    {
        this.heroTip = heroTip;
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.def = def;
        this.speed = speed;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;   
    }

    

    public String getName() {
        return this. name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return this.hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getAt() {
        return this.at;
    }

    public void setAt(float at) {
        this.at = at;
    }

    public float getDef() {
        return this. def;
    }

    public void setDef(float def) {
        this.def = def;
    }
  
}

