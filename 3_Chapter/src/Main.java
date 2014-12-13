import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/12/14.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

        for(int x = 0; x < 5; x++){
            Rectangle rec = new Rectangle(1, 2);
            rectangles.add(rec);
        }

        int averageArea = 0;
        for(Rectangle rec : rectangles) {
            averageArea = averageArea + rec.area();
        }

        System.out.println(averageArea);
    }
}
