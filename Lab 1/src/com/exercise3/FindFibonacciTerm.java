package com.exercise3;

/*
 * The Fibonacci sequence is defined by the following rule.
 * The first 2 values in the sequence are 1, 1.
 * Every subsequent value is the sum of the 2 values preceding it.
 * Write a Java program that uses both recursive functions to print the nth value of the Fibonacci sequence?
 */

import java.util.Scanner;

public class FindFibonacciTerm {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter the term: ");
		int n = scn.nextInt();

		// logic to display the result by calling the method.
		if (fibbo(n) == 0)
			System.out.println("Invalid input");
		else {
			System.out.println(fibbo(n));
		}

		// Closing of resource
		scn.close();
	}

	// Non-recursive method to find the fibonacci series
	public static int fibbo(int n) {
		int a = 1, b = 1, c;
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return a;
		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

}
