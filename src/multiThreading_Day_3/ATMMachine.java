package multiThreading_Day_3;

public class ATMMachine {

	public static void main(String[] args) throws InterruptedException 
	{
		Account a = new Account();
		
		Drawer d1 = new Drawer(a);
		Depositer d2 = new Depositer(a);
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		
		t1.start();
		t2.start();
	}

}
