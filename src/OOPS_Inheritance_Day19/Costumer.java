package OOPS_Inheritance_Day19;

public class Costumer 
{
	String costumerName;
	double balance;
	
	public Costumer(String costumerName, double balance) {
		super();
		this.costumerName = costumerName;
		this.balance = balance;
	}

	public void deposite(Bank bank, double amount)
	{
		Bank b = bank;
		b.deposite(amount);
	}
	
	public void wihdraw(Bank bank, double amount)
	{
		Bank b = bank;
		b.withdraw(amount);
	}
	
	public void checkBalance(Bank bank)
	{
		Bank b = bank;
		b.checkbalance();
	}
}
/*
Attributes: name (String), accountBalance (double)
Methods: deposit(Bank bank, double amount), withdraw(Bank bank, double amount), checkBalance(Bank bank)
Demonstrate the loosely coupled architecture:

Create instances of SBI, HDFC, and ICICI bank classes.
Create a Customer instance.
Allow the customer to interact with each bank:
	*/
