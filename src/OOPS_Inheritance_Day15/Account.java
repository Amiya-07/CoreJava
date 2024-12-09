package OOPS_Inheritance_Day15;

public class Account 
{
	private String accountNumber;
	private double balance;
	
	public Account(String accountNumber, double balance) 
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public Account()
	{
		super();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public Account generateStatement() 
	{
		System.out.println("Account Number : "+this.accountNumber);
		System.out.println("Balance : "+this.balance);
		 
		return new Account(this.accountNumber,this.getBalance());
	}
	
}
/*
Base Class - Account:

Create a class named Account with the following attributes:
accountNumber (String): Represents the account number.
balance (double): Represents the current balance.
Implement a parameterized constructor to initialize the attributes.
Include getter methods for accountNumber and balance.

Implement methods:
generateStatement() : The generateStatement() method in the Account class serves as a 
generic statement generator for all types of accounts. It prints a message with the 
account number and current balance. The covariant return type is used to return an Account object. 
*/
