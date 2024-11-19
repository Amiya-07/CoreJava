package OOPS_Inheritance_Day8;

public class CheckingAccount extends BankAccount
{
	double overDraftLimit = 3000;

	public CheckingAccount(int accountNumber, double balance) 
	{
		super(accountNumber, balance);
	}
	
	public void withdraw(double amount )
	{
	    if(amount>super.balance)
	    {
	    	System.err.println("Insufficient balance");
	    	System.out.println("Balance : "+super.balance);
			System.exit(0);
	    }
		else if(amount <= this.overDraftLimit )
		{
			super.balance-=amount;
			System.out.println(amount+" Has been successfully withdrawn");
			System.out.println("Balance : "+super.balance);
		}
		else
		{
			System.err.println("Overdraft Limit Exceeds");
			System.exit(0);
		}
	}
}
/*
CheckingAccount Class:

extends from BankAccount.

Additional Attributes:

double overdraftLimit: Represents the overdraft limit for the checking account.//3000

create Parametrized constructor to initialize Instance Variables

Methods:-

void withdraw(double amount): Subtracts the specified amount from the balance if it does not exceed the overdraft limit(3000); otherwise, prints "Exceeds overdraft limit."
*/