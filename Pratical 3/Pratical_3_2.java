/*
Design a class named Rectangle to represent a rectangle. The class contains: Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
●	A no-arg constructor that creates a default rectangle.
●	A constructor that creates a rectangle with the specified width and height.
●	A method named getArea() that returns the area of this rectangle.
●	A method named getPerimeter() that returns the perimeter.
Write a test program that creates two Rectangle objects—one with width 4 and height 40 and the other with width 3.5 and height 35.9. Display the width, height, area, and perimeter of each rectangle in this order.
 */
public class Pratical_3_2 {
 
    public static void main(String[] args) {
      
      Rectangle rect1 = new Rectangle(4.0, 40.0);
      Rectangle rect2 = new Rectangle(3.5, 35.9);
  
      
      System.out.println("Rectangle 1:");
      System.out.println("  Width: " + rect1.width);
      System.out.println("  Height: " + rect1.height);
      System.out.println("  Area: " + rect1.getArea());
      System.out.println("  Perimeter: " + rect1.getPerimeter());
  
      System.out.println("\nRectangle 2:");
      System.out.println("  Width: " + rect2.width);
      System.out.println("  Height: " + rect2.height);
      System.out.println("  Area: " + rect2.getArea());
      System.out.println("  Perimeter: " + rect2.getPerimeter());
    }
}

class Rectangle {

    double height;
    double width;
 
   public Rectangle() {
     this.width = 1.0;
     this.height = 1.0;
   }
   public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
   }
   public double getArea() {
     return width * height;
   }
   public double getPerimeter() {
     return 2 * (width + height);
   }
}
 

