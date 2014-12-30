/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class RightTriangle {

    public void numLines(int n) {
        for (int x = 1; x <= n; x++) {
            for (int i = x; i > 0; i--) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        RightTriangle r = new RightTriangle();
        r.numLines(3);
    }
}
