package Game;

public abstract class Hero implements HeroInterface {
    protected String hero;
    protected String name;
    protected float hp;
    protected float speed;
    protected float Damage, maxDamage;
    protected float at;
    protected float def;
    protected int team;


    
    public Hero(int at, int def, int Damage, int maxDamage, int hp, int speed,String name, int team) 
    {
        
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.maxDamage = maxDamage;
        this.Damage = Damage;
        this.at = at;
        this.def = def;
        this.team = team; 
    }
    
    public void getInfo() {
        System.out.println(this.name +" "+ this.hp+"   ("+this.speed+ "Скорость)    " + this.getClass().getSimpleName() + " " + team);//, this.getClass().getSimpleName());
        // System.out.printf("Name: %s Health: %d Endurance: %d Speed: %d, maxDamage: %d, minDamage: %d",
        // this.name, this.hp, this.speed, this.maxDamage, this.Damage, this.getClass().getSimpleName());         
    }

    public void step() {}

    public float getSpeed()
    {
        return this.speed;
    }

    // public void setHP() 
    // {
    //     this.hp = 0;   
    // }

    public boolean isAlive()
    {
        if(this.hp > 0)
        {
            System.out.println(this.name+ "  " + this.team +  "   Живой");
            return true;
        }
        else
        {
            return false;
        }       
    }
     @Override
        public boolean equals(Object obj) 
        {
            Hero t = (Hero) obj;
            return this.team == t.team;
        }
    
}
