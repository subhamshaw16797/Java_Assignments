package com.exercise1;

public class SavingsAccount extends Account{
	
	//variables
	static final double MINIMUM_BALANCE=500;
	String name= this.getAccHolder();
	double balance= this.getBalance();
	Person p;
	
	public SavingsAccount() {
		super();
	}
	
	//constructor
	public SavingsAccount(Person p) {
		super(p);
	}
	
	
	//toString method
	@Override
	public String toString() {
		return "SalaryAccount [name=" + name + ", balance=" + balance + "]";
	}
	

	// Overridden method from account class
	@Override
	public void withdraw(double withAmount) {
		double checkBal = this.balance - withAmount;
		if (checkBal <= MINIMUM_BALANCE) {
			System.out.println(
					"This process can't be completed. You must have the minimum balance of 500 in your account.Your current balance is: "
							+ this.balance);
		}

		else if (this.balance >= withAmount) {
			this.balance -= withAmount;
			System.out.println(p.getName()+ " having account number has remaining balance is:" + this.balance);
		} else {
			System.out.println(
					"Your don't have sufficient amount to withdraw. your available balance is: " + this.balance);
		}
	}
	
	
	//create account method
	public void createAccount(Person p, double initBal) {
		this.balance=initBal;
		long accNum= getAccNum()+1;
		System.out.println("Your account name is: "+p.getName()+" ,your account number is: "+accNum+" and your balance is: "+this.balance);
	}
	
}