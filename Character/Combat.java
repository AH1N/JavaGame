package JavaGame.Character;

import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

import org.xml.sax.ErrorHandler;

import JavaGame.classes.Archer;
import JavaGame.classes.Bolter;
import JavaGame.classes.Healer;
import JavaGame.classes.Peasant;
import JavaGame.classes.Rouge;
import JavaGame.classes.Warlock;
import JavaGame.classes.Warrior;

public class Combat {

    public static void main(String[] args) 
    {
        
        // startCombat(createWarBand(), createWarBand());
        ArrayList one = createWarBand();


    }

    public static void startCombat(ArrayList<CharacterInterface> WarbandOne, ArrayList<CharacterInterface> WarbandTwo)
    {

    }
    
    public static ArrayList createWarBand() 
    {
        int сount = 10;

        Random rand = new Random();
        List<Character> Warband = new ArrayList<>();
        for (int i = 0; i < сount; i++) 
        {
            int diceRandom = rand.nextInt(6);

            switch (diceRandom) 
            {
                case 0:
                    Warband.add(new Bolter());
                    break;
                case 1:
                    Warband.add(new Archer());
                    break;
                case 2:
                    Warband.add(new Peasant());
                    break;
                case 3:
                    Warband.add(new Warlock());
                    break;
                case 4:
                    Warband.add(new Healer());
                    break;  
                case 5:
                    Warband.add(new Rouge());
                    break;
                case 6:
                    Warband.add(new Warrior());
                    break;     
                default:
                    // teams.add(new BaseHero());
                    break;

            return Warband;
            }
        }
    }
}
