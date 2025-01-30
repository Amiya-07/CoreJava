package multiThreading_Day_5;

public class NormalPriorityThread  extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +" "+ "Priority : "+Thread.currentThread().getPriority());
		Thread.yield();
	}
}
