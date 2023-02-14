package JavaGame.Character;

import java_project.program;

public abstract class Character 
{
    
    protected String name;
    protected float hp;
    protected float at;
    protected float def;
    protected float defModeficator;

    public Character(String name, float hp2, float at2, float def2, float defModeficator) 
    {
        this.name = name;
        this.hp = hp2;
        this.at = at2;
        this.def = def2;
        this.defModeficator = defModeficator + def2;
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

    public float getDefModeficator() {
        return this. defModeficator;
    }

    public void setDefModeficator(float defModeficator) {
        this.defModeficator = defModeficator;
    }

    abstract public void ability();


    public void getDmage() 
    {   
        this.hp -= at - this.def;
    }
 
    public void takeHeal(float hp, float heal) 
    {
        this.hp += heal;
    }
    
}

