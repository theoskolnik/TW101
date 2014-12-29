/**
 * Created by theodoraskolnik on 12/29/14.
 */
public class Troll implements Monster {

    private int hitpoints;

    public Troll() {
        hitpoints = 40;
    }

    public void takeDamage(int amount){
        int newAmount = amount / 2;
        hitpoints -= newAmount;
    }

    public String name() {
        return "Troll";
    }

    public int currentHitpoints() {
        return hitpoints;
    };
}