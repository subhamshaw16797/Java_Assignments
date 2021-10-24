package exercise2;

/*
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console.
 * Initially there is no message shown.
 */

import java.util.Scanner;

public class TrafficLightSimulator {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		// Ask for user input
		System.out.println("1) Red");
		System.out.println("2) Yellow");
		System.out.println("3) Green");
		System.out.println("Please choose a color: ");

		int num = scn.nextInt();

		// Logic to simulate the lights.
		switch (num) {

		case 1:
			System.out.println("Stop");
			break;

		case 2:
			System.out.println("Ready");
			break;

		case 3:
			System.out.println("Go");
			break;

		default:
			System.out.println("Please enter valid number.");
		}

		// Closing of resource.
		scn.close();
	}

}
