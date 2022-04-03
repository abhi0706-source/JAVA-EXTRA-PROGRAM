
/**
Write a program to find the largest of two numbers using a user defined method.
*/

import java.util.Scanner;

public class Ext4a {

	public static void main(String[] args) {
		int a, b, x;
		Scanner in = new Scanner(System.in);

		System.out.print("\nPlease enter a first number:");
		a = in.nextInt();
		System.out.print("\nPlease enter a Second number:");
		b = in.nextInt();

		x = largestNumber(a, b);

		System.out.println("\nThe largest number is :" + x);
	}

	public static int largestNumber(int a, int b) {

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;

	}
}