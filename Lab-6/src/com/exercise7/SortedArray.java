/*
 * Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 */

package com.exercise7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortedArray {

	public static void main(String[] args) {
		
		// Creating treeset to store user inputs
		TreeSet<Integer> set= new TreeSet<>();
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int n= scn.nextInt();
		
		System.out.println();
		System.out.println("Enter "+n+" no.s of elements: ");
		// taking elements from user and adding to treeset
		for(int i= 0; i<n; i++) {
			int num= scn.nextInt();
			set.add(num);
		}
		
		// Invoking the method and then displaying the result
		Integer[] result= getSorted(set);
		System.out.println("Array after reversing and sorted: ");
		for(int x: result) {
			System.out.println(x+" ");
		}

	}
	
	
	//Creating a method for revering the array and then sorting
	public static Integer[] getSorted(TreeSet<Integer> arr) {
		
		// fetching the array size
		int size= arr.size();
		// creating Integer class array to store after operation
		Integer[] intArr= new Integer[size];
		intArr= arr.toArray(intArr);
		
		// logic for converting Integer object to String and then reverse
		for(int i=0; i<size; i++) {
			
			// fetching each elements from Integer array and convert it to string and store it in a String type
			String str= String.valueOf(intArr[i]);
			// reverse the string by the help of StringBuilder
			String revStr= new StringBuilder(str).reverse().toString();
			// And again covert the String object to Integer
			intArr[i]= Integer.parseInt(revStr);
		}
		
		// Sorting the array and then return the resultant array
		Arrays.sort(intArr);
		return intArr;
	}

}
