package multiThreading_Day_3;

public class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}
	
	@Override
	public void run()
	{
		int[] withdraw = {10000,8000,8000};
		for(int i : withdraw)
		{
			account.withdraw(i);
		}
	}
}
