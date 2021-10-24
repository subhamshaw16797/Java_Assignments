package exercise1;

/*
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */

import java.util.Scanner;

public class SumOfCubesOfDigits {

	public static void main(String[] args) {

		// ask for user input
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to sum of cubes: ");
		int num = scn.nextInt();
		System.out.println("Sum of the cubes of the digits of the number " + num + " is: " + displaySum(num));

		// closing of resource.
		scn.close();

	}

	// create a method to find sum of cubes of digit
	public static int displaySum(int num) {

		int sum = 0;

		while (num != 0) {

			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, 3);
			num /= 10;
		}
		return sum;
	}

}
