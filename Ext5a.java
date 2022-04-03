
//Design a class named Triangle to represent a Triangle. The class contains:
//Three double data fields named a, b and c specifying three sides of the triangle. The default
//values are 1.
//A no-arg constructor that creates a default triangle.
//A constructor that creates a triangle with the specified values.
//A method named getArea() that returns the area of this triangle.
//A method named getPerimeter() that returns the perimeter.*/

import java.lang.reflect.Constructor;
import java.util.Scanner;

class PracticeTriangle {
  double a, b, c;

  // create defult constructor
  public PracticeTriangle() {
    this.a = 1;
    this.b = 1;
    this.c = 1;

    // double TriArea, TriParimeter;

    /*
     * // calling methods
     * TriArea = getArea(a, b, c);
     * TriParimeter = getParimeter(a, b, c);
     */

  }

  // create constructor by passing argument
  public PracticeTriangle(double x, double y, double z) {
    this.a = x;
    this.b = y;
    this.c = z;

    // calling defult constructor
    // this();

    // double TriArea, TriParimeter;

    /*
     * // calling methods
     * TriArea = getArea(x, y, z);
     * TriParimeter = getParimeter(x, y, z);
     */

  }

  // Find the area of triangle by user define method...
  public double getParimeter() {
    double parimeter;
    parimeter = a + b + c;
    return parimeter;
  }

  // Find the parimeter of triangle by user define method...
  public double getArea() {
    double area;
    area = a * b * c;
    return area;
  }

}

// public class
public class Ext5a {
  // main method
  public static void main(String[] args) {
    double a, b, c;

    Scanner in = new Scanner(System.in);
    // take a value of l,b,h from user;
    System.out.print("\nPlease enter the three side of triangle l,b,h. :");
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    // Create object of class and also called the defult constructor of this class.
    PracticeTriangle p1 = new PracticeTriangle();
    System.out.print("\n\nFor Defult Triangle...");
    System.out.print("\nThe area of  defult triangle is : " + p1.getArea());
    System.out.print("\nThe Parimeter of  defult triangle is : " + p1.getParimeter());

    // Create object of class and also called the user define constructor of this
    // class.
    PracticeTriangle p2 = new PracticeTriangle(a, b, c);
    System.out.print("\n\nFor User define Triangle...");
    System.out.print("\nThe area of  given triangle is : " + p2.getArea());
    System.out.print("\nThe Parimeter of  given triangle is : " + p2.getParimeter());

  }
}