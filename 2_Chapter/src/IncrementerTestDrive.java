/**
 * Created by theodoraskolnik on 12/9/14.
 */

// Create a main method that calls increment 5 times and then calls total.

public class IncrementerTestDrive {
    public static void main(String[] args) {

        Incrementer i = new Incrementer();

        for(int x = 0; x < 5; x++) {
            i.increment();
        }

        i.total();
    }
}
