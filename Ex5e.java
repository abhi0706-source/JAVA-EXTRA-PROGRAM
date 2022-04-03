/*5. Write a simple java application that defines a class Complex with real(int) and
img(int) as data fields, no-argument constructor and parameterized constructor. The
class should have overloaded methods to perform addition of two Complex numbers
by passing objects as arguments. Demonstrate this keyword in a parameterized
constructor.*/

public class Ex5e {
    static class Complex {
        int real, img; // Data fields

        public Complex() {
            // No-arg constructor
        }

        public Complex(int x, int y) {
            this.real = x; // Parameterized constructor
            this.img = y;
        }

        public void addition(Complex myObj, Complex myObj1) {
            Complex add = new Complex();
            add.real = myObj.real + myObj1.real;
            add.img = myObj.img + myObj1.img; // Addition of two Complex Numbers
            System.out.println("Addition Of Two Complex Numbers:");
            System.out.println(add.real + " " + "+" + " " + "i" + add.img);
        }
    }

    public static void main(String[] args) {
        Complex myObj = new Complex(1, 2);
        Complex myObj1 = new Complex(7, 3);
        Complex obj = new Complex();

        System.out.println("Passing First Object as 1,2");
        System.out.println("Passing First Object as 7,3");
        obj.addition(myObj, myObj1);
    }
}