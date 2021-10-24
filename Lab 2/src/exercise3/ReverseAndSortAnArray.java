package exercise3;

/*
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 */
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortAnArray {

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

		// print the original array that takes from user
		System.out.println("Original Array is: ");
		for (int orArr : arr)
			System.out.print(orArr + " ");

		System.out.println();

		// invoke the sorted method and print
		getSorted(arr);
		for (int revSortArr : arr)
			System.out.print(revSortArr + " ");
		
		// Closing the resource
		scn.close();
	}

	// method for reverse the user given array then sort
	static int[] getSorted(int[] arr) {

		// logic for reverse
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		// displaying the reverse array
		System.out.println("Reverse array is: ");
		for (int revArr : arr)
			System.out.print(revArr + " ");
		System.out.println();

		// sort the reversed array
		System.out.println("Reverse Sorted Array is: ");
		Arrays.sort(arr);
		return arr;
	}

}
