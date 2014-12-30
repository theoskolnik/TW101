/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class VerticalLine {
    public void numAsterisks(int n) {
        for (int x = n; x > 0; x--) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        VerticalLine v = new VerticalLine();
        v.numAsterisks(3);
    }
}
