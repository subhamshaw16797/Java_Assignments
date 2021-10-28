/*
 * Create a method that accepts a character array and count the number of times each character is present in the array.
 */

package com.exercise2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfChar {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// Taking input from user
		System.out.println("Enter a String to count the chars: ");
		String str = scn.next();

		// Convert the string to char array
		char[] arr = str.toCharArray();

		// Fetching each char from char array
		for (char ch : arr) {
			System.out.println("original char array contains: " + ch + " ");
		}

		System.out.println();

		// invoking the function
		getValues(arr);
	}

	// creating a method to count each char occurrence in char array
	public static Map<Character, Integer> getValues(char[] arr) {

		// Creating a LinkedHashMap
		// Contain char as a key and occurrence as a value
		Map<Character, Integer> map = new LinkedHashMap<>();

		// checking each char from char array
		for (char ch : arr) {
			if (map.containsKey(ch)) {

				// if char is present in map,
				// incrementing it's count by 1
				map.put(ch, map.get(ch) + 1);
			} else {
				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				map.put(ch, 1);
			}
		}

		// Fetching each char and the occurrence of the each char
		// and printing the same
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// return the resultant map to the method
		return map;
	}

}
