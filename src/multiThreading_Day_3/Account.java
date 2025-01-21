package multiThreading_Day_3;

public class Account 
{
	private  int balance=0;
	
	public synchronized void withdraw(int amount)//2000
	{
		while(this.balance<amount)
		{
			try 
			{
				wait(1000);
			} 
			catch (InterruptedException e) 
			{
					e.printStackTrace();
			}
		}
		this.balance=this.balance-amount;
		System.out.println(amount+" rupees Withdraw successfully ");
		System.out.println("After withdraw balance is : "+this.balance);
		notifyAll();
	}
	
	public synchronized void deposit(int amount)
	{
		this.balance = this.balance+amount;
		System.out.println(amount+" rupees deposited successfully");
		notifyAll();
	}
}
