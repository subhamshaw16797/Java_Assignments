package exercise6;

/*
 * Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers.
 */

import java.util.Scanner;

public class NaturalNumbersDifference {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter a range: ");
		int n = scn.nextInt();

		// Invoking the method and display
		System.out.println("Difference between sum of square and square of sum is: " + calculateDifference(n));

		// Closing of resource.
		scn.close();
	}

	// Method for difference between the sum of the squares and the square of the
	// sum of the first n natural numbers.
	static int calculateDifference(int n) {
		int sum1 = 0;
		int sum2 = 0;
		int difference = 0;

		for (int i = 0; i <= n; i++) {
			sum1 += (i * i);
			sum2 += i;
		}
		int squareOfSum = (sum2 * sum2);
		difference = squareOfSum - sum1;
		return difference;

	}

}
