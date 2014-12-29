/**
 * Created by theodoraskolnik on 12/29/14.
 */

//Create Orc and Troll classes that implement a Monster interface
// with takeDamage(int amount), String name(), and int currentHitpoints() methods.
// Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage.
// After you have damaged all of the monsters, report the name and current hit points of all monsters.
//        Orcs are named “Orc” and have 20 initial hitpoints
//        Trolls are named “Troll”, have 40 hit points and only take half damage

interface Monster {

    public void takeDamage(int amount);
    public String name();
    public int currentHitpoints();

}