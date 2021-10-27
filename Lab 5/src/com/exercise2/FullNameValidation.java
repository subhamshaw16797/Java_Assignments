package com.exercise2;

import java.util.Scanner;

public class FullNameValidation {

	public static void main(String[] args) {
		
		checkName();

	}
	
	public static void checkName() {
		
		Scanner scn= new Scanner(System.in);
		
		//User input for first name
		System.out.println("Enter your first name: ");
		String fName= scn.next();
		System.out.println("Enter your last name: ");
		String lName= scn.next();
		
		try {
		
			if(!(fName.isEmpty() || lName.isEmpty())) {
				System.out.println("Full name is: "+fName+" "+lName);
			}
			
		} catch (InvalidNameException in) {
			System.out.println("Please give proper name.");
		}
	}
}


//logic for extracting each char from string
		/*int temp = 0;
		for(int i= 0; i<fName.length();i++) {
			char ch;
          ch=fName.charAt(i);
          if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
               temp=1;
		}
		
		//try block for first name
		try {
			
			//logic to check first name
			if(temp!=1) {
				
				System.out.println("Enter last name: ");
				String lName= scn.next();
				int temp1 = 0;
				for(int i= 0; i<lName.length();i++) {
					char ch;
		            ch=lName.charAt(i);
		            if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
		                 temp1=1;
				}
				
				//try block for last name
				try {
					
					//logic to check last name
					if(temp1!=1) {
						System.out.println("Full name is: "+fName+" "+lName);
					}
					else {
						throw new InvalidNameException("Name is not valid.");
						
					}
				}catch (InvalidNameException in) {
					System.out.println("Please give proper name.");
				}
			}
			else {
				throw new InvalidNameException("Name is not valid.");
			}
				*/
