package multiThreading_Day_5;

public class ThreadB extends Thread
{
	public void run ()
	{
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
