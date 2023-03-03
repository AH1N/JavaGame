package Game;
// import Game.NamesEnum;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import classes.Peasant;
import classes.Bolter;
import classes.Healer;
import classes.Rouge;
import classes.Warlock;
import classes.Warrior;
import classes.Archer;




public class Combat {
    static final int UNITS = 10;
    public static ArrayList<Hero> allTeam = new ArrayList<>();
    public static ArrayList<Hero> holyTeam = new ArrayList<>();
    public static ArrayList<Hero> darkTeam = new ArrayList<>();
    public static void main(String[] args) 
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        user_input.nextLine();

        holyTeam = createWarBand(0);
        darkTeam = createWarBand(10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);

        System.out.println("-------------------------------------------");
        
        // while (true){
        //     View.view();
        //     user_input.nextLine();
        //     for (Hero hero: allTeam) {
        //         if (holyTeam.contains(hero)) hero.step(holyTeam, darkTeam);
        //         else hero.step(darkTeam, holyTeam);
        //     }
        // }
    
        // Game.Hero.isEnemy(holyTeam.get(0), darkTeam);
        // Game.Hero.isEnemy(darkTeam.get(0), holyTeam);
        // (holyTeam.get(0)).isAlive();
        // (darkTeam.get(0)).isAlive();

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
                    Warband.add(new Bolter(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;
                case 1:
                    Warband.add(new Archer(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;
                case 2:
                    Warband.add(new Peasant(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;
                case 3:
                    Warband.add(new Warlock(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;
                case 4:
                    Warband.add(new Healer(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;  
                case 5:
                    Warband.add(new Rouge(Game.NamesEnum.getName(), team, new Point(team, i)));
                    break;
                case 6:
                    Warband.add( new Warrior(Game.NamesEnum.getName(), team, new Point(team, i)));
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

}