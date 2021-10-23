package exercise1;

public class CurrentAccount extends Account{
	
	
	double overDraftLimit=10000;
	String name= this.getAccHolder();
	double balance= this.getBalance();
	static long accountNum= Account.getAccNum();
	
	public CurrentAccount(Person p) {
		super(p);
	}
	
	@Override
	public void withdraw(double withAmount) {
		double checkOverDraft=this.overDraftLimit-withAmount;
		if(checkOverDraft>withAmount) {
			System.out.println("Your overdraft limit reached. You will not able to withdraw.");
		}
		
		else if (this.balance>=withAmount) {
			this.balance-=withAmount;
			this.overDraftLimit=checkOverDraft;
			System.out.println(this.name+" having account number "+CurrentAccount.accountNum+" has remaining balance is:"+this.balance);
		}
		
		else {
			System.out.println("You dont have sufficient balance to withdraw.");
		}
		
	}
	
	
	
}
