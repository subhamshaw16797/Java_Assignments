package com.exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SquareofNumbers {
	
	static Scanner scn= new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Enter Size of the array: ");
	int size= scn.nextInt();
	
	int[] arr= new int[size];
	
	System.out.println();
	System.out.println("Enter "+size+" numbers you wants to do square: ");
	for(int i=0; i<size; i++) {
		arr[i]= scn.nextInt();
	}
	
	System.out.println();
	System.out.println("Original array: ");
	for(int n: arr)
		System.out.println(n);
	
	// Invoking the method
	Map<Integer, Integer> map= getSquares(arr);
	
	System.out.println();
	System.out.println("Squares of each numbers are: ");
	// Fetching each number and square of the each number
	// and printing the same
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	}
	

	public static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map= new HashMap<>();
		
		for(int n: arr) {
			map.put(n, n*n);
		}
		
		return map;
		
	}
}
