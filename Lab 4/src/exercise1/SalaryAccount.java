package exercise1;

public class SalaryAccount extends Account{
	
	//variables
	static final double MINIMUM_BALANCE=500;
	String name= this.getAccHolder();
	double balance= this.getBalance();
	static long accNum= Account.getAccNum();
	
	//constructor
	public SalaryAccount(Person p) {
		super(p);
	}
	
	
	//Overridden method from account class
	@Override
	public void withdraw(double withAmount) {
		double checkBal= this.balance-withAmount;
		if(this.balance>=withAmount && checkBal< MINIMUM_BALANCE) {
			 this.balance-=withAmount;
			 System.out.println(this.name+" having account number "+SalaryAccount.accNum+" has remaining balance is:"+this.balance);
		 }
		 else {
			System.out.println("Your don't have sufficient amount to withdraw. your available balance is: "+this.balance);
		}
	}
}
