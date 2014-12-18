/**
 * Created by theodoraskolnik on 12/18/14.
 */
public class RandomNumber {
    int number;

    public RandomNumber(){
        this.number = (int) (Math.random() * 100);
    }

    public String checkGuess(String userInput) {
        int guess = Integer.parseInt(userInput);

        String result = "incorrect";
        if (guess == this.number) {
            result = "correct";
        } else if (guess < this.number) {
            result = "Your guess was too low.";
        } else if (guess > this.number) {
            result = "Your guess was too high.";
        }
        return result;
    }
}
