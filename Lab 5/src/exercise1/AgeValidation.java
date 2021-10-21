package exercise1;

import java.util.Scanner;


//this is a user-defined exception
class InvalidAgeException extends RuntimeException{
	
	public InvalidAgeException(String s) {
		System.out.println(s);
	}
}

public class AgeValidation {
	
	static Scanner scn;

	public static void main(String[] args) {
		
		checkAge();

	}
	
	//for checking a age is valid or not
	public static void checkAge() {
		
		
		scn= new Scanner(System.in);
		System.out.println("This game is made for 15+.");
		System.out.println("Enter valid age to play the game: ");
		
		//asking for user input
		int age= scn.nextInt();
		
		try {
			
			//logic of check the age
			if(age<=0) {
				throw new InvalidAgeException("Invalid Input, Please give a valid age.");
			}
			else if (age<15) {
				throw new InvalidAgeException("Sorry, This game is for 15+. you can't play the game");
			}
			else {
				System.out.println("You can play the game. Enjoy!!!!!");
			}
			
		} catch (InvalidAgeException iage) {
			
			
			System.out.println("This is an invalid age.");
		}
		
	}

}
