
/*
1. Write a simple java application that creates an interface Shape. The interface
declares read() and show() methods and PI as constant data member. Create
classes Rectangle and Circle that implement a shape interface. Assume
suitable data and member methods
*/

import java.util.*;

public class Ex6_a {

    public static void main(String[] args) {

        // Ractangle class object.
        Ractangle ract_object = new Ractangle();

        // Cricle class object.
        Circle cir_object = new Circle();

        // Ractangle class object methods which is declard in shap(Interace).
        ract_object.show();
        ract_object.read();

        System.out.println("********************************************");

        // Circle class object methods which is declard in shap(Interace).
        cir_object.read();
        cir_object.show();

    }
}

// Interface class.
interface Shape {
    // Define static variable.
    double PI = 3.14;

    // Define public static methods.
    void read();

    void show();
}

class Ractangle implements Shape {

    // Define variable for Ractangle.
    private int len, wid, area;
    Scanner in = new Scanner(System.in);

    public void read() {

        // Take sides of Ractangle.
        System.out.print("\nEnter Length : ");
        len = in.nextInt();

        System.out.print("\nEnter width : ");
        wid = in.nextInt();

    }

    public void show() {

        // Find the area of Ractangle.
        area = len * wid;
        System.out.println("\nThe area of Ractangle : " + Math.round(area));
    }

}

class Circle implements Shape {

    // Define variable for Cricle.
    private double r, area;
    Scanner in = new Scanner(System.in);

    public void read() {

        // Take a radius of Ractangle from user.
        System.out.print("\nPlease enter radius : ");
        r = in.nextDouble();

        System.out.print("\nYou have enter a radius : " + r);
    }

    public void show() {

        // Find the area of Circle.
        area = PI * r * r;
        System.out.print("\nThe area of circle is : " + Math.round(area));
    }

}