package exercise3;

/*
 * The Fibonacci sequence is defined by the following rule.
 * The first 2 values in the sequence are 1, 1.
 * Every subsequent value is the sum of the 2 values preceding it.
 * Write a Java program that uses both recursive functions to print the nth value of the Fibonacci sequence?
 */

import java.util.Scanner;

public class FindNumberFromFibonacciSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Ask for user input
		System.out.println("Enter a number to find the number from fibonacci series: ");
		int n = scn.nextInt();

		// logic to display the result by calling the method.
		if (fibbo(n) == 0)
			System.out.println("Invalid input.");
		else {
			System.out.println(fibbo(n));
		}

	}

	// Recursive method to find the fibonacci series
	public static int fibbo(int n) {
		if (n == 0)
			return 0;
		if (n <= 2)
			return 1;
		return fibbo(n - 1) + fibbo(n - 2);
	}

}
