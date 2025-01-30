package multiThreading_Day_5;

public class TestPriority {

	public static void main(String[] args) 
	{
		HighPriorityThread hp = new HighPriorityThread();
		LowPriorityThread lp = new LowPriorityThread();
		NormalPriorityThread np = new NormalPriorityThread();
		
		Thread t1 = new Thread(hp,"High");
		Thread t2 = new Thread(lp,"Low");
		Thread t3 = new Thread(np,"Norm");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
