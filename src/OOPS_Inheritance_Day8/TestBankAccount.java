package OOPS_Inheritance_Day8;

public class TestBankAccount {

	public static void main(String[] args) 
	{
		SavingAccount s = new SavingAccount(3214, 1000, 8.0);
		s.deposite(5000);
		s.withdraw(1000);
		
		System.out.println("\n==========================================\n");
		System.out.println("Checking account details");
		CheckingAccount  c = new CheckingAccount(3214, 1000);
		c.withdraw(800);
		
	}

}
