/**
 * Created by theodoraskolnik on 12/9/14.
 */

//Create a class that counts how many times you call the method increment()
// and prints out that number when you call total().

public class Incrementer {
    int counter;

    public void increment() {
        counter++;
    }

    public void total() {
        System.out.println(counter);
    }
}
