package com.exercise5;

/*
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5.
 */

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter a number to find natural numbers: ");
		int n = scn.nextInt();
		System.out.println("Sum of natural numbers is: " + calculateSum(n));

		// Closing of resource
		scn.close();
	}

	// Method for Calculate Sum of natural numbers.
	static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		}
		return sum;
	}

}
