package exceptionHandlingDay_5;

public class BankAccount implements Bank
{
	private long bankAccountNumber;
	private double balance;
	
	

	public BankAccount(long bankAccountNumber, double balance) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.balance = balance;
	}

	@Override
	public void deposite(double amount) throws InvalidAmountException
	{
		if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount : Amount can't be Zero or negative");
		}
		else
		{
			this.balance=this.balance+amount;
			System.out.println(amount+" is deposited succesfully to your account");
		}
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException , InvalidAmountException
	{
		if(amount>this.balance)
		{
			throw new InvalidAmountException("Invalid Amount :Withdraw Amount can't be Greater than current balance");
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount :Withdraw Amount can't be Less than Zero");
		}
		else
		{
			this.balance=this.balance-amount;
			System.out.println(amount+" is withdrawed succesfully to your account");
		}
	}

	@Override
	public void transfer( BankAccount toAccount, double amount)  throws InsufficientFundsException, AccountNotFoundException, InvalidAmountException 
	{
		if(toAccount.bankAccountNumber==this.bankAccountNumber)
		{
			throw new AccountNotFoundException("Invalid AccountNumber :Target Account and Source Account Can't be same"); 
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount : Amount can't be Zero or negative");
		}
		else if(amount>this.balance)
		{
			throw new InsufficientFundsException("Invalid Amount : Insufficient Balance");
		}
		else
		{
			this.balance=this.balance-amount;
			toAccount.balance=toAccount.balance+amount;
			System.out.println(amount+" Amount Transfered to "+toAccount.bankAccountNumber+" succesfully");
		}
	}

	@Override
	public void applyForLoan(double amount) throws LoanNotAllowedException, InvalidAmountException
	{
		if(amount>=50000 && this.balance>=50000)
		{
			System.out.println("Congratulation your Loan has Approved");
		}
		else if (amount<50000 || this.balance<50000)
		{
			throw new LoanNotAllowedException("Loan Request rejected");
		}
		else if(amount<=0)
		{
			throw new InvalidAmountException("Invalid Amount : Amount can't be Zero or negative");
		}
	}

	@Override
	public void getBalance()
	{
		System.out.println("Balance is : "+this.balance);
		
	}
	

}
