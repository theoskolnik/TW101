/**
 * Created by theodoraskolnik on 12/9/14.
 */

//Print the sum of all odd numbers from 1 to 100

public class OddSum {

    public static void main(String[] args) {
        int sum = 0;
        for(int x = 1; x < 100; x++){
            if(x % 2 == 1) {
                sum = sum + x;
            }
            x++;
        }
        System.out.println(sum);
    }
}
