/*
 * Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. 
 * A person is eligible for vote if his age is greater than 18. 
 * Add the IDs of all the eligible persons to list and return the list. 
 */

package com.exercise6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class VoterList {

	public static void main(String[] args) {
		
		// Creating HashMap object and take id as key and age as value
		HashMap<String, Integer> map= new HashMap<>();
		
		map.put("K87D95U", 47);
		map.put("J87F89G", 16);
		map.put("H54T64I", 25);
		map.put("K47R55U", 18);
		map.put("J47F89G", 20);
		map.put("H64T34I", 90);
		
		// Invoking the function
		List<String> list= voterList(map);
		
		// Creating iterator to iterate the list
		Iterator<String> itr= list.iterator();
		System.out.println("Eligible ID's are: ");
		while(itr.hasNext())
			System.out.println(itr.next());

	}
	
	// Creating the method to perform whether a ID is eligible for vote or not
	public static List<String> voterList(HashMap<String, Integer> hMap) {
		
		// Creating one arraylist to store the resultant IDs
		List<String> list= new ArrayList<>();
		
		// Logic to check the age
		for(String id: hMap.keySet()) {
			int age= hMap.get(id);
			if(age>18) {
				list.add(id);
			}
		}
		return list;
	}

}
