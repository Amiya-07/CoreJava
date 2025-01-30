package multiThreading_Day_5;

public class LowPriorityThread extends Thread
{

	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" "+ "Priority : "+Thread.currentThread().getPriority());
	}

}
