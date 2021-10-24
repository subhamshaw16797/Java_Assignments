package exercise1;

public class BankApp {
	
	public static void main(String[] args) {
		
		Person p1= new Person("smith", 24);
		Person p2= new Person("Kathy", 23);
		
		SalaryAccount s1= new SalaryAccount();
		CurrentAccount c1= new CurrentAccount();
		
		s1.createAccount(p1,2000);
		c1.createAccount(p2, 3000);
		
		System.out.println(s1.balance);
		System.out.println(c1.balance);
		
		s1.deposit(2000);
		c1.withdraw(2000);
	}

}
