/**
 * Created by theodoraskolnik on 12/18/14.
 */
public class Guess {
    private int number;

    public Guess(String guess) {
        this.number = Integer.parseInt(guess);
    }

    public int getGuess() {
        return number;
    }
}
