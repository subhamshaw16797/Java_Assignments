package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeDetails {
	
	String eName;
	int eId;
	double eSalary;
	String eDesignation;
	
	

	EmployeeDetails(String eName, int eId, double eSalary, String eDesignation) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
	}



	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		
		EmployeeDetails emp1= new EmployeeDetails();

	}

}
