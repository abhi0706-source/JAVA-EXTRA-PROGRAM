/*
Write a program which has array_copy method to copy contents from one integer array to another.
Display contents of the copied array in the main method.
*/

import java.util.Scanner;

public class Ext4c {

    public static void main(String[] args) {

        // variable define.
        int n;
        int[] a;
        int[] array;

        Scanner in = new Scanner(System.in);

        // Take a number of element which your want to inserted in array.
        System.out.print("\nPlease enter number of element Which you want insert in array: ");
        n = in.nextInt();

        // create a different objects of array.
        a = new int[n];
        array = new int[n];

        // Take a insert element in array.
        for (int i = 0; i < a.length; i++) {
            System.out.print("\nPlease enter a number : ");
            a[i] = in.nextInt();
        }

        // Array which we want to copy.
        System.out.print("\nYour Array...\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // calling a function which is return an copied array to user.
        array = array_copy(a);

        // Print the copied array.
        System.out.print("\nCopied Array...\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");

    }

    // The which is copy one array to another array.
    static int[] array_copy(int[] a) {

        // Create another array.
        int[] x;

        // Create another array object.
        x = new int[a.length];

        // Assigned one value of one array to another array.
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }

        // Return the copied array.
        return x;
    }

}