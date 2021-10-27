package com.exercise1;

import java.util.Scanner;

public class AgeValidation {
	
	static Scanner scn;

	public static void main(String[] args) {
		
		checkAge();

	}
	
	//for checking a age is valid or not
	public static void checkAge() {
		
		
		scn= new Scanner(System.in);
		System.out.println("This game is made for 15+. ");
		System.out.println("Enter valid age to play the game: ");
		
		//asking for user input
		int age= scn.nextInt();
		
		try {
			
			//logic of check the age
			if(age<=0) {
				throw new InvalidNumberException("Invalid Input.");
			}
			else if (age<15) {
				throw new InvalidAgeException("Sorry, This game is for 15+. you can't play the game");
			}
			else {
				System.out.println("You can play the game. Enjoy!!!!!");
			}
			
		} catch (InvalidAgeException iage) {
			
			System.out.println("You are resticted to play the game");
			
		}catch (InvalidNumberException in) {
			System.out.println("Please give greater than 0");
		}
		
	}

}
