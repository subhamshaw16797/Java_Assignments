package exercise1;

public class Account {
	
	//declaring variables
	private static long accNum=1000;
	static double minBal=500;
	private double balance;
	private String accHolder;
	Person p;
	
	//constructor
	public Account(Person p) {
		this.p=p;
		
	}
	
	//getter & setters
	public static long getAccNum() {
		return accNum;
	}

	public static void setAccNum(long accNum) {
		Account.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person p) {
		this.accHolder = p.getName();
	}
	
	//toString method
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accHolder=" + accHolder + ", p=" + p + "]";
	}
	
	
	//logic for deposit
	public void deposit(double depAmount) {
		this.balance+= depAmount;
		System.out.println("Your total balance is: "+this.balance);
	}
	
	
	//declaring withdraw method for future purpose
	public void withdraw(double withAmount) {
		 
	}
	
	
}
