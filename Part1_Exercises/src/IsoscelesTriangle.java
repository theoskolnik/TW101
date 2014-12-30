/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class IsoscelesTriangle {
    public int maxStars;

    public int setMaxStars(int n) {
        int maxStars = 1;
        for (int i = 1; i < n; i++) {
            maxStars += 2;
        }
        return maxStars;
    }

    public void numLines(int n) {
        int spaces = setMaxStars(n) / 2;
        for (int i = 1; i < (n * 2); i += 2) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces--;

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
        System.out.println("");
        }
    }

    public static void main(String[] args) {
        IsoscelesTriangle i = new IsoscelesTriangle();
        i.numLines(3);
    }
}
