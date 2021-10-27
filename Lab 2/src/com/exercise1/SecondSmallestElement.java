package com.exercise1;

/*
 * Create a method which accepts an array of integer elements and return the second smallest element in the array.
 */
import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// to take size of the array from user
		System.out.println("Enter the size of an array: ");
		int length = scn.nextInt();

		int[] arr = new int[length];
		System.out.println("Enter " + length + " elements in array: ");

		for (int i = 0; i < length; i++) {
			// reading array elements from the user
			arr[i] = scn.nextInt();
		}

		// invooking the method
		System.out.println("Smallest element in the given array is: " + secondSmallestNumber(arr));

		// Closing of resource
		scn.close();
	}

	// method to return the second smallest element from a array.
	static int secondSmallestNumber(int[] a) {
		int smallest1 = a[0];
		int smallest2 = a[0];

		// logic to find the second smallest array
		for (int i = 1; i < a.length; i++) {
			if (a[i] < smallest1) {
				smallest2 = smallest1;
				smallest1 = a[i];
			}

			else if (a[i] < smallest2 && a[i] != smallest1 || smallest1 == smallest2) {
				smallest2 = a[i];
			}
		}
		return smallest2;
	}

}
