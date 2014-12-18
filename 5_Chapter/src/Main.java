/**
 * Created by theodoraskolnik on 12/18/14.
 */

//Write a program that chooses a random number between 1 and 100.
// Then asks the user to enter a guess. If they guess right
// then tell them they win, otherwise tell them if they guessed too high or low.
// Keep asking the user to guess until they get the right answer.
// Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();

//      get guess from user
        GameHelper helper = new GameHelper();

        boolean guessIsRight = false;

        while(!guessIsRight) {
            String guess = helper.getUserInput("Guess a number from 1 to 100: ");
            String result = number.checkGuess(guess);

            if (result.equals("correct")) {
                guessIsRight = true;
                System.out.print("You guessed correctly!");
                break;
            }

            System.out.println(result);
        }
    }
}
