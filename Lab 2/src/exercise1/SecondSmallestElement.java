package exercise1;

import java.util.Scanner;

public class SecondSmallestElement {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		//to take size of the array from user
		System.out.println("Enter the size of an array: ");
		int length= scn.nextInt();
		
		int[] arr= new int[length];
		System.out.println("Enter "+length+" elements in array: ");
		
		for(int i=0; i<length; i++)  
		{  
			//reading array elements from the user 
			arr[i]=scn.nextInt();  
		}  

	}

}
