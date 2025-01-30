package multiThreading_Day_5;

public class MainThread 
{
	public static void main(String[] args)
	{
		ThreadA a = new ThreadA();
		
		Thread t1 = new Thread(a,"first");
		ThreadB b = new ThreadB();
		Thread t2 = new Thread(b,"Second");
		
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		t2.start();
	}
}
