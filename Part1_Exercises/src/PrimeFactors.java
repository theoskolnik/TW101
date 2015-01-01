import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class PrimeFactors {

    public void generate(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            if ((n % i == 0) && isPrime(i)) {
                primeFactors.add(i);
                n /= i;

            }
        }

        for (Integer i : primeFactors) {
            System.out.print(i + " ");
        }
    }

    public boolean isPrime(int n) {
        for (int i = (n - 1); i > 0; i--) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        pf.generate(30);
    }
}
