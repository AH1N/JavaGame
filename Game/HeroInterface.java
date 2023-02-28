package Game;

import java.util.ArrayList;

interface HeroInterface {
    public void step(ArrayList<Hero> friendlyWarband, ArrayList<Hero> enemyWarband);
    public void ability(ArrayList<Hero> Warband);
    public void ability(Hero unit);
    // public void compare();
}






