package com.exercise3;

import java.util.Scanner;

public class ReplaceConsonants {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		//user input
		System.out.println("Enter a word: ");
		String str= scn.nextLine();
		System.out.println("Given string is: "+str);
		
		System.out.println("After removing consonants: "+alterString(str));
		
		//closing resourse
		scn.close();
		

	}
	
	//declare all consonants as constant
	private static final String CONSONANTS= "bcdfghjklmnpqrstvwxyz";
	
	//logic to replace consonants with the next consonant value
	public static String alterString(String str) {
		
		char[] chars= str.toLowerCase().toCharArray();
		for(int i =0; i<chars.length; i++) {
			int index= CONSONANTS.indexOf(chars[i]);
			if(index != -1) {
				chars[i]= CONSONANTS.charAt((index+1) % CONSONANTS.length());
			}
		}
		return new String(chars);
	}

}
