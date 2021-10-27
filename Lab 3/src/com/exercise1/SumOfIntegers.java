package com.exercise1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfIntegers {

	public static void main(String[] args) {
		
		int n;
		int sum=0;
		//asking for user input
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter integers: ");
		String str= scn.nextLine();
		
		StringTokenizer st= new StringTokenizer(str);
		System.out.println("All intergers: ");
		
		while(st.hasMoreTokens()) {
			
			String temp= st.nextToken();
			n= Integer.parseInt(temp);
			System.out.print(n+" ");
			sum+= n;
		}
		
		System.out.println();
		System.out.println("Sum of integers is: "+sum);
		
		
		//closing resource
		scn.close();
	}

}
