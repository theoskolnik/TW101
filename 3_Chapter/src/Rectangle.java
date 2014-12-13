/**
 * Created by theodoraskolnik on 12/12/14.
 */

//Create an array of 5 Rectangles (each with height
// and width instance variables and an area() method).
// Find the average area of the rectangles.

public class Rectangle {
    int height;
    int width;

    public Rectangle(int h, int w) {
        this.height = h;
        this.width = w;
    }

    public int area() {
       int area = height * width;
       return area;
    }

}
