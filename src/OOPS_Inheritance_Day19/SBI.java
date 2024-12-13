package OOPS_Inheritance_Day19;

public class SBI implements Bank 
{
	double accountBalance;
	
	public SBI(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	@Override
	public void deposite(double amount)
	{
		this.accountBalance=this.accountBalance+amount;
		System.out.println(amount+" is deposited successfully");
	}

	@Override
	public void withdraw(double amount) 
	{
		this.accountBalance=this.accountBalance-amount;
		System.out.println(amount+" is withdrawed successfully");

	}

	@Override
	public void checkbalance() 
	{
		System.out.println("Available Balance : "+this.accountBalance);

	}

}
