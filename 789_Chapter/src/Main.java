import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/29/14.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList<Monster>();

        Orc o1 = new Orc();
        monsters.add(o1);

        Troll t1 = new Troll();
        monsters.add(t1);

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
