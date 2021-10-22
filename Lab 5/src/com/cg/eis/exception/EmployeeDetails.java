package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeDetails {
	
	String eName;
	int eId;
	double eSalary;
	
	

	EmployeeDetails(String eName, int eId, double eSalary) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
	}
	
	



	@Override
	public String toString() {
		return "EmployeeDetails [eName=" + eName + ", eId=" + eId + ", eSalary=" + eSalary + ", eDesignation="
				+"]";
	}





	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Enter Your Full Name: ");
		String name= scn.nextLine();
		
		System.out.println("Enter Your Employee ID: ");
		int id= scn.nextInt();
		
		
		System.out.println("Enter Your Salary: ");
		double salary= scn.nextDouble();
		
		try {
			if(salary<3000) {
				throw new InsufficientAmountException("Try to work hard and get pay more..");
			}else {
				EmployeeDetails emp1= new EmployeeDetails(name, id, salary);
				System.out.println(emp1);
			}
			
			
		} catch (InsufficientAmountException iae) {
			System.out.println("Good Luck");
		}
		

	}

}
