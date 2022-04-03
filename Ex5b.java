/*2. Demonstrate the static data field and static method by creating an appropriate class.
Demo this class in the main method by creating different objects.*/

public class Ex5b {
    /*
     * if variables are not static
     * static class Demo{
     * int a=10;
     * int b=20;
     * void updateAndPrint()
     * {
     * a++;
     * b++;
     * System.out.println(a + " " + " " + b);
     * }
     * }
     * if variables are static
     */

    static class Demo {
        static int a = 10;
        static int b = 20;

        static void updateAndPrint() {
            a++;
            b++;
            System.out.println(a + " " + " " + b);
        }
    }

    public static void main(String[] args) {
        Demo myObj = new Demo();
        myObj.updateAndPrint();
        Demo myObj1 = new Demo();
        myObj1.updateAndPrint();
    }
}