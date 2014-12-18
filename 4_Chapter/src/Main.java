import java.util.ArrayList;

/**
 * Created by theodoraskolnik on 12/18/14.
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(2, 2));

        int totalArea = 0;
        int totalPerimeter = 0;
        for(Rectangle rectangle : rectangles) {
            totalArea = totalArea + rectangle.area();
            totalPerimeter = totalPerimeter + rectangle.perimeter();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}

