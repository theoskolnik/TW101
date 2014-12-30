/**
 * Created by theodoraskolnik on 12/30/14.
 */

public class FizzBuzzGame {

    public void FizzBuzz(int n) {
        for (int i = 1; i < (n + 1); i++) {
            if((i % 5 == 0) && (i % 3 == 0)){
                System.out.println("FizzBuzz");
            } else if((i % 3 == 0)) {
                System.out.println("Fizz");
            } else if((i % 5 == 0)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzzGame fb = new FizzBuzzGame();
        fb.FizzBuzz(100);
    }
}

