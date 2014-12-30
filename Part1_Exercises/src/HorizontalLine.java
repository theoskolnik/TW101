/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class HorizontalLine {
    public void numAsterisks(int n) {
        while(n > 0){
            System.out.print("*");
            n--;
        }
    }

    public static void main(String[] args) {
        HorizontalLine h = new HorizontalLine();
        h.numAsterisks(8);
    }
}
