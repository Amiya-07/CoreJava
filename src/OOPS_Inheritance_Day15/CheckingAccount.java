package OOPS_Inheritance_Day15;

public class CheckingAccount extends Account
{
	double overDraftLimit;

	public CheckingAccount(String accountNumber, double balance, double overDraftLimit) 
	{
		super(accountNumber, balance);
		this.overDraftLimit = overDraftLimit;
	}
	
	public CheckingAccount()
	{
		super();
	}
	
	@Override
	public CheckingAccount generateStatement()
	{
		System.out.println("Account Number : "+super.getAccountNumber());
		System.out.println("Balance : "+super.getBalance());
		System.out.println("Over Draft Limit for this Account is : "+this.overDraftLimit);
		
		return new CheckingAccount();
	}
}
/*
Subclass - CheckingAccount:

Create a subclass named CheckingAccount that extends the Account class.
Add an additional attribute:
overdraftLimit (double): Represents the overdraft limit for the checking account.

Implement a parameterized constructor to initialize the attributes of both the 
Account class and the CheckingAccount class.

Override the generateStatement(): Similarly, in the CheckingAccount subclass,
 the generateStatement() method is overridden to prints the account number, 
 current balance, and the overdraft limit for the checking account. It also utilizes
  the covariant return type to return a CheckingAccount object.
*/
