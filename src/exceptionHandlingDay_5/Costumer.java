package exceptionHandlingDay_5;

public class Costumer 
{
	private String name;
	private BankAccount Account;
	public Costumer(String name, BankAccount account) {
		super();
		this.name = name;
		Account = account;
	}
	
	public BankAccount getAccount()
	{
		return Account;
	}
}

/*
name: String: private
account: BankAccount: private //HAS-A

Methods:
Constructor to initialize the customer's name and account.

getAccount(): Returns the customer's bank account.



*/