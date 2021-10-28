/*
 * school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
The input Hashmap contains the student registration number as key and mark as value. 
The output Hashmap should contain the student registration number as key and the medal type as value.

 */

package com.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentDetails {

	public static void main(String[] args) {

		HashMap<String, Integer> student = new HashMap<>();

		student.put("Ram", 68);
		student.put("Shyam", 70);
		student.put("Hari", 96);
		student.put("A", 86);
		student.put("Mohit", 80);
		student.put("Sonu", 59);

		// Invoking the method and store the result in map
		Map<String, String> stdDetails = getStudent(student);

		// iterating the results
		for (Entry<String, String> entry : stdDetails.entrySet())
			System.out.println(entry.getKey() + " won " + entry.getValue());
	}

	// Creating a method to perform the given operation
	public static HashMap<String, String> getStudent(HashMap<String, Integer> student) {

		HashMap<String, String> stdDetails = new HashMap<>();

		// Fetching the key from input hashmap and store it in a set
		Set<String> set = student.keySet();

		// Logic for perform the operation in given condition
		for (String s : set) {
			Integer marks = student.get(s);

			if (marks > 90)
				stdDetails.put(s, "Gold");
			else if (marks < 90 && marks >= 80) {
				stdDetails.put(s, "Silver");
			} else if (marks < 80 && marks >= 70) {
				stdDetails.put(s, "Bronze");
			}
//			else {
//				System.out.println("Not eligible for medal.");
//			}
		}

		// return the resultant hashmap
		return stdDetails;
	}
}
