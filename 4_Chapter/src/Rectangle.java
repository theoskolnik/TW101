/**
 * Created by theodoraskolnik on 12/18/14.
 */

//Create a new version of the Chapter 3 exercise
// where you pass the height and width into the Rectangle constructor
// and initialize the instance variables there.
// Add a perimeter() method to Rectangle.
// Print the total area of all rectangles.
// Print the total perimeter of all rectangles.

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

    public int perimeter() {
        int perimeter = (2*height) + (2*width);
        return perimeter;
    }

}