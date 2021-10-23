package exercise1;

public class Account {
	
	private static long accNum= (long)(Math.random()* 1000L);
	private double balance;
	private String accHolder;
	
	
	
	
	
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

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(double depAmount) {
		balance+= depAmount;
		System.out.println("Your total balance is: "+balance);
	}
	
	public void withdraw(double withAmount) {
		 if(balance>=withAmount) {
			 balance-=withAmount;
			 System.out.println("Remaining account balance is: "+balance);
		 }
		 else {
			System.out.println("Your don't have sufficient amount to withdraw. your available balance is: "+balance);
		}
	}
	
	
	
}
