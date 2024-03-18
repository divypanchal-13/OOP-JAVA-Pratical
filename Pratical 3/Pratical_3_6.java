/*
 6.	Define Class named Point which represents 2-D Point, i.e P (x, y).  Define Defaultconstructor to initialize both data member value 5, Parameterized constructor to initialize member according to value supplied by user and Copy Constructor. Define Necessary Function and Write a program to test class Point.
 */

public class Pratical_3_6 {
    public static void main(String[] args) {
       
        Point point1 = new Point();
        System.out.println("Point 1 (default constructor): " + point1);
    
        Point point2 = new Point(10, 20);
        System.out.println("Point 2 (parameterized constructor): " + point2);

        Point point3 = new Point(point2);
        System.out.println("Point 3 (copy constructor): " + point3);
    
        point2.setX(30);
        System.out.println("Modified Point 2: " + point2);
        System.out.println("Point 3 (unchanged after modification): " + point3);
    }
}
class Point {
    private int x;
    private int y;

    public Point() {
      this.x = 5;
      this.y = 5;
    }

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public Point(Point other) {
      this.x = other.x;
      this.y = other.y;
    }

    public int getX() {
      return x;
    }

    public void setX(int x) {
      this.x = x;
    }

    public int getY() {
      return y;
    }

    public void setY(int y) {
      this.y = y;
    }

    public String toString() {
      return "Point(" + x + ", " + y + ")";
    }
}
