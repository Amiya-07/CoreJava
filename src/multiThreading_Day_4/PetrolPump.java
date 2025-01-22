package multiThreading_Day_4;

public class PetrolPump 
{
	public synchronized void reFillCar(String carName)
	{
		System.out.println(carName+" is Started refilling...");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(carName+" completed refilling!");
	}
}
