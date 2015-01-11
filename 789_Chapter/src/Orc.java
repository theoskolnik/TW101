/**
 * Created by theodoraskolnik on 12/29/14.
 */

public class Orc implements Monster {

    private int hitpoints;

    public Orc() {
        hitpoints = 20;
    }

    public void takeDamage(int amount){
        hitpoints -= amount;
    }

    public String name() {
        return "Orc";
    }

    public int currentHitpoints() {
        return hitpoints;
    };
}
