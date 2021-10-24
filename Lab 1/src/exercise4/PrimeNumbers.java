package exercise4;

/*
 * Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
 */
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		primeNum();
	}

	// method for display all the prime number upto the range
	public static void primeNum() {
		Scanner scn = new Scanner(System.in);

		// Asking for user input
		System.out.println("Enter range for prime number: ");
		int n = scn.nextInt();
		System.out.println("Prime numbers between 1 to " + n + " are: ");

		// Logic to find the prime numbers
		for (int i = 1; i <= n; i++) {
			if (i <= 1)
				continue;
			boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}

			// display all the prime number.
			if (flag == true) {
				System.out.print(i + " ");
			}
		}

		// closing the resource.
		scn.close();
	}

}
