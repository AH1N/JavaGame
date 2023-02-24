package Game;
// import Game.NamesEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import classes.Peasant;
import classes.Bolter;
import classes.Healer;
import classes.Rouge;
import classes.Warlock;
import classes.Warrior;
import classes.Archer;




public class Combat {
    public static void main(String[] args) 
    {
        ArrayList<Hero> WB1 = createWarBand(1);
        ArrayList<Hero> WB2 = createWarBand(2);
        System.out.println(createWarBand(6));
        System.out.println(createWarBand(1));

        isEnemy(WB1.get(0), WB2);
        isEnemy(WB2.get(0), WB1);
        (WB1.get(0)).isAlive();
        (WB2.get(0)).isAlive();

    }

    // public static void startCombat(ArrayList<Hero> WarbandOne, ArrayList<Hero> WarbandTwo)
    // {

    // }
    
    public static ArrayList<Hero> createWarBand(int team) 
    {

        Random rand = new Random();

        ArrayList<Hero> Warband = new ArrayList<>();

        for (int i = 0; i < 10; i++) 
        {
            int diceRandom = rand.nextInt(6);

            switch (diceRandom) 
            {
                case 0:
                    
                    Warband.add(new Bolter(Game.NamesEnum.getName(),0,0,team));
                    break;
                case 1:
                    Warband.add(new Archer(Game.NamesEnum.getName(),0,0,team));
                    break;
                case 2:
                    Warband.add(new Peasant(Game.NamesEnum.getName(),0,0,team));
                    break;
                case 3:
                    Warband.add(new Warlock(Game.NamesEnum.getName(),0,0,team));
                    break;
                case 4:
                    Warband.add(new Healer(Game.NamesEnum.getName(),0,0,team));
                    break;  
                case 5:
                    Warband.add(new Rouge(Game.NamesEnum.getName(),0,0,team));
                    break;
                case 6:
                    Warband.add( new Warrior(Game.NamesEnum.getName(), 0,0,team));
                    break;     
                default:
                    
                    break;
            }
        }

        
        
        Warband.sort( new Comparator<Hero>() {

            @Override

            public int compare(Hero o1, Hero o2) {

               return (int) (o2.getSpeed() - o1.getSpeed());

            }  

        });

        return Warband;
        
    }

    public static void isEnemy(Hero unit, ArrayList<Hero> Warband) 
    {
        
        for (Hero hero : Warband) 
        {
            if (unit.equals(hero))
            {
                System.out.println("КУДА СТРЕЛЯЕШЬ ГАД!!!");
            } 
            else
            {
                System.out.println(unit.name + unit.team + "  ВРАГ  " + hero.name + hero.team);
            }
        }
       
    }

}