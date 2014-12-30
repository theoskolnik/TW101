import java.util.ArrayList;
import java.util.List;

/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class PrimeFactors {

    public void generate(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();

        int divider = 2;

        while (n > 2) {
            if ((n % divider == 0) && (isPrime(divider))) {
                primeFactors.add(divider);
                n /= divider;
                divider += 1;
                generate(n);
            } else {
                while (!isPrime(divider)) {
                    divider += 1;
                }
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
