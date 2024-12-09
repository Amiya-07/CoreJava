package OOPS_Inheritance_Day15;

public class SavingAccount extends Account
{
	double interestRate;

	public SavingAccount(String accountNumber, double balance, double interestRate) 
	{
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	public SavingAccount()
	{
		super();
	}
	
	@Override
	
	public SavingAccount generateStatement()
	{
		System.out.println("Account Number : "+super.getAccountNumber());
		System.out.println("Balance : "+super.getBalance());
		System.out.println("Interest Rate for this account is : "+this.interestRate +"%");
		
		return new SavingAccount();
	}

}
/*
Subclass - SavingsAccount:

Create a subclass named SavingsAccount that extends the Account class.
Add an additional attribute:
interestRate (double): Represents the interest rate for the savings account.
Implement a parameterized constructor to initialize the attributes of both the Account class and the SavingsAccount class.

Override the generateStatement(): In the SavingsAccount subclass, the generateStatement() 
method is overridden to  prints the account number, current balance, and the interest rate 
for the savings account. It utilizes the covariant return type to return a SavingsAccount object.
*/