/**
 * Created by theodoraskolnik on 12/30/14.
 */
public class Diamond {
    public int maxStars;
    public int spaces;

    public void printDiamond(int n){
        setMaxStars(n);
        setSpaces();
        printTop(n);
        printMiddle();
        printBottom(n);
    }

    public void setMaxStars(int n) {
        int counter = 1;
        for (int i = 1; i < n; i++) {
            counter += 2;
        }
        maxStars = counter;
    }

    public void setSpaces() {
        spaces = maxStars / 2;
    }

    public void printTop(int n) {
        for (int i = 1; i < (n * 2); i += 2) {
            if(spaces == 0) {
                break;
            }
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

    public void printMiddle() {
        for (int i = 0; i < maxStars; i++) {
            System.out.print("*");
        }
        System.out.println("");
        spaces++;
    }

    public void printBottom(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            spaces++;

            maxStars -= 2;

            for (int k = maxStars; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Diamond i = new Diamond();
        i.printDiamond(3);
    }
}
