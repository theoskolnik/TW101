import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/18/14.
 */

//Create a new version of the Chapter 5 problem where you also
// record all of the users guesses and
// print them out once they guess correctly.
// Use an ArrayList to store the guesses.

public class Main {

    public static void main(String[] args) {

        RandomNumber number = new RandomNumber();

//      get guess from user
        GameHelper helper = new GameHelper();
        ArrayList<Guess> myGuesses = new ArrayList<Guess>();

        boolean guessIsRight = false;

        while(!guessIsRight) {
            String guess = helper.getUserInput("Guess a number from 1 to 100: ");
            Guess guessObject = new Guess(guess);
            myGuesses.add(guessObject);
            String result = number.checkGuess(guessObject.getGuess());

            if (result.equals("You guessed correctly!")) {
                guessIsRight = true;
                System.out.println(result);
                System.out.println("You guessed " + myGuesses.size() + " times.");
                System.out.print("Your guesses: ");
                for ( Guess g : myGuesses) {
                    System.out.print(g.getGuess() + " ");
                }
                break;
            }
            System.out.println(result);
        }
    }
}