import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/29/14.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Orc orc = new Orc();
        monsters.add(orc);

        Troll troll = new Troll();
        monsters.add(troll);

        for (Monster m : monsters) {
            m.takeDamage(10);
        }

        for (Monster m : monsters) {
            if(m.currentHitpoints() > 0) {
                System.out.println(m.name() + " has " + m.currentHitpoints() + " hitpoints.");
            } else {
                System.out.println(m.name() + " has no more hitpoints.");
            }
        }
    }
}
