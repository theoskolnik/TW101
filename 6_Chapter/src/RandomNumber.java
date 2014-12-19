/**
 * Created by theodoraskolnik on 12/18/14.
 */

public class RandomNumber {
    int answer;

    public RandomNumber(){
        this.answer = (int) (Math.random() * 100);
    }

    public String checkGuess(int guessObjectNumber) {

        String result = "incorrect";
        if (guessObjectNumber == this.answer) {
            result = "You guessed correctly!";
        } else if (guessObjectNumber < this.answer) {
            result = "Your guess was too low.";
        } else if (guessObjectNumber > this.answer) {
            result = "Your guess was too high.";
        }
        return result;
    }
}
