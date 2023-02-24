package Game;
import java.util.ArrayList;
import java.util.Random;

public class Tests {
    public static void main(String[] args) {
        
        ArrayList<Hero> wb1 = Game.Combat.createWarBand(1);
        ArrayList<Hero> wb2 =Game.Combat.createWarBand(2);
        // Random r = new Random();
        // NamesEnum[] types = NamesEnum.values();
        // // for (NamesEnum s : types) { System.out.println(s); }
        // String tstr = (types[r.nextInt(NamesEnum.values().length)]).toString();
        // // System.out.println((tstr).getClass());
        Hero a = wb1.get(0);
        // a.setHP();
        System.out.println(wb1.get(0).isAlive());

        isEnemy(a, wb2, 0);
    }

    

    public static void isEnemy(Hero unit, ArrayList<Hero> Warband, int n) 
    {
        if (unit.equals(Warband.get(n)))
        {
            System.out.println("КУДА СТРЕЛЯЕШЬ ГАД!!!");
        } 
        else
        {
            System.out.println(unit.name + unit.team + "  ВРАГ  " + Warband.get(0).name + Warband.get(0).team);
        }
    }
}

