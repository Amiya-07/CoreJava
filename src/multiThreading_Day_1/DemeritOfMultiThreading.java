package multiThreading_Day_1;

class RailwayReservation extends Thread
{
	private int availableSeat=1;
	private int wantedSeat;
	String name ;

	public RailwayReservation(int wantedSeat)
	{
		super();
		this.wantedSeat = wantedSeat;
	}
	
	
	public synchronized void bookTicket()
	{
		name=Thread.currentThread().getName();
		if(wantedSeat<=0)
		{
			System.err.println("Sorry Invalid ticket input ");
		}
		else if(wantedSeat>availableSeat)
		{
			System.err.println("Sorry "+name+" Insufficeint seats ");
		}
		else
		{
			System.out.println("Congratulation "+name+" Your ticket is Reserved");
			this.availableSeat=this.availableSeat-wantedSeat;
		}
	}
	
	@Override
	public void run()
	{
		bookTicket();
		
	}

	
}

public class DemeritOfMultiThreading 
{

	public static void main(String[] args) throws InterruptedException
	{
		RailwayReservation r = new RailwayReservation(1);
		Thread t = new Thread(r,"Smith");
		t.start();
		
		Thread t1 = new Thread(r,"Scott");
		
		t1.start();
		
	}

}
