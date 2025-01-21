package multiThreading_Day_3;

public class Depositer extends Thread
{
	private Account account;

	public Depositer(Account account) 
	{
		super();
		this.account = account;
	}
	
	public void run()
	{
		int[] deposit = {10010,8000,8000};
		for(int i: deposit)
		{
			account.deposit(i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
