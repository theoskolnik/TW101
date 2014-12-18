/**
 * Created by theodoraskolnik on 12/12/14.
 */
public class Main {

    public static void main(String[] args) {

        Rectangle[] myRectangles = new Rectangle[5];


        myRectangles[0] = new Rectangle();
        myRectangles[0].height = 1;
        myRectangles[0].width = 2;

        myRectangles[1] = new Rectangle();
        myRectangles[1].height = 1;
        myRectangles[1].width = 2;

        myRectangles[2] = new Rectangle();
        myRectangles[2].height = 1;
        myRectangles[2].width = 2;

        myRectangles[3] = new Rectangle();
        myRectangles[3].height = 1;
        myRectangles[3].width = 2;

        myRectangles[4] = new Rectangle();
        myRectangles[4].height = 1;
        myRectangles[4].width = 2;

        int x = 0;
        int totalArea = 0;
        while(x < 5) {
            totalArea = totalArea + myRectangles[x].area();
            x++;
        }

        int averageArea = totalArea / myRectangles.length;
        System.out.println(averageArea);
    }
}
