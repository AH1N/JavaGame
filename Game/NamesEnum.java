package Game;
import java.util.Random;



public enum NamesEnum 
{
    OneName, Tuman, ThreMan, FourMan, FiveMan, SixMan, Seven, Vose, Nina;
    
    
    public static String getName() 
        {
            Random rand = new Random();
            NamesEnum[] current = NamesEnum.values();
            return (current[rand.nextInt(NamesEnum.values().length)]).toString();
        }
}






