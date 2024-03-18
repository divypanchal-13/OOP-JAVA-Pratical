/*
3.	Define a class called Cartesian Point, which has two instance variables, x and y. Provide the methods get X() and get Y() to return the values of the x and y values respectively, a method called move() which would take two integers as parameters and change the values of x and y respectively, a method called display() which would display the current values of x and y. Now overload the method move() to work with single parameter, which would set both x and y to the same values,provide constructors with two parameters and overload to work with one parameter as well. Now define a class called Test Cartesian Point, with the main method to test the various methods in the Cartesian Point class.
 */
public class Pratical_3_3 {
  
    public static void main(String[] args) {
      CartesianPoint point1 = new CartesianPoint(3, 5);
  
      System.out.print("Point 1 (initial): ");
      point1.display();
  
      point1.move(2, -1);
  
      System.out.print("Point 1 (after move(2, -1)): ");
      point1.display();
  
      CartesianPoint point2 = new CartesianPoint(10);
  
      System.out.print("Point 2 (initial): ");
      point2.display();
  
      point2.move(7);

      System.out.print("Point 2 (after move(7)): ");
      point2.display();
    }
}
class CartesianPoint {
    private int x;
    private int y;
    public CartesianPoint(int x, int y) {
      this.x = x;
      this.y = y;
    }
    public CartesianPoint(int value) {
      this.x = value;
      this.y = value;
    }
    public int getX() {
      return x;
    }
    public int getY() {
      return y;
    }
    public void move(int dx, int dy) {
      this.x += dx;
      this.y += dy;
    }
    public void move(int value) {
      this.x = value;
      this.y = value;
    }
    public void display() {
      System.out.println("(" + x + ", " + y + ")");
    }
}
  

  
      


