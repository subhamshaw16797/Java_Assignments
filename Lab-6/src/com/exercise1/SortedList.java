package com.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class SortedList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hMap= new HashMap<>();
		hMap.put("Java", 60);
		hMap.put("Oracle", 56);
		hMap.put("HTML", 65);
		hMap.put("JavaScript", 70);
		hMap.put("React", 80);
		hMap.put("CSS",45);
		
		//invoking the method
		getValue(hMap);

	}
	
	public static List getValue(HashMap<String,Integer> hMap) {
		
		//store in map
		Map<String,Integer> map= hMap;
		
		//display all the key value pair
		for(Entry<String, Integer> entry: map.entrySet()) {
			System.out.println("Key: "+ entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println();
		List<Integer> list= new ArrayList<>(map.values());
		for(Integer ele: list)
			System.out.println("Values before sorting: "+ele);
		
		//sorting the list
		Collections.sort(list);
		
		System.out.println();
		for(Integer ele: list) {
			System.out.println("Values after sorting: "+ele);
		}
		
		return list;
	}
	
}
