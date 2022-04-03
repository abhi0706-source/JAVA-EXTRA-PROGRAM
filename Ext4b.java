
/**
Write a program which has two methods having name largest, first method should return largest of
two numbers and second should return largest of three numbers passed as an arguments. Use the
concept of method overloading.
*/

import java.util.Scanner;

public class Ext4b {

	public static void main(String[] args) {
		int a, b, c, x, y;

		Scanner in = new Scanner(System.in);

		System.out.print("\nPlease enter first number : ");
		a = in.nextInt();
		System.out.print("\nPlease enter second number : ");
		b = in.nextInt();
		System.out.print("\nPlease enter Third number : ");
		c = in.nextInt();

		x = large(a, b);
		y = large(a, b, c);

		System.out.print("\nThe largest value of two number is :" + x);
		System.out.print("\nThe largest value of three number is :" + y);

	}

	public static int large(int a, int b) {

		int max;

		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;

	}

	public static int large(int a, int b, int c) {

		int max = 0;

		if (a > b) {
			if (a > c) {
				max = a;
			}
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}

		return max;

	}
}